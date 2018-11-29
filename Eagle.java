public class Eagle extends Bird {

    private boolean flying;
    private boolean sleeping;

	public Eagle(String name) {
	    super(name);
	    this.flying = false;
      this.sleeping=true;
	}

    @Override
    public String sing() {
        return "Screech!";
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }
    public boolean isSleeping(){
      return sleeping;
    }
    public void setSleeping(boolean sleeping){
      this.sleeping=sleeping;
    }
}
