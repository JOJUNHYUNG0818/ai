package javaApp5.ch18.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderEx01 {

	public static void main(String[] args) {
		//입력 스트림
		try {
			InputStream IS = new FileInputStream("D:\\ai\\study\\java_study\\data\\st.jpg");
			OutputStream OS = new FileOutputStream("D:\\ai\\study\\java_study\\data\\st_copy.jpg");
			
			byte[] bArr = new byte[100]; // 100바이트에 배열 생성
			byte[] wArr = new byte[100];
			
			while(true) {
				int data = IS.read(); // 
				if(data==-1) break; // -1은 데이터가 끝이라는 의미
				 OS.write(data);
			}
			IS.close();
			OS.flush();
			OS.close();
			
			
		}
			catch (IOException e) {
			e.printStackTrace();
		}

	}

}
