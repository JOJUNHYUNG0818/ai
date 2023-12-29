package javaApp5.ch17.sec07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReductionEx {

	public static void main(String[] args) {
		
		List<Student> totalList = new ArrayList<>();

		totalList.add(new Student("ȫ�浿","��",92));
		totalList.add(new Student("�����","��",87));
		totalList.add(new Student("���ڹ�","��",92));
		totalList.add(new Student("���ؿ�","��",93));
		
		// ���л��� ����Ʈ
		List<Student> maleList=totalList.stream()
				.filter(t->t.getSex().equals("��"))
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