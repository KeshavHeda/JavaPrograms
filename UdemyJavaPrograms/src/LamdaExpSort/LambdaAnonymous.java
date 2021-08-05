package LamdaExpSort;

public class LambdaAnonymous {
    public static void main(String[] args) {
        StringUpperClass stringUpperClass = new StringUpperClass();
        String result = stringUpperClass.doUpperConcatLambda();
        System.out.println(result);
//        stringUpperClass.printValue(); // variable scope in lambda
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class StringUpperClass {

    public String doUpperConcatAnonymous() {
        System.out.println("The StringUpperClass class's name is: " + getClass().getSimpleName());
        return LambdaAnonymous.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
                return s1.toUpperCase() + " " + s2.toUpperCase();
            }
        }, "String1", "String2");
    }

    public String doUpperConcatLambda() {
        final int i = 0;

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression class's name is: " + getClass().getSimpleName());
            System.out.println("i in lambda expression = " + i);
            String result = s1.toUpperCase() + " " + s2.toUpperCase();
            return result;
        };
        System.out.println("The StringUpperClass class's name is: " + getClass().getSimpleName());
        return LambdaAnonymous.doStringStuff(uc, "String1", "String2");
    }

    public String doNestedBlock() {
        final int i = 0;
        {
            UpperConcat uc = new UpperConcat() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    System.out.println("i (within anonymous class) = " + i);
                    return s1.toUpperCase() + " " + s2.toUpperCase();
                }
            };
            System.out.println("The StringUpperClass class's name is: " + getClass().getSimpleName());
//            i++;
            System.out.println("i = " + i);
            return LambdaAnonymous.doStringStuff(uc, "String1", "String2");
        }
    }

    public void printValue() {
        int number = 25;

        Runnable r= () -> {
          try {
              Thread.sleep(5000);
          } catch (InterruptedException iexc){
              iexc.printStackTrace();
          }
            System.out.println("The value of number is : " + number);
          // variable value is copied in lambda stack as they are final values
        };

        new Thread(r).start();
    }

}