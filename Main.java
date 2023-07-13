public class Main{
	public static void main(String args[]){
		Book[] books = {
			new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240),
			new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281),
			new Book("1984", "B003", "George Orwell", 328),
			new Book("Pride and Prejudice", "B004", "Jane Austen", 432),
			new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320)
		};
		
		Magazine[] megazines = {
			new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society"),
			new Magazine("Time", "M002", "September 2023", "Time USA, LLC"),
			new Magazine("Forbes", "M003", "June 2023", "Forbes Media"),
			new Magazine("Vogue", "M004", "July 2023", "Condé Nast"),
			new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition")
		};
		
		LibraryMember[] libraryMembers = {
			new LibraryMember("L001", "John Doe"),
			new LibraryMember("L002", "Jane Smith"),
			new LibraryMember("L003", "David Johnson"),
			new LibraryMember("L004", "Sarah Williams"),
			new LibraryMember("L005", "Michael Brown")
		};
	}
}