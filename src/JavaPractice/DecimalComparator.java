package JavaPractice;

public class DecimalComparator {

	public static void main(String[] args) {
     boolean res=areEqualByThreeDecimalPlaces(3.1746, 3.1757);
     System.out.println(res);
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double a,double b) {
		double num=a*1000;
		double num1=b*1000;
		if((int)num==(int)num1) {
			return true;
		}
		return false;
	}

}
