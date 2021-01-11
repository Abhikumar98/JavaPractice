package JavaPractice;

public class FirstLastDigitSum {

	public static void main(String[] args) {
      int res=sumFirstAndLastDigit(5);
      System.out.println(res);
	}
	public static int sumFirstAndLastDigit(int number) {
		if(number<0) {
			return -1;
		}
		int lastDigit=number%10;
		int firstDigit=number;
		
		while(number>=10) {
			number=number/10;
			firstDigit=number;
		}
		
		return lastDigit+firstDigit;
	}

}
