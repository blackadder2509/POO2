public class Car extends Vehicle {

	public Car(String name) {
	    super(name);
	}

    @Override
    public String doStuff() {
        return "Je m'appelle "+getBrand()+ " et je fais VroumVroum !";
    }


}
