package JavaPractice;

public class Assignment {

	public static void main(String[] args) {
	long milesPerHour=toMilesPerHour(10.25);
	printConversion(milesPerHour);
	}

	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour<0) {
			return -1;
		}
		else {
			return Math.round(kilometersPerHour/1.609);
		}
		
	}
	
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour>0) {
			long milesPerHour=toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h = "+ milesPerHour+" mi/h ");
		}
		else {
			System.out.println("Invalid Value");
		}
	}
}
