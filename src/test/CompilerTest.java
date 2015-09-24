package test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import compiler.Main;
import jasmin.ClassFile;

public class CompilerTest {

	private Path tempDir;

	@BeforeMethod
	public void createTempDir() throws IOException {
		tempDir = Files.createTempDirectory("compilerTest");
	}
	
	@AfterMethod
	public void deleteTempDir() {
		deleteRecursive(tempDir.toFile());
	}
	
	private void deleteRecursive(File file) {
		if(file.isDirectory()) {
			for(File child : file.listFiles()) {
				deleteRecursive(child);
			}
			file.delete();
		} else {
			file.delete();
		}
		
	}
	
	@DataProvider
	public Object[][] provideCode() {
		return new Object[][] {
			{"1+3-2", "2"},
			{"(3+3)/(1+1)", "3"},
			{"2*(4+8)/12", "2"},
			{"-5", "-5"},
			{"-(3*(1+4)/5)", "-3"},
			{"1-5*3", "-14"},
			{"1+1", "2"},
			{"(2+3)/(6-1)", "1"},
			{"13+5*2", "23"}
		};
	}

	@Test(dataProvider = "provideCode")
	public void expectedOutputText(String code, String expectedText) throws Exception {
		String actualOut = compileAndRun(code);

		System.out.println("Actual: " + actualOut + "\t Expected: " + expectedText);

		Assert.assertEquals(actualOut, expectedText);
	}

	private String compileAndRun(String code) throws Exception {
		code = Main.compile(new ANTLRInputStream(code));
		//System.out.println(code);
		ClassFile classFile = new ClassFile();
		classFile.readJasmin(new StringReader(code), "", false);
		Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
		classFile.write(Files.newOutputStream(outputPath));

		return runJavaClass(tempDir, classFile.getClassName());
	}

	private String runJavaClass(Path dir, String className) throws IOException {
		Process process = Runtime.getRuntime().exec(new String[] { "java", "-cp", dir.toString(), className });
		try (InputStream in = process.getInputStream()) {
			return new Scanner(in).next();
		}
	}

	
}
