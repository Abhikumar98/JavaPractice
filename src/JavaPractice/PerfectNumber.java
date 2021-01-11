package JavaPractice;

public class PerfectNumber {

	public static void main(String[] args) {
    boolean res=isPerfectNumber(6);
    System.out.println(res);
	}
	public static boolean isPerfectNumber(int number) {
		if(number<1) {
			return false;
		}
		int ans=0;
		int num=1;
		while(num<number) {
			if(number%num==0) {
				{
					ans=ans+num;
				}
			}
			num++;
		}
		return ans==number;
	}

}
