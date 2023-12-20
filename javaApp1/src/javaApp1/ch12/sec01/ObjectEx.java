package javaApp1.ch12.sec01;

public class ObjectEx extends Object {

	public static void main(String[] args) {
		// Object의 메소는 모든 클래스들이 다 쓸 수 있다. (재정의할 수 있다..-)__(-
		Member obj1 = new  Member("blue");
		Member obj2 = new  Member("blue");
		Member obj3 = new  Member("red");
		if(obj1==obj2) { // obj1의 주소와 obj2 주소가 같은지 물어보는 것 (답: 주소는 다르다)
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
