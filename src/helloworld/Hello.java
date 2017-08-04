package helloworld;

public class Hello {
	public static void main(String [] args){
		
		calcFeetAndInchesToCentimeters(22, 4);
		calcFeetAndInchesToCentimeters(4);
		int score = calcScore("Blaise", 35);
		System.out.println(score);
		int scorex2 = calcScore(24);
		System.out.println(scorex2);
		int scorex3 = calcScore();
		System.out.println(scorex3);
		int score1 = calcHighScorePosition(5000);
		int score2 = calcHighScorePosition(399);
		int score3 = calcHighScorePosition(535);
		int score4 = calcHighScorePosition(23);
		displayHighScorePosition("Simon", score1);
		displayHighScorePosition("Adam", score2);
		displayHighScorePosition("Paul", score3);
		displayHighScorePosition("Sam", score4);
	};
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches){
		double cmsInInch = 2.54;
		double inchInFeet = 12;
		if(feet >=  0d && inches >= 0d && inches <= 12d){
			double inchesToCms = inches*cmsInInch;
			double inchesToFeet = inches/inchInFeet;
			System.out.println("" + (int) inches + " inches to centimeters = " + (float) inchesToCms + " cms");
			System.out.println("" + (int) inches + " inches to feet = " + (float) inchesToFeet + " feet");
			System.out.println("" + (int) feet + " feet to centimeters = " + (float) (feet*inchInFeet*cmsInInch) + " cms");
			System.out.println("//////////////////////////////////////////////");
			return 1;
		}else{
		System.out.println("Wrong input. Please try again. The inches(second parameter) should be smaller than/eequal to 12");
		return -1d;
		}
	};
	
	public static double calcFeetAndInchesToCentimeters(double inches){
		double cmsInInch = 2.54;
		double inchInFeet = 12;
		if(inches >= 0d && inches <= 12d){
			double inchesToCms = inches*cmsInInch;
			double inchesToFeet = inches/inchInFeet;
			System.out.println("" + (int) inches + " inches to centimeters = " + (float) inchesToCms + " cms");
			System.out.println("" + (int) inches + " inches to feet = " + (float) inchesToFeet + " feet");
			System.out.println("" + (float) inchesToFeet + " feet to centimeters = " + (float) (inchesToFeet*inchInFeet*cmsInInch) + " cms");
			System.out.println("//////////////////////////////////////////////");
			return 1;
		}else{
		System.out.println("Wrong input. Please try again. The inches should be smaller than/eequal to 12");
		return -1d;
		}
	};
	
	public static int calcScore(String player, int score){
		System.out.println("Player " + player + " scored " + score + ".");
		return score*100;
	}
	
	public static int calcScore(int score){
		System.out.println("Player scored " + score + ".");
		return score*80;
	}
	
	public static int calcScore(){
		System.out.println("Player scored 20.");
		return 0;
	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		if(gameOver){
			int finalScore = score + (levelCompleted*bonus);
			System.out.println("The final score is " + finalScore);
		}else{
			System.out.println("The game still goes on.");
		};
	};
	
	public static void simonSays(String word){
		if(word.length() > 0){
			System.out.println("Simon says " + "\"" +  word + "\".");
		}else{
			System.out.println("There is no word. Simon sits quietly");
		}
	};
	
	public static int valueCalc(int num1, int num2){
		int value = 0;
		if(num1 >= 0 && num2 >=0){
			value = num1*num2;
		}
		return value;
	};
	
	public static void displayHighScorePosition(String name, int position){
		System.out.println(name + " managed to get into position " + position + " on the high score table.");
	};
	
	public static int calcHighScorePosition(int score){
		if(score >= 1000){
			return 1;
		}else if(score >= 500 && score < 1000){
			return 2;
		}else if(score >= 300 && score < 500){
			return 3;
		}else {
			return 4;
		}
	};
	
}


