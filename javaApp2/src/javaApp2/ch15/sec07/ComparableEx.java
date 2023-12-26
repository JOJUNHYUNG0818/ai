package javaApp2.ch15.sec07;

import java.util.TreeSet;

public class ComparableEx {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 45);
		Person p2 = new Person("���ڹ�", 60);
		Person p3 = new Person("������", 31);
		
		TreeSet<Person> tP = new TreeSet<Person>();
		tP.add(p1);
		tP.add(p2);
		tP.add(p3);
		
		System.out.println(tP);

		
		
		
	}

}


class Person implements Comparable<Person>{
	String name;
	Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name +" "+ age;
	}

//	@Override
//	public int compareTo(Person o) {
//		int result = name.compareTo(o.name); // String Ŭ�������� �˾Ƽ� �񱳸� ���ش�.
//		
//		return result;
//	}
	@Override
	public int compareTo(Person o) {
		int result = age.compareTo(o.age);
		return result;
	}
	
	

}

