package BoxingUnboxing;

import java.util.ArrayList;

class IntClass {
    private int baseValue;

    public IntClass(int baseValue) {
        this.baseValue = baseValue;
    }

    public int getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;
    }
}

public class AutoBoxingUnBoxingIntro {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("ABCD");

//        ArrayList<int> intArrayList = new ArrayList<int>(); // primitive type not allowed
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(i);
           // intArrayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = Integer.valueOf(56); // 56 (Autoboxing)
        int myInt = myIntValue.intValue(); //  myIntValue (unboxing)

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(dbl); // Double.valueOf(dbl)
        }

        for(int i = 0; i< myDoubleValues.size(); i++) {
            System.out.println( i + " --> " + myDoubleValues.get(i));  // myDoubleValues.get(i).doubleValue()
        }


    }
}
