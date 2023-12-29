package javaApp5.ch18.sec03;

import java.io.*;

public class FileEx01 {

	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\ai\\study\\java_study\\data\\images");
		File file1 = new File("D:\\ai\\study\\java_study\\data\\file1.txt");
		File file2 = new File("D:\\ai\\study\\java_study\\data\\file2.txt");
		File file3 = new File("D:\\ai\\study\\java_study\\data\\file3.txt");
		
				
		if(dir.exists()==false) {dir.mkdirs();}
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file2.createNewFile();}
		if(file3.exists()==false) {file3.createNewFile();}
		
		

	}

}
