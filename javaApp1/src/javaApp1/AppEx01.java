package javaApp1;

import java.lang.module.ModuleDescriptor;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AppEx01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String a = "abcde";
		int aHashCode = a.hashCode();
		System.out.println(aHashCode);
		double pi = Math.PI;
		System.out.println(pi);
		double e = Math.E;
		System.out.println(e);
		double cos =Math.cos(45.0);
		System.out.println(cos);
		Date date = new Date();
		int da = date.getDate();
		System.out.println(da);
		long da1 = date.getTime();
		System.out.println(da1);
		long da2 =Date.parse("2023/12/19");
		System.out.println(da2);
		//DateFormat.parse("2023/12/19");
		String text = "ab/cd/ef";
		StringTokenizer strToken = new StringTokenizer("ab/cd/ef","/");
		int count = strToken.countTokens();
		System.out.println(count);
		String token = strToken.nextToken();
		System.out.println(token);
		token =strToken.nextToken();
		System.out.println(token);
		
		// ModuleDescriptor md = new ModuleDescriptor();
		
		
	}

}
