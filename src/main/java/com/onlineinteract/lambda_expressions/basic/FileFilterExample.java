package com.onlineinteract.lambda_expressions.basic;

import java.io.File;
import java.io.FileFilter;

public class FileFilterExample {

	public static void oldExampleUsingAnonymousClass() {
		FileFilter filter = new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".exe");
			}
		};

		File dir = new File("c:\\programs");

		File[] listFiles = dir.listFiles(filter);

		for (File file : listFiles) {
			System.out.println(file.getAbsolutePath());
		}
	}
	
	public static void newExampleUsingLambdaExpression() {
		
		// Here is out Lambda
		FileFilter filter = (File file) -> file.getName().endsWith(".exe");

		File dir = new File("c:\\programs");

		File[] listFiles = dir.listFiles(filter);

		for (File file : listFiles) {
			System.out.println(file.getAbsolutePath());
		}
	}

	public static void main(String[] args) {
		newExampleUsingLambdaExpression();
//		oldExampleUsingAnonymousClass();
	}
}
