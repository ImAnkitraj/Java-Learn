import java.sql.SQLOutput;

public abstract class Bird extends Animal implements  CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(this.getClass().getSimpleName() + " is walking");
    }

    public void fly() {;
        System.out.println(getClass() + " CanFly interface");
    };
}
