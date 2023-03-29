public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GearBox gBox = new GearBox(6);

        GearBox.Gear gear = new GearBox.Gear(1,2.3);

        System.out.println(gBox.toString());
    }
}