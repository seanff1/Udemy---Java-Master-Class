package section4;

public class BarkingDogChallenge {
	
	public static void main(String[] args) {
		shouldWakeUp(true, 1);
		shouldWakeUp(false, 2);
		shouldWakeUp(true, 8);
		shouldWakeUp(true, -1);
		
		
	}
	
	public static boolean shouldWakeUp (boolean barking, int hourOfDay)
	{
		if (barking && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay < 24 && hourOfDay > -1))
		{
			barking = true;
		}
		else
		{
			barking = false;
		}
		System.out.println(barking);
		return barking;
	}

}
