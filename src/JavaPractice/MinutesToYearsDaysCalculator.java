package JavaPractice;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(0);

	}
	
	public static void printYearsAndDays(long minutes) {
		if(minutes<0) {
			System.out.println("Invalid Value");
		}
		else{
			long day=minutes/1440;
			day=day%365;
			long year=minutes/525600;
			System.out.println(minutes+ " min = "+ year+ " y "+"and "+day+" d ");
		}
		
	}

}
