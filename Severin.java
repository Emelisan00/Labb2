
public class Severin extends OutdoorsArea {
	private boolean rocksRemoved;
	

	public Severin(String name, String description, String shortDescription) {
		super(name, description, shortDescription);
		rocksRemoved = false;
	}

	public void doCommand(String command, Player player) {

		if (command.equals("levitate")) {
			moveRocks(command, player);
		} else
			if (rocksRemoved == true || !command.equals("east")){
				fixPath(command, player);
			}else {
				System.out.println("The rocks are in the way. They need to be removed first");
			}
	}

	public void moveRocks(String command, Player player) {
		if (player.getHasReadBook() == true) {
			System.out.println("At first, the rocks only started shaking a bit, but then they flew up towards the sky and then landed softley two yards to your left.");
			rocksRemoved = true;
			player.setRocksMoved(true);
			
		} else {
			System.out.println("You have not mastered the spell levitate yet.");
		}
	}


	}


