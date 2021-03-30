public class ClassUsage {

    public static void main(String[] args) {

        /*

        Car porsche = new Car();
        Car holden = new Car();
//        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

        BankAccountChallenge bankAccount = new BankAccountChallenge();
        bankAccount.setCustomerName("BankCustomer1");
        bankAccount.setEmail("test@test.com");
        bankAccount.setPhoneNumber("1234512345");
        bankAccount.setAccountNumber("BACC12345");
        bankAccount.setBalance(1200.00);
        System.out.println("Welcome " + bankAccount.getCustomerName());
        bankAccount.depositAmount(3000);
        bankAccount.withdrawAmount(200);
        bankAccount.withdrawAmount(400);
        bankAccount.withdrawAmount(4000);

         */

        BankVipCustomerChallenge vipCustomer1 = new BankVipCustomerChallenge();
        System.out.println("Customer " + vipCustomer1.getName() + " has limit of " + vipCustomer1.getCreditLimit());

        BankVipCustomerChallenge vipCustomer2 = new BankVipCustomerChallenge("bankcustomer", "testemail@test.com");
        System.out.println("Customer " + vipCustomer2.getName() + " has limit of " + vipCustomer2.getCreditLimit());

    }
}
