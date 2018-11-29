public class Boat extends Vehicle {


	public Boat(String name) {
	    super(name);
	}

    @Override
    public String doStuff() {
        return "GlouGlou !";
    }
}
