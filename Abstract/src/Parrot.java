public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }



    @Override
    public void walk() {
        super.walk();
        System.out.println(this.getClass() + " is walking");
    }


}
