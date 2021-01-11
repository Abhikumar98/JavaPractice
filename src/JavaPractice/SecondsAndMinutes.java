package JavaPractice;

public class SecondsAndMinutes {

	public static void main(String[] args) {
	  getDurationString(3945);
	}
	
	public static String getDurationString(long minutes,long seconds) {
		if((minutes>=0) && ((seconds>=0) && (seconds<=59))) {
			long hour=minutes/60;
			long remainingMinutes=minutes%60;
			System.out.println("Hours "+hour+ " Minutes "+remainingMinutes+" Seconds "+seconds);
		}
		return "Invalid Value";
	}
	
	public static String getDurationString(long seconds) {
		if(seconds>=0) {
			long minute=seconds/60;
			long remainingSeconds=seconds%60;
			return getDurationString(minute, remainingSeconds);
		}
		return "Invalid Value";
	}
}
