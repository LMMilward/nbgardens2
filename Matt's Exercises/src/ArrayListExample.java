
	//http://beginnersbook.com/2013/12/java-arraylist/


			import javax.swing.JOptionPane;

			//***** THIS IS FOR USER INPUT AND ARRAY*****
			import java.util.ArrayList;
			import java.util.Scanner;	
	

public class ArrayListExample 
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);	
		ArrayList<String> list = new ArrayList<String>();
		JOptionPane.showMessageDialog(null, "Hello, World!");
		
	//********************************* ARRAY LIST ****************************************
		
		list.add("Lee");
		list.add("Nick");
		list.add("Matt");
		list.add("James");
	
		System.out.println("Currently the array list holds the following : " + list);

		
	//****************************** ADD TO ARRAY *****************************************
		
		
		list.add(0, "Ed");
		list.add(1, "Luke");
		
		
		System.out.println("Now the array holds : " + list);
		
		
		
		//*****************************DELETING AN ITEM ************************************
		
		list.remove("Lee");
		list.remove("Luke");
		
		System.out.println("This is the array after deleting: " + list);
		
		
		//*****************************REMOVING FROM SPECIFIC LOCATION***************************
		
		list.remove(1);
		
		System.out.println("This is the latest version of the array : " + list);
		
	}
	
}
