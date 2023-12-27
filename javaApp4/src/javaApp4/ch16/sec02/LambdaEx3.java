package javaApp4.ch16.sec02;

public class LambdaEx3 {
	public static void main(String[] args) {
		
		
		College<String> s1 =  (name) ->name +"대학교";
		System.out.println(s1.cName("서울"));
		System.out.println(s1.cName("인천"));
		
		College<String> s2 = (name) ->name +" 사세요";
		System.out.println(s2.cName("사과"));
		System.out.println(s2.cName("배"));
		
		College<Integer> s3 = (name) -> {
		if(name>=3000) {
		System.out.println("비싸요");}
		else
		System.out.println("싸요");
		return 0; // *아무 의미없음
		};
		
		s3.cName(4000);
		s3.cName(1000);
		
	}
}


interface College<T>{
	T cName(T name);
}