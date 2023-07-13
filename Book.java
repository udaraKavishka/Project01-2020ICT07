Public class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book(String title,String itemId,String author,int numPages){	
		super(title, itemId);
		this.author = author;
		this.numPages = numPages;
	}
	
	
	
	public String displayItemDetails(){
        return super.displayItemDetails() + "\nAuthor: " +
		author + "\nNumber of Pages: " + numPages;

	}
	
}