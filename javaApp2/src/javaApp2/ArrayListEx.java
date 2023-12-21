package javaApp2;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		int[] arr = {1,2};
		for(int i: arr ) {
			System.out.println(i);
		}
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		System.out.println(arrList.size()); // ArrayList안에 몇개의 요소가 있는지 반환
		
		arrList.add(3);
		arrList.add(4);
		arrList.add(0, -7);
		System.out.println(arrList);
		for(int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i)+" ");
		}
		System.out.println();
		
		
		ArrayList<String> strList = new ArrayList<String>();
		// 사과 배 귤 바나나
		strList.add("사과");
		strList.add("배");
		strList.add("귤");
		strList.add("바나나");
		
		//귤과 바나나 사이에 파인애플 넣기
		strList.add(3, "파인애플");
		//사과 배 사이에 메론 넣기
		strList.add(1,"메론");
		System.out.println(strList);
		strList.set(3, "천혜향");
		System.out.println(strList);
		strList.remove(5);
		System.out.println(strList);
		
		//파인애플이 있습니까?
		System.out.println(strList.contains("파인애플"));
		
		if(strList.contains("사과")&&strList.contains("배")) {
			System.out.println("있습니다");
		}else {
			System.out.println("없습니다");
		}
		
		strList.clear();
		System.out.println(strList); 
		
		
		
		}
	
	

}
