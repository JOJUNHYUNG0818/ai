package javaApp1.ch12.sec04;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		String data1 = "ȫ�浿&�̼�ȫ,�ڿ���";
		
		String[] arr = data1.split("&|,");
		for (int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		for(String i :arr) {
			System.out.println(i);
		}
		
		String data2 = "ȫ�浿/�̼�ȫ/�ڿ���/�̼���/�ּ���";
		StringTokenizer strT =  new StringTokenizer(data2,"/");
		while(strT.hasMoreTokens()) {
			System.out.println(strT.nextToken());
		}
		
		String data3 = "���-��-��-�ٳ���-����";
		
		StringTokenizer strT2 = new StringTokenizer(data3,"-");
		while(strT2.hasMoreTokens()) {
			System.out.print(strT2.nextToken()+" "); 
		}
		System.out.println();
		
		String data4 = "�ڹ�*+���̽�*+����Ŭ*+�ټ��÷ξ�";
		
		StringTokenizer strT3 = new StringTokenizer(data4,"*|+");
		while(strT3.hasMoreTokens()) {
			System.out.print(strT3.nextToken()+" "); 
		}
	
	}

}
