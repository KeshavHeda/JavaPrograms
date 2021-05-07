package CollectionsIntroduction;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheatreInstance {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian",8, 12);
//        theatre.getSeats();
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Sorry, seat A02 is taken");
        }

//        Collections.reverse(seatCopy);
        Collections.shuffle(seatCopy);
        System.out.println("Printing seat copy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(theatre.seats);

        System.out.println("Minimum Seat: " + minSeat.getSeatNumber());
        System.out.println("Maximum Seat: " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seat copy");
        printList(seatCopy);

        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats); // only size won't work, copy needs object also
        Collections.copy(newList, theatre.seats);
        printList(newList);

    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("******************************************************");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i , j);
                }
            }
        }
    }
}
