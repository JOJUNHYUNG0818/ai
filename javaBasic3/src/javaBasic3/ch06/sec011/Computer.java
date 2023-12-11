package javaBasic3.ch06.sec011;

public class Computer {

	
	int sum(int ...values)
	{
		int sum=0;
		for(int i=0; i<values.length; i++)
		{
			sum+= values[i];
		}
		
		return sum;
	}
	
	double avg(double ...values)
	{
		double sum = 0;
		for(int i=0; i<values.length;i++)
		{
			sum += values[i];
		}
		
		double result = sum/values.length;
		return result;
	}
}
