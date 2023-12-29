package javaApp5.ch17.sec05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx06 {

	public static void main(String[] args) {		
		
		List<Student> sList = new ArrayList<>();
		sList.add(new Student("홍길동", 30));
		sList.add(new Student("신용권", 10));
		sList.add(new Student("유미선", 20));
		
		
		sList.stream().sorted(new StudentCom()).forEach(p->System.out.println(p.getName()+" "+p.getScore()));
		
	}

}


class Student{
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
}

class StudentCom implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		Integer s = Integer.valueOf(o1.getScore());
		Integer v = Integer.valueOf(o2.getScore());
		return s.compareTo(v);
	}
}