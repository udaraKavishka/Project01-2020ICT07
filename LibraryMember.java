public class LibraryMember{
	private String memberID;
	private String name;
	
	public LibraryMember(String memberID,String name){
		this.memberID=memberID;
		this.name=name;
	}
	
	public void displayMemberDetails(){
		System.out.println("MemberID: "+ memberID );
		System.out.println("Name: "+ name);
		System.out.println();
		
	}
	
}