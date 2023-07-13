Public class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	Book(String title,String itemId,String author,int numPages){	
		super(title, itemId);
		this.author = author;
		this.numPages = numPages;
	}
	
	
	public String checkOut() {
		return author;
	}
	
	public String checkIn() {
		return author;
	}
	
	public void displayItemDetails(){
		System.out.println("Item ID : " + getItemId() + 
		"\n" + "Title : " + getTitle() +
		"\n" + "Author : " + author +
		"\n" + "Number of pages : " + numPages);
	}
	
}