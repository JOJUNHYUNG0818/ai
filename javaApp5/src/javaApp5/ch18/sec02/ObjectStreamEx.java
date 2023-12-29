package javaApp5.ch18.sec02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class ObjectStreamEx {

	public static void main(String[] args) {
		// Member Ŭ������ ���¸� ��Ʈ������ ���� �ܺη� ������
		try {
			//-------------------------------------------------------------------------------------------------------------------------- ���
			OutputStream os = new FileOutputStream("D:\\ai\\study\\java_study\\data\\member.dat");
			BufferedOutputStream bos = new BufferedOutputStream(os);
			ObjectOutputStream oos = new ObjectOutputStream(bos); // ��ü�� ��Ʈ������ �����
			// ObjectOutputStream�� �Ϸ��� Member ��ü�� implements Serializable(����ȭ) �ؾ��Ѵ�
			
			Member m1 = new Member("fall", "��ǳ��", 10);
			
			oos.writeObject(m1);
			oos.flush();
			oos.close();
			
			//--------------------------------------------------------------------------------------------------------------------------�Է�
			InputStream is = new FileInputStream("D:\\ai\\study\\java_study\\data\\member.dat");
			BufferedInputStream bis = new BufferedInputStream(is);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			Member m2 = (Member)ois.readObject();
			System.out.println(m2.age);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

class Member implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5413711528933648809L; // �ʵ尡 �߰��ǵ� ���������� �ʰ� UID����
	String id;
	String name;
	int age;
	//int point; // output�� ���� input�� ���� ��� ���� (�ذ���: �ø��� ��ȣ ����)
	
	
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return id+" "+name+" "+age;
	}
}
