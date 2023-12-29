package javaApp5.ch17.sec01;

import java.util.ArrayList;
import java.util.List;

public class StreamEx04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("È«±æµ¿");
		list.add("½Å¿ë±Ç");
		list.add("°¨ÀÚ¹Ù");
		list.add("½Å¿ë±Ç");
		list.add("½Å¹ÎÃ¶");
		
		
		// Áßº¹Á¦°Å
		list.stream().distinct().forEach(n->System.out.println(n) );
		System.out.println();
		
		// "½Å"¾¾¸¸ »Ì±â
		
		list.stream().filter(n->n.startsWith("½Å")).forEach(n->System.out.println(n));
		System.out.println();
		
		
		
		List<Student1> stList = new ArrayList<>();
		stList.add(new Student1("È«±æµ¿1", 85, "010-123-1234"));
		stList.add(new Student1("È«±æµ¿2", 92, "010-123-1235"));
		stList.add(new Student1("È«±æµ¿3", 87, "010-123-1236"));
		stList.add(new Student1("È«±æµ¿4", 95, "010-123-1237"));
		
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