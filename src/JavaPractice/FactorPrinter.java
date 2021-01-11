package JavaPractice;

public class FactorPrinter {

	public static void main(String[] args) {
    printFactors(32);
	}
	public static void printFactors(int number) {
		if(number<1) {
			System.out.println("Invalid Value"); 
		}
		String ans="";
		int divisible=1;
		while(divisible<=number) {
			if(number%divisible==0) {
				ans=ans+" "+divisible;
			}
			divisible++;
		}
	    System.out.println(ans);
	}

}
