
public class kl 
{
	String title;
	boolean borrowed;
													// Creates a new Book
	public kl(String bookTitle) 
	{
		title = bookTitle;
		borrowed = false;							// Implement this method
	}
													// Marks the book as rented
	public void borrowed() 
	{
		borrowed = true;											// Implement this method
	}
													// Marks the book as not rented
	public void returned()
	{
		borrowed = false;											// Implement this method
	}
													// Returns true if the book is rented, false otherwise
	public boolean isBorrowed() 
	{
		if (borrowed == false)
		{
			return false;										// Implement this method
		}
		else {return true;}
	}
													// Returns the title of the book
	public String getTitle() 
	{
		return title;											// Implement this method
	} 
	public static void main(String[] arguments) 
	{
													// Small test of the Book class
			kl example = new kl("The Da Vinci Code");
			System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
			System.out.println("Borrowed? (should be false): " + example.isBorrowed());
			example.borrowed();
			System.out.println("Borrowed? (should be true): " + example.isBorrowed());
			example.returned();
			System.out.println("Borrowed? (should be false): " + example.isBorrowed());
	} 
}
