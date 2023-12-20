package javaApp1.ch12.sec01;

public class ObjectEx extends Object {

	public static void main(String[] args) {
		// Object�� �޼Ҵ� ��� Ŭ�������� �� �� �� �ִ�. (�������� �� �ִ�..-)__(-
		Member obj1 = new  Member("blue");
		Member obj2 = new  Member("blue");
		Member obj3 = new  Member("red");
		if(obj1==obj2) { // obj1�� �ּҿ� obj2 �ּҰ� ������ ����� �� (��: �ּҴ� �ٸ���)
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

		if(obj1.equals(obj2)) { 
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if(obj1.equals(obj3)) { 
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}

class Member{
	public String id;
	public String passWord;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(this.id.equals(m.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode () {
		return 0;
		}
}
