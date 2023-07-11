package dir_reference;

public class Mobile {
	
	private String colour;
	private String camera;
	Sim sim;
	public Mobile(String colour, String camera, Sim sim) {
		super();
		this.colour = colour;
		this.camera = camera;
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [colour=" + colour + ", camera=" + camera + ", sim=" + sim + "]";
	}
	
	

}
