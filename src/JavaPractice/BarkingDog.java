package JavaPractice;

public class BarkingDog {

	public static void main(String[] args) {
		boolean res=shouldWakeUp(false,2);
		System.out.println(res);

	}
	
	public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
		
		 if(hourOfDay<0 || hourOfDay>23) {
			return false;
		}
		 else if(hourOfDay<8 || hourOfDay>22) {
				return barking;
			}
		return false;
	
	}
}
