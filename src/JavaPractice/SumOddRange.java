package JavaPractice;

public class SumOddRange {

	public static void main(String[] args) {
      int resOne=sumOdd(13, 13);
      System.out.println(resOne);
  
	}
	public static boolean isOdd(int number) {
		if(number<0) {
			return false;
		}
		if(number%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int sumOdd(int start,int end) {
		int sum=0;
		if(end>=start && start>0 && end>0) {
			for(int i=start;i<=end;i++) {
				boolean res=isOdd(i);
				if(res) {
					 sum+=i;
				}
				
			}
			return sum;
		}
		return -1;
		
	}

}
