
public class Shovel extends ToolItem {
	 
		public Shovel (String name) {
			super(name);
		}
		
		public void use(String command, Player player, String newCommand) {
			
			player.getLocation().dig(player);
			

		}
	}


