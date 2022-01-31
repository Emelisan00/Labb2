


import java.util.*;

	public class Game {
	    private Scanner scan; 
	    private ArrayList<Location> location;
	    private Player player;
	    
	    public Game() {
		    scan = new Scanner(System.in);
		    location = new ArrayList<Location>();
		    
		    NPC Alaric = new Alaric("Alaric", 50);
		    NPC Melanthia = new Melanthia("Melanthia", 200);
		    
		    Location Gwendalin = new Gwendalin("Gwendalin", " you have woken up in the streets of Gwendalin right outside your home. The streets are empty, where are everybody? You are shaking. Scared and alone.\nYou scream out a call for help and get even more frightend when you see blue flashes comming from the palms of you hands and the puddle your standing on turns to ice. \nWhat the hell is going on??\nIt looks like a message is written in the dust on your bedroom window. Let's see what it says. \n\n YOUR MOTHER IS ALIVE AND WANTS REVENGE. RIDE TO UNCLE ALARIC NOW! \n\nUncle Alaric? You haven't seen him in years. He lives in Celestin, west of Gwendalin. You can also see a purple potion on the ground.", "You are back in Gwendalin. The streets are still empty.");
		    Location Celestin = new Celestin("Celestin", "2 hours later you have reached Celstin. Your horse Edmund is tired and you are hungry, but you must find Alaric.\nHe must have the answers to the million questions that are swirling around in your head. Finding Alaric is what keeps you sane.\nYou walk to the market and ask around and finally you see his familiar face in the crowed.", "You are back in Celestin. ", Alaric) ;
		    Location Severin = new Severin("Severin", "You have reached the entrence of the dark woods of Severin, but you can't ride further beacuse of the giant rockes that are blocking the way", "You are back in Severin and the rocks are still blocking your way.");
		    Location Bookstore = new Bookstore("Bookstore", "You have reached the bookstore in the northen part of Gwendalin. There is no signs of the old lady that usually work there... \nYou look for the old magic book with leather cover that you have seen plenty of times but never thought twice about.\nBut now that you know about your powers there is a good reason to read through it. \nAhh, there it is! ", "You are back in the bookstore north of Gwendalin"); 
		    Location Cabin = new Cabin("Cabin", "You arrive to a little cabin. It looks dark and scary. This must be where Melanthia lives.\nYou open the door and she stands there is holding a cristall ball. You can see the familier faces looking out from the ball. It's the villigers!\n You have heard that if you kill the witch all the magic she has performed goes away. It is a tuff decition, because she is your mother, but it must be done...", "You are back in the cabin. Melanthia is holding the cristal ball with the villigers in it.", Melanthia);
		    Location Field = new Field("Field", "You are standing in the middle of a deserted earthfield. There is a shovel to your right", "You are back at the earthfield.");
		    
		  
		    
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
		    Field.setNeighbour(Gwendalin, null, null, null);
		    
		    
		    	    }

	    public void run() {
		String name;
		    
	    System.out.println("Welcome to the adventure game!\nWhat is your name?");
		name = scan.nextLine();		
		player = new Player(name, location.get(0), 100);		
		System.out.print(name);
		

	    player.getLocation().describeYourself();
	    player.getLocation().setBeenHereBefore(true);
	    System.out.println("  \nYou can move around by typing move and then north/south/west/east. You start with full health (100). You will have to learn more commands as you play the game! (Hint: there is a command \"help\").");
		
		while (true) {
	            String command;
		    
		    System.out.println("What do you want to do?");
			command = scan.nextLine();
			player.doCommand(command);

			if (player.getLocation().getName().equals("Cabin")) {

				if (player.getLocation().getNPC().getNPCDead() == true) {
					System.exit(0);
				}
			}
			if (player.getDead() == true) {
				System.exit(0);
			}
		    
		}	    
	    }
	}

