import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CanFly c = new CanFly() {
            @Override
            public void fly() {

            }
        };
        Dog dog = new Dog("Buny");
        dog.walk();

        Parrot p = new Parrot("Pupy");
//        p.fly();
//        p.walk();
//        p.noise();

        System.out.println(String.format("%.2f", 10089978.2));
        Calendar c = Calendar.getInstance();
    }
}