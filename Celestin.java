
public class Celestin extends OutdoorsArea{
	private NPC alaric;

	
	public Celestin(String name, String description, String shortDescription, NPC alaric) {
		super(name, description, shortDescription);
		this.alaric = alaric;
	}
	
	
	public NPC getNPC() {
		return alaric;
	}
	public void doCommand(String command) {
		
	}

	
}
