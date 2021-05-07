package MapIntroduction;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high-level, object-oriented, platform independent language");
            System.out.println("Java added in the map successfully");
        }

        languages.put("Python", "an interpreted high-level, object-oriented, programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

//        System.out.println(languages.get("Java"));
//        System.out.println(languages.put("Java", "this course is about Java"));
//        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already present in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("********************************************************");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed successfully");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

//        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));
        System.out.println(languages.replace("Scala", "this will not be added"));

        if (languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced successfully");
        } else {
            System.out.println("Lisp was not replaced");
        }

        System.out.println("********************************************************");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
