package InnerClassApp;

import java.util.*;

public class InnerPlayList {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album1 = new Album("Stormbringer", "Deep Purple");

        album1.addSong("Stormbringer", 4.6);
        album1.addSong("Love don't mean a thing", 4.22);
        album1.addSong("Holy man", 4.3);
        album1.addSong("Hold on", 5.6);
        album1.addSong("Lady double dealer", 3.21);
        album1.addSong("You can't do it right", 6.23);
        album1.addSong("High ball shooter", 4.27);
        album1.addSong("The gypsy", 4.2);
        album1.addSong("Soldier of fortune", 3.13);

        albums.add(album1);

        Album album2 = new Album("For those about to rock", "AC/DC");

        album2.addSong("For those about to rock", 5.44);
        album2.addSong("I put the finger on you", 3.25);
        album2.addSong("Lets go", 3.45);
        album2.addSong("Inject the venom", 3.33);
        album2.addSong("Snowballed", 4.51);
        album2.addSong("Evil walks", 3.45);
        album2.addSong("C.O.D", 5.25);
        album2.addSong("Breaking the rules", 5.32);
        album2.addSong("Night of the long knives", 5.12);

        albums.add(album2);


        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playlist);
        albums.get(0).addToPlayList("Holy man", playlist);
        albums.get(0).addToPlayList("Speed King", playlist); // does not exist
        albums.get(0).addToPlayList(9, playlist);

        albums.get(1).addToPlayList(8, playlist);
        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(2, playlist);
        albums.get(1).addToPlayList(24, playlist); // There is no track 24


        play(playlist);
    }


    private static void play(LinkedList<Song> playList) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing -> " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist Complete...");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing -> " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist.");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing -> " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the beginning of the playlist.");
                        forward = true;
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are the beginning of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() > 0)
                    {
                        listIterator.remove();
                        if(listIterator.hasNext())
                        {
                            System.out.println("Now playing " + listIterator.next().toString());
                        }
                        else if(listIterator.hasPrevious())
                        {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }


    private static void printMenu() {
        System.out.println("Available actions:\n press");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - remove current song from playlist.");
    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("***********************************************");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("***********************************************");
    }

}
