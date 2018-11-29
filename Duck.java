public class Duck extends Bird {

    private boolean swimming;

	public Duck(String name) {
	    super(name);
	    this.swimming = false;
	}
  public boolean isSwimming() {
      return swimming;
  }

  public void setSwimming(boolean swimming) {
      this.swimming = swimming;
  }
    @Override
    public String sing() {
        return "Quack!";
    }


}
