
public  class  OutdoorsArea extends Location{
	private static String weather;
	
	public OutdoorsArea(String name, String description, String shortDescription) {
		super(name, description, shortDescription);
		weather = "sunny";

	}
	
	public void doCommand(String command) {
		
	}	
	
	public void connections() {
		
		
		
		if (neighbours[0] != null) {
			System.out.println("There is a road leading north.");
		}
		if (neighbours[1] != null) {
			System.out.println("There is a road leading east.");
		}
		if (neighbours[2] != null) {
			System.out.println("There is a road leading south.");
		}
		if (neighbours[3] != null) {
			System.out.println("There is a road leading west.");

		}
		theWeather();
	}
	public void theWeather() {
		System.out.println("The weather: " + weather);
	}

}
