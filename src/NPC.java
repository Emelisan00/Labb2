
public class NPC {
	
		private String name;
		private int health;
		private  boolean NPCDead;

		
		public NPC(String name, int health) {
			this.name = name;
			this.health = health;
			NPCDead = false;
			
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getHealth() {
			return health;
		}
		public void setHealth(int health) {
			this.health = health;
		}
		public boolean getNPCDead() {
			return NPCDead;
		}
		
		public void setNPCDead(boolean NPCDead) {
			this.NPCDead = NPCDead;
			}


		public void doCommand(String command, Player player) {
			if (command.equals("talk")) {
				dialog(command, player);
			} else if (command.equals("fireball")) {
				fireball(command, player);
			}
		}

	public void dialog(String command, Player player) {

	}

	public void fighting(Player player) {

		player.getLocation().getNPC().setHealth(getHealth() - 50);
		System.out.println("You aim and the fireball hits right in the chest of your opponant. ");
		System.out.println(getName() + "'s health: " + getHealth());
	}

	public void fireball(String command, Player player) {

		
	}
}
