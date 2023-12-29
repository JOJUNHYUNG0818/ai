package javaApp5.ch17.sec01;

import java.util.ArrayList;
import java.util.List;

public class StreamEx04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("�ſ��");
		list.add("�Ź�ö");
		
		
		// �ߺ�����
		list.stream().distinct().forEach(n->System.out.println(n) );
		System.out.println();
		
		// "��"���� �̱�
		
		list.stream().filter(n->n.startsWith("��")).forEach(n->System.out.println(n));
		System.out.println();
		
		
		
		List<Student1> stList = new ArrayList<>();
		stList.add(new Student1("ȫ�浿1", 85, "010-123-1234"));
		stList.add(new Student1("ȫ�浿2", 92, "010-123-1235"));
		stList.add(new Student1("ȫ�浿3", 87, "010-123-1236"));
		stList.add(new Student1("ȫ�浿4", 95, "010-123-1237"));
		
		stList.stream().mapToInt(s->s.getScore()).forEach(p->System.out.println(p));
		
	}
}


class Student1{
	
	private String name;
	private int score;
	private String phone;
	
	public Student1(String name, int score, String phone) {
		super();
		this.name = name;
		this.score = score;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public String getPhone() {
		return phone;
	}
	
}