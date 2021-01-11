package JavaPractice;

public class LastDigitChecker {

	public static void main(String[] args) {
    boolean res=hasSameLastDigit(9,99,999);
    System.out.println(res);
	}
	public static boolean hasSameLastDigit(int a,int b,int c) {
		if(isValid(a) && isValid(b) && isValid(c)) {
			a=a%10;
			b=b%10;
			c=c%10;
			if(a==b || b==c|| c==a) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isValid(int number) {
		return (number>=10 && number<=1000);
	}

}
