public class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;
	
	Magazine(String title,String itemId,String issueDate,String publisher){
		super(title,itemId);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	
	public void displayItemDetails(){
		System.out.println("Item ID : " + getItemId() +
		"\n" + "Title : " + getTitle() +
		"\n" + "Issue date : " + issueDate +
		"\n" + "Publisher : " + publisher);
	}
	
	public String checkOut() {
		return issueDate;
	}
	
	public String checkIn() {
		return issueDate;
	}
}