
public class Severin extends OutdoorsArea {
	private boolean hasBarrier;
	private Item shovel;
	

	public Severin(String name, String description, String shortDescription) {
		super(name, description, shortDescription);
		hasBarrier = true;
		shovel = new Shovel("shovel");
	}
	public boolean getHasBarrier() {
		return hasBarrier;
	}

	public void doCommand(String command, Player player) {

		if (command.equals("levitate")) {
			moveRocks(command, player);
		}else if (hasBarrier == false || !command.equals("east")){
				fixPath(command, player);
			}else {
				System.out.println("The rocks are in the way. They need to be removed first");
			}
	}

	public void moveRocks(String command, Player player) {
		if (player.getHasReadBook() == true) {
			System.out.println("At first, the rocks only started shaking a bit, but then they flew up towards the sky and then landed softley two yards to your left.");
			hasBarrier = false;
		} else {
			System.out.println("You have not mastered the spell levitate yet.");
		}
	}
	
	 public Item getItem() {
		 return shovel;
	 }
	

	}


