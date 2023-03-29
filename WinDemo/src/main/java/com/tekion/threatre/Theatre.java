package com.tekion.threatre;

import java.util.ArrayList;
import java.util.*;

public class Theatre {
    private final String threatreName;

    public List<Seat> seats = new ArrayList<>();
//    private Collection<Seat> seats = new LinkedHashSet<>();


    public Theatre(String threatreName, int numRows, int seatsPerRow) {
        this.threatreName = threatreName;
        int lastRow = 'A' + (numRows - 1);

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {

                double price = 12.00;
                if ((row < 'D') && seatNum >= 4 && seatNum <= 9) {
                    price = 14.00;
                } else if (row > 'F' || (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }


    }

    public String getThreatreName() {
        return threatreName;
    }

//    public boolean reserveSeat(String seatNumber) {
//        Seat requestSeat = null;
//        for (Seat seat : seats) {
//            System.out.print(".");
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestSeat = seat;
//                break;
//            }
//        }
//        if (requestSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        } else {
//            return requestSeat.reserve();
//        }
//    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);

        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    private class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase((seat.getSeatNumber()));
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " rrserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " is cancelled");
                return true;
            }
            return false;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}


