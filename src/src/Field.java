
public class Field extends OutdoorsArea{
	private Item greenPotion;
	
	
	public Field(String name, String description, String shortDescription) {
		super(name, description, shortDescription);
		greenPotion = new GreenPotion("green potion");
	
		
	}
	public void doCommand(String command, Player player) {
		if(command.equals("dig")) {
			dig( player);

		} else
			fixPath(command, player);
	}

	public void dig(Player player) {
		//if (getHasDug() == false) {
			System.out.println("You dig into the soil, but find nothing.");
		}
		
	

	public Item getItem() {

		return greenPotion;

	}
	
	
	
}

