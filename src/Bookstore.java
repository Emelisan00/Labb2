 
public class Bookstore extends Room{
	private Item book;
	
	public Bookstore(String name, String description, String shortDescription) {
		super(name, description, shortDescription);
		book = new Book("book");
		
	}
	public void doCommand(String command, Player player) {
		fixPath(command, player);
	}
	
	
	
	 public Item getItem() {
		 return book;
}
}
	
	


	

