public abstract class Bird {

    // attributs
    private String name;
    private int age;
    private String color;
    private boolean hunt;

    // constructeurs
    public Bird(String name) {
        this.name = name;
        this.age = 0;
        this.color=color;
        this.hunt=true;
    }

    // accesseurs et mutateurs
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getColor(){
      return this.color;
    }
    public void setColor(String color){
      this.color=color;
    }
    public boolean isHunt(){
      return this.hunt;
    }
    public void getHunt(boolean hunt){
      this.hunt=hunt;
    }

    // méthodes
    public abstract String sing();
}
