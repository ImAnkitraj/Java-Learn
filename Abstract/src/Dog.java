
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(getClass().getSimpleName() + " Walking");
    }


}
