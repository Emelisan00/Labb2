


import java.util.*;

	public class Game {
	    private Scanner scan; 
	    private ArrayList<Location> location;
	  
	    private Player player;
	    
	    public Game() {
		    scan = new Scanner(System.in);
		    location = new ArrayList<Location>();
		    Location Gwendalin = new Gwendalin("Gwendalin", " you have woken up in the streets of Gwendalin right outside your home. The streets are empty, where are everybody? \nTo It looks like a message is written in the dust on your bedroom window. Let's see what it says. \n NAME YOUR MOTHER IS ALIVE AND WANTS REVENGE. RIDE TO UNCLE ALARIC NOW! \n Uncle Alaric? You haven't seen him in years. He lives in Celestin, west of Gwendalin.", "liten besk");
		    Location Celestin = new Celestin("Celestin", "BESKRIV C", "liten besk") ;
		    Location Severin = new Severin("Severin", "Beskriv S", "liten besk");
		    Location Bookstore = new Bookstore("Bookstore", "beskriv B", "liten besk"); 
		    Location Cabin = new Cabin("Cabin", "beskriv Cabin", "liten besk");
		    Location Field = new Field("Field", "beskriv F", "liten beskriv");
		    
		    location.add(Gwendalin);
		    location.add(Celestin);
		    location.add(Severin);
		    location.add(Bookstore);
		    location.add(Cabin);	
		    location.add(Field);
		    
		    Gwendalin.setNeighbour(Bookstore, Severin, Field, Celestin );
		    Celestin.setNeighbour(null, Gwendalin, null, null);
		    Severin.setNeighbour(null, Cabin, null, Gwendalin);
		    Bookstore.setNeighbour(null, null, Gwendalin, null);
		    Cabin.setNeighbour(null, null, null, Severin);
		    
		    //SKAPA IF = NULL SÅ PRINTA "THERE IS NO WAY"
		    	    }

	    public void run() {
		String name;
		    
	    System.out.println("Welcome to the adventure game!\nWhat is your name?");
		name = scan.nextLine();		
		player = new Player(name, location.get(0));		
		System.out.print(name);
		

	    player.getLocation().describeYourself();
	    System.out.println("  \nYou can move around by typing move and then north/south/west/east. You will have to learn more commands as you play the game! (Hint: there is a command \"help\").");
		
		while (true) {
	            String command;
		    
		    System.out.println("What do you want to do?");
		    command = scan.nextLine();
		    player.doCommand(command);

		    
		}	    
	    }
	}

