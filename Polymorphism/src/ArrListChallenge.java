import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrListChallenge {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while(flag) {
            printActions();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1: {
                    addItem(groceries);
                    break;
                }
                case 2: {
                    removeItem(groceries);
                    break;
                }
                default: {
                    flag = false;
                    break;
                }
            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    public static void printActions() {
        String text = "\nPress \n 1. for add \n 2. for remove\n Any key to exit. ";
        System.out.println(text);
    }

    public static void addItem(ArrayList<String> groceries) {
        System.out.println("\nadd items [separated by ,]  ");
        String[] items = sc.nextLine().split(",");
        for(var i: items) {
            String trimmed = i.trim();
//            System.out.println(groceries.indexOf(trimmed));
            System.out.println(groceries.indexOf(trimmed) < 0);
            if(groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
        groceries.addAll(List .of(items));
    }

    public static void removeItem(ArrayList<String> groceries) {
        System.out.println("\nRemove1 items [separated by ,]  ");
        String[] items = sc.nextLine().split(",");
        for(var i: items) {
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0) {
                groceries.remove(trimmed);
            }
        }
        groceries.addAll(List .of(items));
    }
}
