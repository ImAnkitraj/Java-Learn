import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ITelephone desk = new DeskPhone(12345);
        desk.isRinging();
        desk.answer();
        desk.callPhone(12345);
        desk.dial(12345);

        List<Integer> lis = new ArrayList<>();
        lis.add(2);
        System.out.println(lis);
    }
}