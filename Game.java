

	import java.util.*;

	public class Game {
	    private Scanner scan; 
	    private ArrayList<Location> location;
	    private Player player;
	    
	    public Game() {
		    scan = new Scanner(System.in);
		    location = new ArrayList<Location>();
		    Location Gwendalin = new Gwendalin("Gwendalin", "BESKRIVNING");
		    Location Celestin = new Celestin("Celestin", "BESKRIV") ;
		    Location Severin = new Severin("Severin", "Beskriv");
		    Location Bookstore = new Bookstore("Bookstore", "beskriv"); 
		    Location Cabin = new Cabin("Cabin", "beskriv");
		    
		    location.add(Gwendalin);
		    location.add(Celestin);
		    location.add(Severin);
		    location.add(Bookstore);
		    location.add(Cabin);

		    	    }

	    public void run() {
		String name;
		    
	        System.out.println("Welcome to the adventure game!\nWhat is your name?");
		name = scan.nextLine();
		player = new Player(name, world[3]);
		System.out.println("Hello " + name + ", welcome to this magical world of wonder! You can move around by typing north/south/west/east. You will have to learn more commands as you play the game! (Hint: there is a command \"help\").");
		
		while (true) {
	            String command;
		    
		    player.getLocation().describeYourself();
		    System.out.println("What do you want to do?");
		    command = scan.nextLine();
		    player.doCommand(command);
		}	    
	    }
	}

