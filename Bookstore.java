 
public class Bookstore extends Room{
	private Item book;
	
	public Bookstore(String name, String description, String shortDescription) {
		super(name, description, shortDescription);
		
	}
	public void doCommand(String command, Player player) {
		if(command.equals("read")) {
		readBook(command, player);
		}else if ((command.equals("take book")) ) {
			takeBook(player);
		}else
			fixPath(command, player);
	}
	
	public void readBook(String command, Player player) {
			System.out.println("You read and read. \nYou don't fully understand most of it, but there were two spells that you seemd to master pretty quickly.\n\nLEVITATION\n A spell that makes object fly.\nDamage: 0 \nSimply type levitate to use it.\n\nFIREBALL\n A spell that shoots balls of fire from the palm of your hand.\nDamage: 50 \nSimply type fireball to use it");	
			player.setHasReadBook(true);
		}
	public void takeBook(Player player) {
		player.addItem(book);
		player.setHasBook(true);
		System.out.println("You put the book in your bag");
	}
}
	
	


	

