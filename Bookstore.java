 
public class Bookstore extends Room{
	
	public Bookstore(String name, String description, String shortDescription) {
		super(name, description, shortDescription);
		
	}
	public void doCommand(String command, Player player) {
		readBook(command, player);
	}
	
	public void readBook(String command, Player player) {
			System.out.println("You read and read. \nYou don't fully understand most of it, but there were two spells that you seemd to master pretty quickly.\n\nLEVETATION\n A spell that makes object fly. \nSimply type levetation to use it.\n\nFIREBALL\n A spell that shoots balls of fire from the palm of your hand. \nSimply type fireball to use it");	
			
		}
	}
	
	


	

