abstract class LibraryItem{
	protected String title;
	protected String itemID;
	protected boolean checked;
	
	LibraryItem(String title,
				String itemID){
					
		this.title = title;
		this.itemID = itemID;
		this.checked=checked;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getItemId() {
		return itemID;
	}
	
	public boolean getCheckOut(){
		return checked;
	}
	
	public void checkOut(boolean checked) {
        this.checked = true;
    }
	
	public boolean getCheckIn(){
		return checked;
	}

    public void checkIn(boolean checked) {
        this.checked = false;
    }
	
	
	public String displayItemDetails() {
       return "\nTitle: " + title + "\nItem ID: " + itemID;
    }
	
}