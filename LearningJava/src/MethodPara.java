
public class MethodPara 
{
	//private means no where can use it except this class
	private String dogName;
	//line below sets the name of whatever is put in 
	public void setName(String name) //two variables name and dogName
	{
		dogName = name;
		
	}
	
	//below shows the getter - how you use the above outside of this class
	public String getName()
	{
		return dogName;
	}
	public void saying()
	{
		System.out.println("Your dogs name was " + getName());
		
	}

}

