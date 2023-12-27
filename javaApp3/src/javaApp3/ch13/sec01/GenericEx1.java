package javaApp3.ch13.sec01;

public class GenericEx1 {
	public static void main(String[] args) {

//      -------------------------------------------------------------------------
//		static void registerCourse1(Applicant<?> applicant)
		
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
//      -----------------------------------------------------------------------
//   	static void registerCourse2(Applicant<? extends Student> applicant)
		
		//Course.registerCourse2(new Applicant<Person>(new Person()));
		//Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
//      -----------------------------------------------------------------------
//       static void registerCourse3(Applicant<? super Worker> applicant)		
		
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<Student>(new Student()));
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		
		
		
	}

}

class Person{
	
}

class Worker extends Person{
	
}

class Student extends Person{
	
}

class HighStudent extends Student{
	
}

class MiddleStudent extends Student{
	
}

class Applicant<T>{
	T kind;

	public Applicant(T kind) {
		this.kind = kind;
	}
	
}
class Course{
	static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course1을 등록함");
	}
	
	static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course2을 등록함");
	}
	static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course3을 등록함");
	}

}

