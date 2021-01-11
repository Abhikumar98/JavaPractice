package JavaPractice;

public class NumberPalindrome {

	public static void main(String[] args) {
        boolean res=isPalindrome(-1221);
        System.out.println(res);
	}
	public static boolean isPalindrome(int number) {
		int reverse=0;
		int original=number;
		while(number!=0) {
			int lastDigit=number%10;
			reverse=reverse*10;
			reverse+=lastDigit;
			number=number/10;
		}
		if(original==reverse) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
