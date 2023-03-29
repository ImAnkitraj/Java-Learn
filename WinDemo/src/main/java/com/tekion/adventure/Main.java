package com.tekion.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        locations.put(0, new Location(0, "Loaction 0"));
        locations.put(1, new Location(1, "Loaction 1"));
        locations.put(2, new Location(2, "Loaction 2"));
        locations.put(3, new Location(3, "Loaction 3"));
        locations.put(4, new Location(4, "Loaction 4"));
        locations.put(5, new Location(5, "Loaction 5"));

        locations.get(1).adddExit("W", 2);
        locations.get(1).adddExit("E", 3);
        locations.get(1).adddExit("S", 4);
        locations.get(1).adddExit("N", 5);
        locations.get(1).adddExit("Q", 0);

        locations.get(2).adddExit("N", 5);
        locations.get(2).adddExit("Q", 0);

        locations.get(3).adddExit("W", 1);
        locations.get(3).adddExit("Q", 0);

        locations.get(4).adddExit("N", 1);
        locations.get(4).adddExit("W", 2);
        locations.get(4).adddExit("Q", 0);

        locations.get(5).adddExit("S", 1);
        locations.get(5).adddExit("W", 2);
        locations.get(5).adddExit("Q", 0);

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            loc = sc.nextInt();
            if (!locations.containsKey(loc)) {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
