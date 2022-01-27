
public class NPC {
	
		private String name;
		private int health;
		private Location position;
		
		public NPC(String name) {
			this.name = name;
			this.position = position;
			int health = 100;
	}
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	
		public void doCommand(String command, Player player) {
			dialog(command, player);
		}
		
	public void dialog(String command, Player player) {
	
			if (player.getLocation().getName().equals("Celestin")) {
			System.out.println("Oh, hi " + player.getName() + " you look distressed. I know what this is about... This must mean that she has come back for revenge.\nI have a lot to explain to you now that your father isn't here.\nYou have been told that your mother Melanthia died in childbirth, but that's not true. After you were born your father saw her practicing magic... \nShe is a witch and where therfore, of course, cast out of the villige. \nSome say that she fled in to the dark woods of Severin. Wierd thing happen in that forest, but i don't know. \nShe is dangerous and must have taken revenge by doing something awful. Death to all magicians!! \nDon't worry " + player.getName() + " I will take care of you from now on. - Alaric\n\n");
			System.out.println("You are now more scared then ever. If Alaric knew that you could do magic he would hate you to!\nYou know that you need to go to Severin and face your mother. Maybe you could get the villigers back, but first you need to learn a bit about your magic. \nThere is a spellbook in the bookstore in Gwendalin. You need to read it before you can face her.");
			}
		}
	
	
	public void fight() {
		
	}

}
