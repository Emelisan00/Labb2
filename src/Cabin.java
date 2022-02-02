
public class Cabin extends Room {
	private NPC melanthia;


	public Cabin(String name, String description, String shortDescription, NPC melanthia) {
		super(name, description, shortDescription);
		this.melanthia = melanthia;

	}
	@Override
	public NPC getNPC() {
		return melanthia;
	}
	


	public void doCommand(String command) {

	}
	

	}


	





