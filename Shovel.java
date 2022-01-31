
public class Shovel extends ToolItem {
	 
		public Shovel (String name) {
			super(name);
		}
		
		public void use(String command, Player player, String newCommand) {
			
			if (player.getLocation().getName().equals("Field")) {
			System.out.println("You dig into the field and you find a shiny bottle filled with green liquid. It is labeled\n\n HEALTH + 50 \n\n.");
			player.setHasDug(true);
			
			
			//Kalla på dig i Field för att adda greenpotion till item
			
			}else 
				System.out.println("There is nothing to dig into.");
		}
	}


