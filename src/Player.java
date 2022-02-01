import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	private String name;
	private Location position;
	private int health;
	private boolean readBook;
	private boolean dead;
	private ArrayList<Item> items;
	private Scanner scan;
	private String newCommand;

	

	public Player(String name, Location position, int health) {
		this.name = name;
		this.position = position;
		this.health = health;
		readBook = false;
		dead = false;
		items = new ArrayList<Item>();
		scan = new Scanner(System.in);

	
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

	public boolean getHasReadBook() {
		return readBook;
	}

	public void setHasReadBook(boolean readBook) {
		this.readBook = readBook;
	}

	public Item findItem(String newCommand) {
		for (Item item : items) {

			if (newCommand.equals(item.getName())) {
				return item;

			}

		}
		return new Item("noItem");
	}

	public void doCommand(String command) {
		if (command.equals("talk")) {
			try {
				position.getNPC().doCommand(command, this);
			} catch (Exception e) {
				System.out.println("There is no one to talk to");
			}

		} else if (command.equals("levitate")) {
			if (getLocation().getName().equals("Severin") && (getLocation().getHasBarrier() == true)) {
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

		} else if (command.equals("use")) {
			System.out.println("What do you want to use?");
			newCommand = scan.nextLine();
			findItem(newCommand).doCommand(command, this, newCommand);

		} else if (command.equals("drink")) {
			System.out.println("What do you want to drink?");
			newCommand = scan.nextLine();
			findItem(newCommand).doCommand(command, this, newCommand);

			removeItem(findItem(newCommand));

		} else if (command.equals("wear")) {
			System.out.println("What do you want to wear?");
			newCommand = scan.nextLine();
			findItem(newCommand).doCommand(command, this, newCommand);

		} else if (command.equals("items")) {
			printItems();

		} else if (command.equals("take")) {
			System.out.println("What do you want to take?");
			newCommand = scan.nextLine();
			if (getLocation().getItem().getName().equals(newCommand)&& getLocation().getItem().getHasBeenTaken() == false) {
				items.add(getLocation().getItem());
				getLocation().getItem().setHasBeenTaken(true);
				System.out.println("You put the " + newCommand + " in your bag");
			}
		} else {

			position.doCommand(command, this);
		}
	}
}

//Vad vi har kvar
// - abstracta klasser
// - weather, size
// - help
// - static
























