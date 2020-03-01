package section5;

public class SwitchAndBreak {

	public static void main(String[] args) {
//		SwitchAndBreak(1);
//		SwitchAndBreak(2);
//		SwitchAndBreak(3);
//		SwitchAndBreak(4);
//		
//		SwitchAndBreak2(5);
//		SwitchAndBreak2(6);
		
		switchAndBreakChallenge('A');
		switchAndBreakChallenge('B');
		switchAndBreakChallenge('C');
		switchAndBreakChallenge('D');
		switchAndBreakChallenge('E');
		switchAndBreakChallenge('a');
	}
	
	public static void SwitchAndBreak(int switchValue)
	{
		
		switch(switchValue)
		{
		case 1:
			System.out.println("Value 1");
			break;
			
		case 2:
			System.out.println("Value 2");
			break;
			
		case 3:
			System.out.println("Value 3");
			break;
			
		default:
			System.out.println("You didn't enter 1,2 or 3");
			break;
		}
	}
		
		public static void SwitchAndBreak2(int switchValue)
		{
			
			switch(switchValue)
			{
			case 1:
				System.out.println("Value 1");
				break;
				
			case 2:
				System.out.println("Value 2");
				break;
				
			case 3: case 4: case 5:
				System.out.println("Value 3-5");
				break;
				
			default:
				System.out.println("You didn't enter 1,2,3,4 or 5");
				break;
			}
	}
		
		public static void switchAndBreakChallenge(char switchValue) 
		{
			Character.toUpperCase(switchValue);
			switch(switchValue)
			{
				case 'A': case 'B': case 'C': case 'D':
					System.out.println("You entered " + switchValue);
					break;
				
				default:
					System.out.println("Invalid value entered");
					break;
			}
			
		}
}
