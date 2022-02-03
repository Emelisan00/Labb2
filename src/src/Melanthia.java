
public class Melanthia  extends NPC {

	
	public Melanthia(String name, int health) {
		super(name, health);
	}
	public void dialog(String command, Player player) {
		System.out.println("There you are, my child! They got what they deserved... Now we can be together!!!!! - Melanthia");
	}
	public void fireball(String command, Player player) {

		fighting(player);
		
		if (player.getLocation().getNPC().getHealth() < 1) {
			setNPCDead(true);
			System.out.println("\nYou saved the villagers and all is well!");
		} else {
			System.out.println("\nHow could you?! - Melanthia\nMelanthia shoots dust at you that hurts to breath in.");
			player.setHealth(player.getHealth() - 40);
			player.yourHealth();

		}
}
}

