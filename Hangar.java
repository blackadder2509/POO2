public class Hangar {

    public static void main(String[] args) {
    
        Car clio = new Car ("clio");
      //  clio.setBrand("Clio");
        System.out.println("je suis "+clio.getBrand()+" et je fais "+ clio.doStuff());

        Boat titanic = new Boat ("Titanic");
        System.out.println("je suis "+titanic.getBrand()+" et je fais "+titanic.doStuff());

    }
}
