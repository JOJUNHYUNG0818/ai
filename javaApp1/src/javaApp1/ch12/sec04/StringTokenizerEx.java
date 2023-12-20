package javaApp1.ch12.sec04;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		String data1 = "홍길동&이수홍,박연수";
		
		String[] arr = data1.split("&|,");
		for (int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		for(String i :arr) {
			System.out.println(i);
		}
		
		String data2 = "홍길동/이수홍/박연수/이순신/최수진";
		StringTokenizer strT =  new StringTokenizer(data2,"/");
		while(strT.hasMoreTokens()) {
			System.out.println(strT.nextToken());
		}
		
		String data3 = "사과-배-귤-바나나-포도";
		
		StringTokenizer strT2 = new StringTokenizer(data3,"-");
		while(strT2.hasMoreTokens()) {
			System.out.print(strT2.nextToken()+" "); 
		}
		System.out.println();
		
		String data4 = "자바*+파이썬*+오라클*+텐세플로어";
		
		StringTokenizer strT3 = new StringTokenizer(data4,"*|+");
		while(strT3.hasMoreTokens()) {
			System.out.print(strT3.nextToken()+" "); 
		}
	
	}

}
