package javaBasic3.ch06.sec2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ������Ȳǥ_���� {

	public static void main(String[] args) {

		Date now = new Date();
		String nowTime = now.toString();
		System.out.println(nowTime);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		������Ȳǥ st1 = new ������Ȳǥ("J02-38","�̹���", new Date(), "�����ڱݴ���", 2700000, 48);
		������Ȳǥ st2 = new ������Ȳǥ("Y04-15","������", new Date(), "�������ݴ㺸����", 3000000, 36);
		������Ȳǥ st3 = new ������Ȳǥ("M02-06","��ö��", new Date(), "�������ſ����", 2000000, 36);
		������Ȳǥ st4 = new ������Ȳǥ("K03-05","�ν·�", new Date(), "�������ñ�݈���", 1500000, 48);
		
		������Ȳǥ[] dArr =  { 
				new ������Ȳǥ("J02-38","�̹���", new Date(), "�����ڱݴ���", 2700000, 48),
				new ������Ȳǥ("Y04-15","������", new Date(), "�������ݴ㺸����", 3000000, 36),
				new ������Ȳǥ("M02-06","��ö��", new Date(), "�������ſ����", 2000000, 36),
				new ������Ȳǥ("K03-05","�ν·�", new Date(), "�������ñ�݈���", 1500000, 60)
				};
		
		for(int i=0; i<dArr.length; i++)
		{
			System.out.println(dArr[i].get�Ⱓ());
		}
	
		//���� �ݾ� ����
		int sum =0;
		for(int i=0; i<dArr.length; i++)
		{
			sum+=dArr[i].����ݾ�;
		}
		System.out.println(sum);
		
		//�Ⱓ�� ���
		float aver= 0;
		int averSum=0;
		for(int i=0; i<dArr.length; i++)
		{
			averSum+=dArr[i].get�Ⱓ();
		}
		aver = averSum/dArr.length;
		System.out.println(aver);


		
	}

}
