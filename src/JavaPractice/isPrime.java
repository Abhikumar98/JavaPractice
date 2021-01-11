package JavaPractice;

public class isPrime {

	public static void main(String[] args) {
	int count=0;
	for(int i=2;i<10;i++) {
		boolean res=isPrime(i);
		if(res) {
			System.out.println("Is a prime number "+ i);
			count++;
		}
		if(count==3) {
			System.out.println("Exiting for loop");
			break;
		}
	}

	}
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {  //(long)Math.sqrt(n)
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
