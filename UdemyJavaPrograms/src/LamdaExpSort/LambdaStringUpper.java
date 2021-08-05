package LamdaExpSort;

import java.util.ArrayList;
import java.util.List;

public class LambdaStringUpper {

    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();
        employees.add("John Doe");
        employees.add("Tim Buchalka");
        employees.add("Jack Hill");
        employees.add("Snow White");

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + " " + s2.toUpperCase();
//            }
//        }, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + " " + s2.toUpperCase();
            return result;
        };
        String sillyString = doStringStuff(uc,
                employees.get(0), employees.get(1));
        System.out.println(sillyString);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }

}
