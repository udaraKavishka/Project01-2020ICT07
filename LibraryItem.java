abstract class LibraryItem{
	protected String title;
	protected String itemId;
	
	LibraryItem(String title,
				String itemId){
					
		this.title = title;
		this.itemId = itemId;
	}
	public String getTitle() {
		return title;
	}
	
	public String getItemId() {
		return itemId;
	}
	
	abstract String checkOut();
	abstract String checkIn();
	abstract void displayItemDetails();
	
}