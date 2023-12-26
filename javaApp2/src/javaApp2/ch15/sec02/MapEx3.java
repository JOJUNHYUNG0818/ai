package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		
		Member m1 = new Member("a100", 123);
		Member m2 = new Member("a200", 234);
		Member m3 = new Member("a300", 345);
		Member m4 = new Member("a400", 567);
		// Map 키는 1 값은 m1,
		HashMap<Integer, Member> hM= new HashMap<Integer, Member>();
		
		hM.put(1, m1);
		hM.put(2, m2);
		hM.put(3, m3);
		hM.put(4, m4);
		
		System.out.println(hM.get(1));
		
		System.out.println(hM.keySet());
		Set<Integer> keys = hM.keySet();
		Iterator<Integer> iter = keys.iterator();
		while (iter.hasNext()) {
			//System.out.println(iter.next()); 키값 출력
			Integer itKey =  iter.next();
			System.out.println(itKey+" "+hM.get(itKey));
			}
		
		// Map 예제 키 - id 값 pwd
		HashMap<Member, Integer> hM2 = new HashMap<Member, Integer>();
		hM2.put(m1, m1.pwd);
		hM2.put(m2, m2.pwd);
		hM2.put(m3, m3.pwd);
		hM2.put(m4, m4.pwd);
		
		System.out.println(hM2.get(m1+"~~")); 
		
		Member m5 = new Member("a400", 567); // 중복 x
		hM2.put(m5, m5.pwd);
		
		Member m6 = new Member("a400", 568); // 중복 o (해쉬코드)
		hM2.put(m6, m6.pwd);
		
		
		System.out.println(hM2.size());
		
		
		

	}

}


class Member{
	String id;
	Integer pwd;
	
	public Member(String id, Integer pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.id.equals(member.id)&&this.pwd.equals(member.pwd)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return id.hashCode()+pwd.hashCode() ;
	}
	
@Override
	public String toString() {
	
		return id+" "+pwd;
	}
	
}