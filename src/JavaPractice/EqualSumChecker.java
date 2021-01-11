package JavaPractice;

public class EqualSumChecker {

	public static void main(String[] args) {
		boolean res=hasEqualSum(1, 2, 5);
		System.out.println(res);

	}
	
	public static boolean hasEqualSum(int a,int b,int c) {
		if(a+b==c) {
			return true;
		}
		return false;
	}

}
