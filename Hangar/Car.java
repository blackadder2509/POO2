public class Car extends Vehicle {

	public Car(String name) {
	    super(name);
	}

    @Override
    public String doStuff() {
        return "VroumVroum !";
    }


}
