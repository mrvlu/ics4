/**
* A class that maintains information on a book.
* This might form part of a larger application such
* as a library system, for instance.
*
* @author (Insert your name here.)
* @version (Insert today’s date here.)
*/
public class Book
{
	// The fields.
	private String author;
	private String title;
	private int pages;
	
	/**
	 * Set the author and title fields when this object
	 * is constructed.
	 */
	public Book(String bookTitle, String bookAuthor)
	{
		author = bookAuthor;
		title = bookTitle;
		pages=-1; //could be a default value if none provided
	}
	/**
	 * Overloaded constructor
	 * @param bookAuthor
	 * @param bookTitle
	 * @param pages
	 */
	public Book( String bookTitle,String bookAuthor, int pages)
	{
		author = bookAuthor;
		title = bookTitle;
		this.pages=pages;
		
	}	
	
	public void printAuthor(){
		System.out.println(author);
	}
	
	public void printTitle(){
		System.out.println(title);
	}
	
	
	public String toString(){
		return "Title: "+title+", Author: "+author+", Pages: "+pages;
		
	}
}