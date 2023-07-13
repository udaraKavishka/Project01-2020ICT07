public class LibraryMember{
	private String memberID;
	private String name;
	
	public LibraryMember(String memberID,String name){
		this.memberID=memberID;
		this.name=name;
	}
	
	public String displayMemberDetails(){
		return "\nMemberID: "+ memberID +
		"\nName: "+ name;
	}
	
}