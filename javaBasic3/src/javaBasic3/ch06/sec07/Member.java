package javaBasic3.ch06.sec07;

public class Member {
	
	String name;
	String id;
	String password;
	int age;
	
	public Member(String string, String string2) {
		this.name=string;
		this.id = string2;
	}
	
	boolean login(String id, String password)
	{
		if(id.equals("hong")&&password.equals("12345"))
		{
			return true;
		}
		else if (id.equals("±è")&&password.equals("3456"))
		{
			return true;
		}
		
		else return false;
			
	}
	

}
