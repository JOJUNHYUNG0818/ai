package javaApp5.ch18.sec01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx02 {

	public static void main(String[] args) {
		
		try {
			Reader r = new FileReader("D:\\ai\\study\\java_study\\data\\test2.txt");
			char[] cArr = new char[100];
			while (true) {
				int data = r.read(cArr);
				if(data==-1) break;
				for(int i=0; i<data; i++) {
					 System.out.println((char)cArr[i]);
				}
				
			}
	
			r.close();
			Writer w = new FileWriter("D:\\ai\\study\\java_study\\data\\test4.txt");
			
			w.write("abcdef");
			w.write(cArr);
			w.write(10);
			w.write(65);
			
			w.flush();
			w.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
