package javaApp5.ch18.sec01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterExo1 {

	public static void main(String[] args) {
		
	 	try {
			OutputStream os = new FileOutputStream("D:\\ai\\study\\java_study\\data\\test2.txt");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			byte[] bArr = {100,127,-123};
			
			
			os.write(a);
			os.write(b);
			os.write(c);
			os.write(bArr);
			
			
			// 버퍼 메모리 : 임시 기억장치(ctrl c 했을때 저장되는 메모리공간)
			os.flush(); // 버퍼 메모리에 담겨 있는 내용을 모두 출력
			os.close(); // 파일 사용 닫기
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
