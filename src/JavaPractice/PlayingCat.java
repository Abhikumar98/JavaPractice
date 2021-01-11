package JavaPractice;

public class PlayingCat {

	public static void main(String[] args) {
		boolean result=isCatPlaying(false,25);
		System.out.println(result);

	}
	
	public static boolean isCatPlaying(boolean summer,int temperature) {
		if(temperature>25 && temperature<=45 && summer==true) {
			return true;
		}
		else if(temperature>=25 && temperature<=35) {
			return true;
		}
		else {
			return false;
		}
	}

}
