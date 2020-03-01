package section4;

public class CodeBlocksAndIfThenElse {
	
	public static void main(String[] args) {
		
		displayHighScorePosition("1", calculateHighScorePosition(1000));
		displayHighScorePosition("2", calculateHighScorePosition(900));
		displayHighScorePosition("3", calculateHighScorePosition(400));
		displayHighScorePosition("4", calculateHighScorePosition(50));
	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
	{
		if(gameOver)
		{
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("your final score was " + finalScore);
		}
	}
	
	public static void displayHighScorePosition(String name, int rank)
	{
		System.out.println("Player " + name + " has reached number " + rank + 
				" in the leader board!");
	}
	
	public static int calculateHighScorePosition(int score)
	{
		if(score >= 1000)
		{
			return 1;
		}
		else if (score >= 500)
		{
			return 2;
		}
		else if (score >= 100)
		{
			return 3;
		}
		else
		{
			return 4;
		}
	}

}
