
public class Example {
	public static void main(String[] args) {
		
		
		
		int total = 0; 
		int[] numList = new int[100];
		 
		
		for (int counter = 0; counter < numList.length; counter++) {
			numList[counter] = counter;
			
		}
		for (int counter = 0; counter < numList.length; counter++)
		{
			total = total + counter;				
			
		}
			System.out.println("The Array total is " + total);	
		
		
		
		for (int counter = numList.length-1; counter >= 0; counter --)	
		{
			
			System.out.println("Array number is" + numList[counter]);
			
		}
			
			
			
	}
}
