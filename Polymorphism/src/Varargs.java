import java.util.Arrays;

public class Varargs {
    public static void main(String... args) {
        String [] splitString = "Hello World Again".split(" ");
        printText(splitString);
    }

    public static void printText(String... s) {
        for(String t: s) {
            System.out.println(t);
        }
    }
}
