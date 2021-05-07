package ScopeIntroduction;

public class ScopeInstance {

    public static void main(String[] args) {
        String varFour = "this is private to ScopeInstance main";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("ScopeCheck varOne is " + scopeCheck.getVarOne());
        System.out.println(varFour);
        scopeCheck.useInner();
        System.out.println("***********************************");

        scopeCheck.timesTwo();
        System.out.println("***********************************");
        ScopeCheck.ScopeInner scopeInner = scopeCheck.new ScopeInner();
        scopeInner.timesTwo();
    }
}
