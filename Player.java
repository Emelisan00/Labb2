import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	private String name;
	private Location position;
	private int health;
	private boolean readBook;
	private boolean rocksMoved;
	private boolean dead;
	private boolean hasDug;
	private boolean hasDrunkGreen;
	private boolean hasDrunkPurple;
	private ArrayList<Item> items;
	private Scanner scan;
	private String newCommand;
	private boolean hasGotJacket;
	private boolean hasShovel;
	private boolean hasBook;
	private boolean hasPotion;

	public Player(String name, Location position, int health) {
		this.name = name;
		this.position = position;
		this.health = health;
		readBook = false;
		rocksMoved = false;
		dead = false;
		hasDug = false;
		hasDrunkGreen = false;
		hasDrunkPurple = false;
		items = new ArrayList<Item>();
		scan = new Scanner(System.in);
		hasGotJacket = false;
		hasShovel = false;
		hasBook = false;
		hasPotion = false;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	public void printItems() {
		for (Item item : items) {
			System.out.println(item.getName());
		}
	}

	public String getName() {
		return name;
	}

	public boolean getDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void yourHealth() {
		System.out.print("Your health: ");

		if (getHealth() > -1) {
			System.out.println(getHealth());
		} else {
			System.out.println("0");
			System.out.println("You are dead.");
			setDead(true);
		}
	}

	public Location getLocation() {
		return this.position;
	}

	public void setLocation(Location location) {
		this.position = location;

	}

	public boolean getRocksMoved() {
		return rocksMoved;
	}

	public void setRocksMoved(boolean rocksMoved) {
		this.rocksMoved = rocksMoved;
	}

	public boolean getHasReadBook() {
		return readBook;
	}

	public void setHasReadBook(boolean readBook) {
		this.readBook = readBook;
	}

	public boolean getHasDug() {
		return hasDug;
	}

	public void setHasDug(boolean hasDug) {
		this.hasDug = hasDug;
	}
	
	public boolean getHasGotJacket() {
		return hasGotJacket;
	}

	public void setHasGotJacket(boolean hasGotJacket) {
		this.hasGotJacket = hasGotJacket;
	}

	public boolean getHasDrunkGreen() {
		return hasDrunkGreen;
	}

	public void setHasDrunkGreen(boolean hasDrunkGreen) {
		this.hasDrunkGreen = hasDrunkGreen;
	}
	public boolean getHasDrunkPurple() {
		return hasDrunkPurple;
	}

	public void setHasDrunkPurple(boolean hasDrunkPurple) {
		this.hasDrunkPurple = hasDrunkPurple;
	}
	public void setHasShovel(boolean hasShovel) {
		this.hasShovel = hasShovel;	}
	
	
	public boolean getHasShovel() {
				return hasShovel;
	}
	public boolean getHasBook() {
		return hasBook;
	}
	public void setHasBook(boolean hasBook) {
		this.hasBook = hasBook;	
		}
	public boolean getHasPotion() {
		return hasPotion;
	}
	public void setHasPotion(boolean hasPotion) {
		this.hasPotion = hasPotion;	}
		
		
	public void doCommand(String command) {
		if (command.equals("talk")) {
			try {
				position.getNPC().doCommand(command, this);
			} catch (Exception e) {
				System.out.println("There is no one to talk to");
			}

		} else if (command.equals("read")) {
			if (getHasBook() == true) {
			if (getLocation().getName().equals("Bookstore")) {
				position.doCommand(command, this);
			} else {
				System.out.println("There is no book to read.");
			}
			}else {
				System.out.println("You don't have a book.");
			}

		} else if (command.equals("levitate")) {
			if (getLocation().getName().equals("Severin") && (getRocksMoved() == false)) {
				position.doCommand(command, this);
			} else {
				if (getHasReadBook() == true) {
					System.out.println("There is nothing to levitate.");

				}
			}
		} else if (command.equals("fireball")) {
			try {
				position.getNPC().doCommand(command, this);
			} catch (Exception e) {
				System.out.println("There is no one to aim at");
			}

		} else if (command.equals("fight")) {
			try {
				position.getNPC().doCommand(command, this);
			} catch (Exception e) {
				System.out.println("There is no one to fight");
			}

		}else if(command.equals("use")){
			System.out.println("What do you want to use?");
			newCommand = scan.nextLine();
			for (Item item : items) {

				if (newCommand.equals(item.getName())) {
					item.doCommand(command, this, newCommand);
				}else 
					System.out.println("You don't have that tool in your bag");
			}
			
		}else if (command.equals("dig")) {
		

			if (getHasShovel() == true) {
				if (getLocation().getName().equals("Field")) {
					position.doCommand(command, this);
				} else {
					System.out.println("There is nowhere to dig.");

				}
			} else {
				System.out.println("You don't have a shovel.");

			}
	}else if (command.equals("drink")) {
			System.out.println("What do you want to drink?");
			newCommand = scan.nextLine();
			Item usedItem = new ConsumableItem("placeHolder");
			for (Item item : items) {

				if (newCommand.equals(item.getName())) {
					item.doCommand(command, this, newCommand);
					usedItem = item;
				}else 
					System.out.println("You don't have that drink in your bag");
			}
			removeItem(usedItem);

		
	} else if (command.equals("wear")) {
			System.out.println("What do you want to wear?");
			newCommand = scan.nextLine();

			for (Item item : items) {

				if (newCommand.equals(item.getName())) {
					item.doCommand(command, this, newCommand);
				}
			}

		} else if (command.equals("take shovel")) {
			if (getLocation().getName().equals("Field")) {
				position.doCommand(command, this);
			} else
				System.out.println("There is no shovel to take.");

		} else if (command.equals("take book")) {
			if (getLocation().getName().equals("Bookstore")) {
				position.doCommand(command, this);
			} else
				System.out.println("There is no book to take.");

		}else if (command.equals("take potion")) {
			if (getLocation().getName().equals("Gwendalin")) {
				position.doCommand(command, this);
			} else
				System.out.println("There are no potions to take.");
		} else if (command.equals("items")){
			for (Item item : items) {
				System.out.println(item.getName());
			}

		}else {

			position.doCommand(command, this);
		}
	}
}



//Vad vi har kvar
// - abstracta klasser
// - weather, size
// - help
// - static
//När man vill plocka upp ett föremål som ligger i ett rum skall man använda kommandot "take".
// Hur addar vi greenpotion när man usar shovel i shovel istrället för i Field.























