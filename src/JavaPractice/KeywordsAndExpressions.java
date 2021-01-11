package JavaPractice;

public class KeywordsAndExpressions {

	public static void main(String[] args) {
//		boolean gameOver=true;
//		int score=10000;
//		int levelCompleted=8;
//		int bonus=200;
//		if(gameOver) {
//			int finalScore=score+(levelCompleted*bonus);
//			System.out.println("Your score was: "+finalScore);
//		}
//		calculateScore(true,800,levelCompleted,bonus);
		
		int result=calculateScore(true,10000,8,200);
		System.out.println(result);

	
		
		int resultScore=calculateHighScorePosition(1500);
		displayHighScorePosition("Shravan", resultScore);
		
		resultScore=calculateHighScorePosition(900);
		displayHighScorePosition("Bob", resultScore);
        
		resultScore=calculateHighScorePosition(400);
		displayHighScorePosition("Keven", resultScore);
		
		resultScore=calculateHighScorePosition(40);
		displayHighScorePosition("Lita", resultScore);
	
        }
	
		
	public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
		if(gameOver) {
			int finalScore=score+(levelCompleted*bonus);
			return finalScore;
		}
		return -1;
	}
	
	public static void displayHighScorePosition(String name,int position) {
		System.out.println(name+" managed to get into position "+position+" on the high score table");
	}
	
	public static int calculateHighScorePosition(int score) {
		if(score>1000) {
			return 1;
		}
		else if(score>=500 && score<1000) {
			return 2;
		}
		else if(score>=100 && score<500) {
			return 3;
		}
		else {
			return 4;
		}
	}

}
