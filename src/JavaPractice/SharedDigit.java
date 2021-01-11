package JavaPractice;

public class SharedDigit {

	public static void main(String[] args) {
     boolean res=hasSharedDigit(12,43);
     System.out.println(res);
	}
	public static boolean hasSharedDigit(int a,int b) {
		if(a>=10 && a<=99 && b>=10 && b<=99) {
			int first=a%10;
			int last=a/10;
			int firstOne=b%10;
			int lastOne=b/10;
			if(first==firstOne || first==lastOne || last==firstOne || last==lastOne) {
				return true;
			}
		}
		return false;
	}

}
