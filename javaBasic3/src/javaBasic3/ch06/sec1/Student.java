package javaBasic3.ch06.sec1;

public class Student {
	
	String schoolNum;
	String name;
	
	// »ý¼ºÀÚ
	public Student(String schoolNum,String name) {
		
		this.schoolNum =schoolNum;
		this.name=name;

	}
	

	public Student() {
	}


	public String getSchoolNum() {
		return schoolNum;
	}

	public void setSchoolNum(String schoolNum) {
		this.schoolNum = schoolNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int sum(int x, int y)
	{
		int result = x+y;
		return result;
	}



	

}
