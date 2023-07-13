public class Main{
	public static void main(String args[]){
		Book bk1 = new Book("The Catcher in the Rye", "B001", "J.D.Salinger", 240);
		Book bk2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
		Book bk3 = new Book("1984", "B003", "George Orwell", 328);
		Book bk4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
		Book bk5 = new Book("The Hobbit", "B005", "J.R.R.Tolkien", 320);
		
		/* bk1.checkOut();
		
        bk1.checkIn(); */
			
		
		System.out.println();
		
		System.out.println("Books: ");
			bk1.displayItemDetails();
			bk2.displayItemDetails();
			bk3.displayItemDetails();
			bk4.displayItemDetails();
			bk5.displayItemDetails();
		
		System.out.println();
		
		Magazine mgz1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
		Magazine mgz2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
		Magazine mgz3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
		Magazine mgz4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
		Magazine mgz5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");
		
		System.out.println("Magazines: ");
			mgz1.displayItemDetails();
			mgz2.displayItemDetails();
			mgz3.displayItemDetails();
			mgz4.displayItemDetails();
			mgz5.displayItemDetails();
		
		System.out.println();
		
		LibraryMember lm1 = new LibraryMember("L001", "John Doe");
        LibraryMember lm2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember lm3 = new LibraryMember("L003", "David Johnson");
        LibraryMember lm4 = new LibraryMember("L004", "Sarah Williams");
        LibraryMember lm5 = new LibraryMember("L005", "Michael Brown");
		
		System.out.println("Library Members: ");
			lm1.displayMemberDetails();
			lm2.displayMemberDetails();
			lm3.displayMemberDetails();
			lm4.displayMemberDetails();
			lm5.displayMemberDetails();
		
	}
}