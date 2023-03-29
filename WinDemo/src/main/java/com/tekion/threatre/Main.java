package com.tekion.threatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Cinepolis", 8, 12);
//        threatre.getSeats();

//        if(threatre.reserveSeat("H11")){
//            System.out.println("Please Pay");
//        }
//        else {
//            System.out.println("Sorry, seat is taken.");
//        }

//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//        seatCopy.get(1).reserve();

        if (theatre.reserveSeat("A)@")) {
            System.out.println("Seat reserved A02");
        } else {
            System.out.println("Seat already reserved");
        }

//        Collections.reverse(seatCopy);
//
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing Theatre.seats");
//        printList(theatre.seats);

//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);

//        System.out.println("Max seat " + maxSeat.getSeatNumber());
//        System.out.println("Min seat " + minSeat.getSeatNumber());

//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy...");
//        printList(seatCopy);

        //Doubt
//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList, theatre.seats);

    }

//    public static void printList(List<Theatre.Seat> list) {
//        for (Theatre.Seat seat : list) {
//            System.out.print(seat.getSeatNumber() + " ");
//        }
//        System.out.println();
//        System.out.println("++++++++++++++++");
//    }

//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for(int i=0;i<list.size(); i++) {
//            for(int j=i+1; j<list.size(); j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
