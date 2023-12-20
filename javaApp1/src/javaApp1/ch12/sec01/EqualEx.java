package javaApp1.ch12.sec01;

public class EqualEx {

	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println(name.hashCode());
		String name1 = "이순신";
		System.out.println(name1.hashCode());
		String name2 = "홍길동";
		System.out.println(name2.hashCode());
		
		String name4 = new String("최재우");
		System.out.println(name4.hashCode());
		
		String name5 = new String("최재우");
		System.out.println(name5.hashCode());
		
		Student s1 = new Student("a123", "p123");
		System.out.println(s1.hashCode());
		Student s2 = new Student("a123", "p1234");
		System.out.println(s2.hashCode());
		
		if(s1.equals(s2)) {
			System.out.println("같은사람");
		}
		else {
			System.out.println("다른사람");
		}
		
	}

}




class Student{
	String id;
	String pwd;
	
	public Student(String id , String pwd) {
		this.id = id;
		this.pwd=pwd;
	}
	@Override
	public int hashCode () {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj; // Object형을 Student 형으로 바꿈
			if(this.id.equals(st.id)&&this.pwd.equals(st.pwd)) {
				//this.id 첫번째 객체의 "a123"이 있음 st.id는 두번째 객체의 "a123"
				//this.pwd 첫번째 객체의 "p1234"이고 st.id 두번째 객체의 "p1235"
				return true;
			}
		}
		
		return false;
	}
}