
public class Switch 
{
	// line below states this is the main. Static is needed for running this class
	public static void main(String args[])
	{
		// Switch example, used when there are many checks
		int age = 3; 
		
			
		switch (age)
		{
		case 1:
			System.out.println("You Can crawl");
		break;
		
		case 2:
			System.out.println("you can talk");
		break;
		
		case 3:
			System.out.println("you can walk");
		break;
		//default is in place in case none of the case's above are true
		default:
			System.out.println("I don't know how old you are");
		break;
		// end of case example
		}
	}
}