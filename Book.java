public class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book(String title,String itemId,String author,int numPages){	
		super(title, itemId);
		this.author = author;
		this.numPages = numPages;
	}
	
	
	
	public void displayItemDetails(){
		super.displayItemDetails();
        System.out.println("Author:"+ author);
        System.out.println("No of Pages:"+ numPages);
		System.out.println();

	}
	
}