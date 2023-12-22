package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		Set<Member> memSet = new HashSet<Member>();
		
		Member member1 = new Member("홍길동1", 25);
		Member member2 = new Member("홍길동2", 30);
		Member member3 = new Member("홍길동3", 35);
		Member member4 = new Member("홍길동4", 40);
		Member member5 = new Member("홍길동1", 40);
		
		memSet.add(member1);
		memSet.add(member2);
		memSet.add(member3);
		memSet.add(member4);
		
		Iterator<Member> iter = memSet.iterator();
		System.out.println(iter.next().age);
		System.out.println(iter.next().age);
		System.out.println(iter.next().age);
		System.out.println(iter.next().age);
		System.out.println(memSet.size());
		
		iter = memSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		
		
		
		
		

	}

}

class Member{
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(name.equals(m.name)&&age == m.age)
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		Integer ageI = Integer.valueOf(age); // 기본형 int age를 클래스형 Integer로 바꿈
		return name.hashCode() + ageI.hashCode(); // 개발자 마음대로
	}
	
	@Override
	public String toString() {
		
		return name+ " "+ age;
	}
	
}