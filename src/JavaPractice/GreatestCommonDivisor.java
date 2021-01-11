package JavaPractice;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
   int res=getGreatestCommonDivisor(9,18);
    System.out.println(res);
	}

	
	public static int getGreatestCommonDivisor(int first,int second) {
		if(first<10 || second<10) {
			return -1;
		}
		int ans=0;
		int divisible=1;
		while(divisible<=first || divisible<=second) {
			if(first%divisible==0 && second%divisible==0) {
				ans=divisible;
			}
			divisible++;
		}
		return ans;
	}
}
