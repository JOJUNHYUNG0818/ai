package javaApp5.ch17.sec07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReductionEx {

	public static void main(String[] args) {
		
		List<Student> totalList = new ArrayList<>();

		totalList.add(new Student("홍길동","남",92));
		totalList.add(new Student("김수영","여",87));
		totalList.add(new Student("감자바","남",92));
		totalList.add(new Student("오해영","여",93));
		
		// 남학생만 리스트
		List<Student> maleList=totalList.stream()
				.filter(t->t.getSex().equals("남"))
				.collect(Collectors.toList() );
		for(Student s : maleList) {
			System.out.println(s.getName()+" "+s.getScore());
		}
		

	}

}


class Student{
	private String name;
	private String sex;
	private Integer score;
	
	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public Integer getScore() {
		return score;
	}

	public Student(String name, String sex, Integer score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
}