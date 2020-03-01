package section4;

public class SpeedConverterChallenge {

	public static void main(String[] args) {
		//System.out.println(toMilesPerHour(-1));
		//System.out.println(toMilesPerHour(1));
		
		printConversation(10.5);
		
	}
	
	public static long toMilesPerHour(double kilometersPerHour)
	{
		if (kilometersPerHour < 0)
		{
			return -1;
		}
			long var = (Math.round(kilometersPerHour / 1.609));
			return var;
	}
	
	public static void printConversation (double kilometersPerHour)
	{
		if(kilometersPerHour <=0)
		{
			System.out.println("Invalid Value");
		}
		
		if(kilometersPerHour > 0)
		{
			double var = (Math.round(kilometersPerHour * 0.621371));
			System.out.println(kilometersPerHour + " km/h = " + var + " mi/h");
		}
	}
}
