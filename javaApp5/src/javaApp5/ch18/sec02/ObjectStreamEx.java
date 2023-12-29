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
		// Member 클래스의 형태를 스트림으로 만들어서 외부로 보내기
		try {
			//-------------------------------------------------------------------------------------------------------------------------- 출력
			OutputStream os = new FileOutputStream("D:\\ai\\study\\java_study\\data\\member.dat");
			BufferedOutputStream bos = new BufferedOutputStream(os);
			ObjectOutputStream oos = new ObjectOutputStream(bos); // 객체를 스트림으로 만들기
			// ObjectOutputStream를 하려면 Member 객체를 implements Serializable(직렬화) 해야한다
			
			Member m1 = new Member("fall", "단풍이", 10);
			
			oos.writeObject(m1);
			oos.flush();
			oos.close();
			
			//--------------------------------------------------------------------------------------------------------------------------입력
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
	private static final long serialVersionUID = -5413711528933648809L; // 필드가 추가되도 문제생기지 않게 UID설정
	String id;
	String name;
	int age;
	//int point; // output때 없다 input에 넣을 경우 에러 (해결방법: 시리얼 번호 생성)
	
	
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
