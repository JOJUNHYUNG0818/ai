package javaApp5.ch17.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx05 {

	public static void main(String[] args) {
		// 중간 스트림 익히기2
		
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");
		
		// 요구사항 문장을 넣어서 " "으로 된 부분을 잘라서 단어를 출력하기
		list1.stream().flatMap(t->Arrays.stream(t.split(" "))).forEach(s->System.out.println(s));
		
		List<String> list2 = Arrays.asList("10,20,30","40,50");
		double result =list2.stream().flatMapToDouble(t->{
					String[] ss =t.split(",");
					double[] intArr = new double[ss.length];
					for(int i = 0; i<ss.length; i++) {
						intArr[i] = Double.parseDouble(ss[i].trim());
					}
					return Arrays.stream(intArr);
					
		}).sum();
		System.out.println(result);
	
	}

}
