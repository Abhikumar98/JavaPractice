package JavaPractice;

public class DigitSum {

	public static void main(String[] args) {
      int res=sumDigits(25);
      System.out.println(res);
	}
	public static int sumDigits(int number) {
		if(number<10) {
			return -1;
		}
		
		int sum=0;
		while(number>0) {
			int digit=number%10;
			sum+=digit;
			
			number=number/10;
		}
		return sum;
	}
}
