package javaApp5.ch17.sec04;

import java.util.ArrayList;
import java.util.List;

public class StreamEx06 {

	public static void main(String[] args) {		
		
		List<Student> sList = new ArrayList<>();
		sList.add(new Student("홍길동", 30));
		sList.add(new Student("신용권", 10));
		sList.add(new Student("유미선", 20));
		
		
		sList.stream().sorted().forEach(p->System.out.println(p.getName()+" "+p.getScore()));
		
	}

}


class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		Integer s =Integer.valueOf(score);
		Integer os = Integer.valueOf(o.getScore());
		return s.compareTo(os);
	}
}