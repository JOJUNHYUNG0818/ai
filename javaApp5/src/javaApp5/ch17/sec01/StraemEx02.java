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
			Production production = new Production(i, "��ǰ"+i, "���� ȸ��", (int)(10000*Math.random()));
			list.add(production);
		}
		
		Stream<Production> productionStream = list.stream();
		productionStream.forEach(p-> System.out.println(p));

		// ���̸�
		//list.stream().forEach(p->System.out.println(p));
		
		String[] strArr = {"ȫ�浿","�ſ��","��̳�"};
		Stream<String> streamStr = Arrays.stream(strArr); // �迭�� �������� ��Ʈ������ ����
		streamStr.forEach(p->System.out.println(p));
		
		streamStr = Arrays.stream(strArr);
		streamStr.filter(t->t.startsWith("ȫ")).forEach(p->System.out.println(p));
		
		// ���� ������ ��Ʈ�� ���
		// �䱸���� 1~100���� �� ���ϱ�
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
