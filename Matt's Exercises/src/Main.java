	
			import java.util.ArrayList;
import java.util.Scanner;	
	
	
public class Main 
{
	
	public static void main(String[] args)
	{
	
			Scanner input = new Scanner(System.in);		
		
	int numbers[] = {20,22,24,26,28,30,32,34,36,38,40};
	int num = 0;
	int no = 0; 
	int found = 0;
	
//	*************************ARRAY LIST EXAMPLE *********************

	
			

			ArrayList<String> list = new ArrayList<String>();
	
				list.add("Lee");
				list.add("Nick");
				list.add("Matt");
				list.add("James");
			
				System.out.println("Currently the array list holds the following : " + list);
			
			
			//		for(int i = 0; i < list.size(); i++)
		//	{
		
		//		System.out.println(list.get(i));
		//	}
		
	
		
	{ //**************** PRINTING THE ARRAY ONTO THE CONSOLE **********************
		for (int i = 0; i <numbers.length; i ++)
		{
			System.out.println("Location " + num + " stores the number "  + numbers[i]);		//this prints out each array that is stored
			num++;
		}
	}
	
	 //********************* SEARCHING A NUMBER FROM ARRAY *******************************
	System.out.println("What number would you like to search?/n");
	{
	int rhif = input.nextInt();
	int i;
	
		for(i = 0; i < numbers.length; i++)
		{
				if(numbers[i] == rhif)
					{
						found = i;
					}
				
		}
				if (found == i)
					{
						System.out.println("Number " + rhif + " is located at " + found);
					}
				else
					{
						System.out.println("The number is not stored in the array");
					}
	}
	
	
	
	
	
}
	


}
	
	


//*************************ARRAY LIST EXAMPLE *********************
//
//
//private void ArrayListTest() {			
//
//ArrayList<String> list = new ArrayList<String>();
//
//for(int i = 0; i < list.size(); i++) {
//	
//	System.out.println(list.get(i));
//}
//}
