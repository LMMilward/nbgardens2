import java.util.ArrayList;


public class Constructor 
{
	private String catName;
	
	public  Constructor(String name) //this is the constructor method
	{
		catName = name;		//this takes value from main and places it as the catname 
	}
	
	public void setName(String name)														//void means nothing is returned
		{
		catName = name;
		}
	public String getName()
	{
		return catName;
	}

	public void saying()
	{
		System.out.printf("Your cat's name was %s\n ", getName());
	}
	
	
	//*************************ARRAY LIST *********************
	
//	
//	private void ArrayListTest() {			
//		
//		ArrayList<String> list = new ArrayList<String>();
//		
//		for(int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i));
//		}
//	}
//}

