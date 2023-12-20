package javaApp1.ch12.sec07;
import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int[] selectNumber = new int [6];
		Random random = new Random(System.currentTimeMillis());
		System.out.println("���� ��ȣ: ");
		for (int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		//��÷��ȣ
		int[] winnerNumber = new int[6];
		random = new Random(System.currentTimeMillis()
				);
		System.out.println("��÷��ȣ: ");
		for(int i=0; i<6; i++) {
			winnerNumber[i]= random.nextInt(45)+1;
			System.out.print(winnerNumber[i]+" ");
		}
		
		System.out.println();
		
		//��÷����
		Arrays.sort(selectNumber);
		Arrays.sort(winnerNumber);
		boolean result = Arrays.equals(selectNumber, winnerNumber);
		System.out.println("��÷����: ");
		if(result) {
			System.out.println("1� ��÷�Ǿ����ϴ�.");
		}else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
		
	}

}
