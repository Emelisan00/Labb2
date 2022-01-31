
public class Alaric extends NPC {
	private Item jacket;
	
	public Alaric(String name, int health) {
		super(name, health);
		jacket = new Jacket("jacket");
	}

	public void dialog(String command, Player player) {

System.out.println("Oh, hi " + player.getName()
					+ " you look distressed. I know what this is about... This must mean that she has come back for revenge.\nI have a lot to explain to you now that your father isn't here.\nYou have been told that your mother Melanthia died in childbirth, but that's not true. After you were born your father saw her practicing magic... \nShe is a witch and where therfore, of course, cast out of the villige. \nSome say that she fled in to the dark woods of Severin. Wierd thing happen in that forest, but i don't know. \nShe is dangerous and must have taken revenge by doing something awful. Death to all magicians!! \nDon't worry "
					+ player.getName() + " I will take care of you from now on. I have some more things to buy but I will meet you at home. It's gonna get cold. Here, take my jacket! - Alaric\n\n");
			player.addItem(jacket);
			player.setHasGotJacket(true);
			System.out.println(
					"You put Alarics jacket in your bag, but you do not plan to stay in Celestin. You are now more scared then ever. \nIf Alaric knew that you could do magic he would hate you to! You know that you need to go to Severin and face your mother. \nMaybe you could get the villigers back.");
			if (player.getHasReadBook() == false) {
				System.out.println(
						"But first you need to learn a bit about your magic. \nThere is a spellbook in the bookstore in Gwendalin. You need to read it before you can face her.");
			}
	}
	public void fireball(String command, Player player) {

		fighting(player);

			System.out.println(
					"You just killed a man in the middle of the market!\nPeople all around you scream and cry and a couple of large men scream that you use magic and impale you with their swords");
			player.setHealth(player.getHealth() - 150);
			player.yourHealth();

		}
}


