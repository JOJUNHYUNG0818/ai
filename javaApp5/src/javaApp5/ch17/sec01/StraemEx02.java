package javaApp5.ch17.sec01;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StraemEx02 {

	public static void main(String[] args) throws Exception {
		
		List<Production> list = new ArrayList<Production>();
		
		for(int i=1; i<=5;i++) {
			Production production = new Production(i, "상품"+i, "멋진 회사", (int)(10000*Math.random()));
			list.add(production);
		}
		
		Stream<Production> productionStream = list.stream();
		productionStream.forEach(p-> System.out.println(p));

		// 줄이면
		//list.stream().forEach(p->System.out.println(p));
		
		String[] strArr = {"홍길동","신용권","김미나"};
		Stream<String> streamStr = Arrays.stream(strArr); // 배열이 오리지날 스트림으로 변경
		streamStr.forEach(p->System.out.println(p));
		
		streamStr = Arrays.stream(strArr);
		streamStr.filter(t->t.startsWith("홍")).forEach(p->System.out.println(p));
		
		// 숫자 범위로 스트림 얻기
		// 요구사항 1~100까지 합 구하기
		IntStream is = IntStream.range(1, 101);
		System.out.println(is.count());
		is = IntStream.range(1, 101);
		System.out.println( is.max().toString());

	
	}

}

class Production{
	
	private int pro;
	private String name;
	private String company;
	private int price;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pro+" "+name+" "+company+" "+price;
	}
	public Production(int pro, String name, String company, int price) {
		super();
		this.pro = pro;
		this.name = name;
		this.company = company;
		this.price = price;
	}


	public int getPro() {
		return pro;
	}


	public String getName() {
		return name;
	}


	public String getCompany() {
		return company;
	}


	public int getPrice() {
		return price;
	}
	
	
}
