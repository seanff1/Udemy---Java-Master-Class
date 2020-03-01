package section3;

public class PrimitiveTypes {
	public static void main(String[] args) {
		//primTypes();
		//intRange();
		//byteRange();
		//longRange();
		//shortRange();
		primTypeChallenge();
		
		byte myMinByteValue = Byte.MIN_VALUE;
		

		byte myNewByte = (byte)(myMinByteValue / 2);
		
		System.out.println(myNewByte);
	}
	
	public static void primTypes()
	{
		System.out.println("The 8 primitive data types are:" + "\n");
		System.out.println("boolean");
		System.out.println("byte");
		System.out.println("char");
		System.out.println("short");
		System.out.println("int");
		System.out.println("long");
		System.out.println("float");
	}
	
	public static void intRange()
	{
		int myvalue = 10_000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println(myMinIntValue);
		System.out.println(myMaxIntValue);
		
		System.out.println("Example of overfrlow / underflow");
		System.out.println();
		System.out.println("Max value + 1 comes out as = " + (myMaxIntValue + 1));
		System.out.println("Max value + 1 comes out as = " + (myMinIntValue - 1));
	}
	
	public static void byteRange()
	{
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		
		System.out.println("Min Byte = " + myMinByteValue);
		System.out.println("Max Byte = " + myMaxByteValue);
	}
	
	public static void longRange() 
	{
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		
		System.out.println(myMinLongValue);
		System.out.println(myMaxLongValue);
	}
	
	public static void shortRange() 
	{
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		
		System.out.println(myMinShortValue);
		System.out.println(myMaxShortValue);
	}
	
	public static void primTypeChallenge()
	{
		byte byteVar = 2;
		short shortVar = 3;
		int intVar = 4;
		
		long longVar = 50000;
		longVar = longVar + (10 * (byteVar + shortVar + intVar));
		
		System.out.println(longVar);
	}
}
