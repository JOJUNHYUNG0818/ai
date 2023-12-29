package javaApp5.ch17.sec01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		// ��Ʈ�� - �帣��
		
		
		// 1�ܰ� �÷��� ����
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)); 
		
		// 2�ܰ� �������� ��Ʈ�� ����
		Stream<Student> studentStream = list.stream();
		
		// 3�ܰ� �߰��ܰ� (����.���ε�)
		IntStream scoreStream =  studentStream.mapToInt(Student->Student.getScore());
		
		// 4�ܰ� ����ó�� 
		double avg = scoreStream.average().getAsDouble();
		
		System.out.println(avg);


		
		
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