package ScopeIntroduction;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;


    public ScopeCheck() {
        System.out.println("ScopeCheck Class Created");
        System.out.println("publicVar = " + publicVar + " : varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for(int i = 0; i<= 10; i++){
            System.out.println(i + " times two is " + (i * varTwo));
        }
//        System.out.println("value of i is " + i);
    }

    public void useInner() {
        ScopeInner scopeInner = new ScopeInner();
        System.out.println("varThree from outer class: " + scopeInner.varThree);
    }

    public class ScopeInner {
        private int varThree = 3;

        public ScopeInner() {
            System.out.println("ScopeInner Class created, varOne is " + varOne + ", varThree is " + varThree);
        }

        public void timesTwo() {
//            ScopeCheck.this.timesTwo();
            for(int i = 0; i<= 10; i++){
                System.out.println(i + " times two is " + (i * varOne));
//                System.out.println(i + " times two is " + (i * ScopeCheck.this.varOne));
            }
        }

    }

}
