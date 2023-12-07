package javaBasic3.ch06.sec1;

public class Å¬·¡½º°³³ä {


	public static void main(String[] args) {

		Student student = new Student("201632072","Á¶ÁØÇü");
		
		System.out.println(student.schoolNum);
		System.out.println(student.name);
		System.out.println(student.sum(10,20));
		student.setName("ÀÓÇö¼º");
		System.out.println(student.getName());
		
		Student st = new Student();
		Student st2 = new Student();
		
		st.setName("±èÈñÁß");
		st.setSchoolNum("201632001");
		
		st2.setName("³²À±Áø");
		st2.setSchoolNum("201632007");
		
		System.out.println(st.getName()+" "+student.getName()+" "+st2.getName());
		
		Teacher tc2 = new Teacher();
		
		
		

		
		
	}

}
