
public class Book extends ToolItem {
	 
		public Book (String name) {
			super(name);
		}
		
		public void use(String command, Player player, String newCommand) {
			
			if (getHasBeenTaken() == true) {
				System.out.println("You read and read. \nYou don't fully understand most of it, but there were two spells that you seemd to master pretty quickly.\n\nLEVITATION\n A spell that makes object fly.\nDamage: 0 \nSimply type levitate to use it.\n\nFIREBALL\n A spell that shoots balls of fire from the palm of your hand.\nDamage: 50 \nSimply type fireball to use it");	
				player.setHasReadBook(true);
			}
		}
	
	}


