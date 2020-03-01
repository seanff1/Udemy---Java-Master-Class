package section4;

public class PositiveNegativeZeroChallenge {
	
	public static void main(String[] args) {
		checkValue(1);
		checkValue(0);
		checkValue(-1);
	}
	
	public static void checkValue(int var)
	{
		if(var > 0)
		{
			System.out.println("Positive");
		}
		else if (var == 0)
		{
			System.out.println("Zero");
		}
		else if (var < 0)
		{
			System.out.println("Negative");
		}
	}

}
