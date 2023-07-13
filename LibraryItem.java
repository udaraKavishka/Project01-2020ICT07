abstract class LibraryItem{
	protected String title;
	protected String itemID;
	protected boolean checked;
	
	LibraryItem(String title,String itemID){
		this.title = title;
		this.itemID = itemID;
		this.checked=checked;
	}
	
	public void checkOut(){
		checked=true;
	}
	
	public void checkIn(){
		checked=false;
	}
	
	
	public void displayItemDetails() {
       System.out.println("Title: " + title );
	   System.out.println("Item ID: " + itemID); 
    }
	
}