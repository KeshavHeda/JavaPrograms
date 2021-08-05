package InputOutputIntroduction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Locations_ReaderWriter implements  Map<Integer, Location>{

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) throws IOException {
        try (FileWriter locFile = new FileWriter("locations.txt");
        FileWriter dirFile = new FileWriter("directions.txt")) {
            for(Location location : locations.values()) {
                locFile.write(location.getLocationId() + "," + location.getDescription() + "\n");
                for(String direction : location.getExits().keySet()) {
                    dirFile.write(location.getLocationId() + "," + direction + "," + location.getExits().get(direction) + "\n");
                }
            }
        }

//        FileWriter locFile = null;
//        try {
//            locFile = new FileWriter("locations.txt");
//            for(Location location : locations.values()) {
//                locFile.write(location.getLocationId() + "," + location.getDescription() + "\n");
//            }
//        }  finally {
//            System.out.println("In finally block");
//            if(locFile != null) {
//                System.out.println("Attempting to close locFile");
//                locFile.close();
//            }
//        }

    }

//    public static void main(String[] args) {
//        FileWriter locFile = null;
//        try {
//            locFile = new FileWriter("locations.txt");
//            for(Location location : locations.values()) {
//                locFile.write(location.getLocationId() + "," + location.getDescription() + "\n");
//            }
//        } catch (IOException e) {
//            System.out.println("In catch block");
//            e.printStackTrace();
//        } finally {
//            System.out.println("In finally block");
//            try {
//                if(locFile != null) {
//                    System.out.println("Attempting to close locFile");
//                    locFile.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    static {

        try (Scanner scanner = new Scanner(new FileReader("locations_big.txt"))) {
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Scanner scanner = null;
//        try {
//
//            scanner = new Scanner(new FileReader("locations_big.txt"));
//            scanner.useDelimiter(",");
//            while(scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported loc: " + loc + ": " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(scanner != null) {
//                scanner.close();
//            }
//        }

        // Now read the exits
        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))) {
            String input;
            while((input = dirFile.readLine()) != null) {
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//            scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")));
//            scanner.useDelimiter(",");
//            while(scanner.hasNextLine()) {
////                int loc = scanner.nextInt();
////                scanner.skip(scanner.delimiter());
////                String direction = scanner.next();
////                scanner.skip(scanner.delimiter());
////                String dest = scanner.nextLine();
////                int destination = Integer.parseInt(dest);
//
//                String input = scanner.nextLine();
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(scanner != null) {
//                scanner.close();
//            }
//        }


//        Map<String, Integer> tempExits = new HashMap<>();
//        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));
//
//        tempExits = new HashMap<>();
//        tempExits.put("W", 2);
//        tempExits.put("E", 3);
//        tempExits.put("S", 4);
//        tempExits.put("N", 5);
//        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExits));
//
//        tempExits = new HashMap<>();
//        tempExits.put("N", 5);
//        locations.put(2, new Location(2, "You are at the top of a hill", tempExits));
//
//        tempExits = new HashMap<>();
//        tempExits.put("W", 1);
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));
//
//        tempExits = new HashMap<>();
//        tempExits.put("N", 1);
//        tempExits.put("W", 2);
//        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExits));
//
//        tempExits = new HashMap<>();
//        tempExits.put("S", 1);
//        tempExits.put("W", 2);
//        locations.put(5, new Location(5, "You are in the forest", tempExits));
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
