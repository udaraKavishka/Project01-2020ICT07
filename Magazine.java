public class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;
	
	public Magazine(String title,String itemId,String issueDate,String publisher){
		super(title,itemId);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	
	public String displayItemDetails(){
        return super.displayItemDetails() +
		"\nIssue Date: " + issueDate + 
		"\nPublisher: " + publisher;
    }
	
	
}