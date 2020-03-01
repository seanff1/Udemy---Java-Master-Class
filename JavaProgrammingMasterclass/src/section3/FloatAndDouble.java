package section3;

public class FloatAndDouble {

	public static void main(String[] args) {
		
		
		//minVsFloat();
		//poundsToKiloChallenge();
		aChar();
	}
	
	public static void minVsFloat()
	{
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatvalue = Float.MAX_VALUE;
		System.out.println("Float min value = " + myMinFloatValue);
		System.out.println("Float max value = " + myMaxFloatvalue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoublevalue = Double.MAX_VALUE;
		System.out.println("Double min value = " + myMinDoubleValue);
		System.out.println("Double max value = " + myMaxDoublevalue);
		
		int myIntValue = 5;
		float myFloatValue = 5f;
		double myDoubleValue = 5d;
		
		System.out.println();
		System.out.println("int value = " + myIntValue);
		System.out.println("float value = " + myFloatValue);
		System.out.println("double value = " + myDoubleValue);
	}
	
	public static void poundsToKiloChallenge()
	{
		double pounds;
		double kilos;
		
		pounds = 200d;
		kilos = pounds * 0.45359237d;
		
		System.out.println(kilos);
	}
	
	public static void aChar()
	{
		char myChar = 'D';
		char myUnicodeChar = '\u0044';
		System.out.println(myChar);
		System.out.println(myUnicodeChar);
	}
}
