package section4;

public class SecondsAndMinutesChallenge {
	
	public static void main(String[] args) {
		
		System.out.println(getDurationString(124, 50));
		
	}
	
	public static String getDurationString(int minutes, int seconds)
	{
		if(minutes >=0 && (seconds >= 0 && seconds <= 59))
		{
			int hours = minutes / 60;
			int mins = minutes % 60;
			
			return "hrs " + hours + " mins" + mins + " . Secs " + seconds;
		}
		else
		{
			return "Invalid Value";
		}
	}

}
