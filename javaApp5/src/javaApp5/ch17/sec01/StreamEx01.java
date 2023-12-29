package javaApp5.ch17.sec01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		// 스트림 - 흐르다
		
		
		// 1단계 컬렉션 생성
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)); 
		
		// 2단계 오리지날 스트림 생성
		Stream<Student> studentStream = list.stream();
		
		// 3단계 중간단계 (필터.매핑등)
		IntStream scoreStream =  studentStream.mapToInt(Student->Student.getScore());
		
		// 4단계 최종처리 
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