package javaApp4.ch16.sec02;

public class LambdaP7 {
	private static int[] scores = {10,50,3};
	
	static int maxOrMin(Operator operator) {
		int result = scores[0];
		
		for(int score: scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int max = maxOrMin((x,y)->(x>y)?x:y);
		System.out.println("최대값: "+max);
		
		int min = maxOrMin((x,y)->(x<y)?x:y);
		System.out.println("최솟값: "+min );
		

	}

}


@FunctionalInterface
interface Operator{
	int apply(int x, int y);
}