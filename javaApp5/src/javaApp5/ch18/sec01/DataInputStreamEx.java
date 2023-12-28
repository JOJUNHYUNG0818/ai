package javaApp5.ch18.sec01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputStreamEx {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("D:\\ai\\study\\java_study\\data\\p.db");
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("È«±æµ¿");
			dos.writeDouble(90.3);
			dos.writeInt(1);
			
			dos.writeUTF("±èÀÚ¹Ù");
			dos.writeDouble(90.3);
			dos.writeInt(2);
			
			dos.flush();
			dos.close();
			
			InputStream is = new FileInputStream("D:\\ai\\study\\java_study\\data\\p.db");
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);
			
			String name = dis.readUTF();
			double score = dis.readDouble();
			int num = dis.readInt();
			System.out.println(name+" "+score+" "+num);
			
			name = dis.readUTF();
			score = dis.readDouble();
			num = dis.readInt();
			System.out.println(name+" "+score+" "+num);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
