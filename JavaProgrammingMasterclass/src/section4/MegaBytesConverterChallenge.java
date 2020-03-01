package section4;

public class MegaBytesConverterChallenge {
	
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes)
	{
		if(kiloBytes <= 0)
		{
			System.out.println("Invalid Entry");
		}
		
		if (kiloBytes > 0)
		{
			int mB = kiloBytes / 1024;
			int reminader = kiloBytes % 1024;
			
			System.out.println(kiloBytes + " KB = " + mB + " MB and " + reminader + " KB");
		}
	}

}
