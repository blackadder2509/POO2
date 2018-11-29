public class Boat extends Vehicle {


	public Boat(String name) {
	    super(name);
	}

    @Override
    public String doStuff() {
      return "Je m'appelle "+getBrand()+ " et je fais GlouGlou !";
    }
}
