import java.util.ArrayList;

public class Shelf {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Book> bookShelf = new ArrayList<Book>(); //notice difference in brackets
		//ArrayList can only obtain OBJECTS 
		System.out.println("How many books in my shelf? "+bookShelf.size());
	
		//add(element) 

		bookShelf.add(new Book("Robin Crusoe", "Daniel Defoe"));
		bookShelf.add(new Book("Sherlock Holmes", "Sir Arthur Conan Doyle"));
		bookShelf.add(new Book("Bible", "God", 500));
		bookShelf.add(new Graphic("X-men", "Stan Lee", "Jack Kirby"));

		System.out.println("How many books in my shelf? "+bookShelf.size());
		
		// This for loop is used as an enumerator
		// Let Book b be each of the books in bookshelf and then iterate(go through them)
		for (Book b: bookShelf){
			System.out.println(b);

		}
		
		//add(int index, element)
		bookShelf.add(0,new Book("Hannibal: Enemy Of Rome", "Ben Kane"));
		
		System.out.println("How many books in my shelf? "+bookShelf.size());

		
		//get(int index) = returns the element at index position in the array
		Book nowReading = bookShelf.get(0);
		nowReading.printAuthor();
		nowReading.printTitle();
		System.out.println(bookShelf.indexOf(nowReading)); // on my top reading list

		//remove(int index)
		bookShelf.remove(0);  //done reading that book, remove it from my shelf
		
		//indexOf(obj)
		System.out.println(bookShelf.indexOf(nowReading)); //find that item from the
		//
		
		System.out.println("---------- The new shelf ----------");
		for (Book b: bookShelf){
			System.out.println(b);
		}	
		
		bookShelf.get(0).printTitle();
		
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		ArrayList<Float> listFloat = new ArrayList<Float>();
		ArrayList<Long> listLong = new ArrayList<Long>();
		ArrayList<Boolean> listBool = new ArrayList<Boolean>();
				
		listInt.add(666);
		listInt.add(0);
		for (int i: listInt){
			System.out.println(i);
		}		
		
		//ArrayList<int> listInt = new ArrayList<int>(); will not work because int is not an object, it is a primitive data type


	}

}
