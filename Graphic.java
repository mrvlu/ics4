
public class Graphic extends Book{
	String artist;
	
	public Graphic(String bookTitle, String bookAuthor, String artist) {
		super(bookTitle, bookAuthor);
		// TODO Auto-generated constructor stub
		this.artist=artist;
		
	}
	
	public String getArtist(){
		return artist;
	}
	public String toString(){
		printTitle();
		return "Title: "+getTitle()+", Author: "+getAuthor()+", Pages: "+getPages()+", Artist:"+artist+"." ;
		
	}
}
