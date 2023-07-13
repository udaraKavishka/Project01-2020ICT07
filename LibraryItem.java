abstract class LibraryItem{
	protected String title;
	protected String itemId;
	protected boolean checked;
	
	LibraryItem(String title,
				String itemId){
					
		this.title = title;
		this.itemId = itemId;
		this.checked=checked;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getItemId() {
		return itemId;
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