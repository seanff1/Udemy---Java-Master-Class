package section4;

import java.util.Scanner;

public class Test {
	public static int[] anArray1 = new int [10];
	public static int[] anArray2 = new int [10];
	public static int[] anArray3 = new int [10];
	
	public static int[] answerArray = new int [10];
	
	static int array1Size = 0;
	static int array2Size = 0;
	static int array3Size = 0;
	
	static int answerArraySize = 0;
	
	public static void main(String[] args) {
		System.out.println("Let's add 5 values to our data first");
		
		addToArray();
		addToArray();
		addToArray();
		addToArray();
		addToArray();
		
		System.out.println("\n" + "Let's check our data is in place");
		printArrayData();
		
		System.out.println("\n" + "Now for the moment of truth. Lets see if we can find "
				+ "all values greater than selected value:");
		checkForGreaterTemp();
		

	}
	
	public static int[] mergeArrays() {
		int count = 0;
		
		int arrLength = anArray1.length + anArray2.length + anArray3.length;
		
		int[] combinedArray = new int [arrLength];
		
		for(int i = 0; i < anArray1.length; i++)
		{
			combinedArray[count] = anArray1[i];
			count = count + 1;
		}
		
		for(int i = 0; i < anArray2.length; i++)
		{
			combinedArray[count] = anArray2[i];
			count = count + 1;
		}
		
		for(int i = 0; i < anArray3.length; i++)
		{
			combinedArray[count] = anArray3[i];
			count = count + 1;
		}
		
		return combinedArray;
	}
	
	public static void addToArray() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temp to add");
		int inputData = sc.nextInt();
		
		if ((array1Size <= array2Size) && (array1Size <= array3Size))
		{
			anArray1[array1Size] = inputData;
			array1Size += 1;
		}
		else if ((array2Size <= array1Size) && (array2Size <= array3Size))
		{
			anArray2[array2Size] = inputData;
			array2Size += 1;
		}
		else if ((array3Size <= array1Size) && (array3Size <= array2Size))
		{
			anArray3[array3Size] = inputData;
			array3Size += 1;
		}
	}
	
	public static void printArrayData() 
	{
		if(array1Size > 0)
		{
			System.out.println("Array 1 data: ");
			
			for(int i = 0; i < array1Size; i++)
			{
				System.out.println(anArray1[i]);
			}
		}
		
		if(array2Size > 0)
		{
			System.out.println("Array 2 data: ");
			
			for(int i = 0; i < array2Size; i++)
			{
				System.out.println(anArray2[i]);
			}
		}
		
		if(array3Size > 0)
		{
			System.out.println("Array 3 data: ");
			
			for(int i = 0; i < array3Size; i++)
			{
				System.out.println(anArray3[i]);
			}
		}
		
	}
	
	public static void checkForGreaterTemp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temp to see all temps GREATER than that one (not equal)");
		int inputData = sc.nextInt();
		
		if (array1Size > 0)
		{
			for(int i = 0; i < array1Size; i++)
			{
				if (anArray1[i] > inputData)
				{
					answerArray[answerArraySize] = anArray1[i];
					answerArraySize += 1;
				}
			}
		}
		
		if (array2Size > 0)
		{
			for(int i = 0; i < array2Size; i++)
			{
				if (anArray2[i] > inputData)
				{
					answerArray[answerArraySize] = anArray2[i];
					answerArraySize += 1;
				}
			}
		}
		
		if (array3Size > 0)
		{
			for(int i = 0; i < array3Size; i++)
			{
				if (anArray3[i] > inputData)
				{
					answerArray[answerArraySize] = anArray3[i];
					answerArraySize += 1;
				}
			}
		}
			
		if(answerArraySize > 0)
		{
			System.out.println("Temps greater than " + inputData);
			
			for(int i = 0; i < answerArraySize; i++)
			{
				System.out.println(answerArray[i]);
			}
		}
		
		}
		
}
	
	
