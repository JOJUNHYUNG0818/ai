package javaBasic2.ch05.sec03;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] intArr1 = {{1,2},{3,4},{5,6}};
		String[][] strArr1 = {{"A","B","C"},{"D","E","F"}};
		boolean[][] boolArr1 = {{false,true},{false,true},{true,false},{true,true}};
		
		System.out.println(intArr1[0][1]);
		System.out.println(strArr1[1][1]);
		System.out.println(boolArr1[1][1]);
		
		
		for(int i=0; i<intArr1.length; i++)
		{
			for(int j=0; j<intArr1[i].length; j++)
			{
				System.out.print(intArr1[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
