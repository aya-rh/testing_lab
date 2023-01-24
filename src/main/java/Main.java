import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Aya", "Hezam", LocalDate.of(1999, 10, 6),123456, 100);
        BankAccount bankAccount2 = new BankAccount("John", "Smith",LocalDate.of(1998, 11, 7), 78912, 200);
        BankAccount bankAccount3 = new BankAccount("Emily", "Brown",LocalDate.of(1997, 12, 18), 654321, 300);

        System.out.println(bankAccount.getLastName());

        bankAccount.getBalance(100);
        System.out.println(bankAccount.getNewBalance());

        bankAccount.deposit(1000);
        System.out.println("New Balance:" + bankAccount.getBalance());

        bankAccount.withdraw(500);
        System.out.println("New Balance:" + bankAccount.getBalance());


//        Object interest = new BankAccount();
//        double balance = 0.5;
//        Integer interestOnNextPayment = (balance * interest) / 1200;

//      don't know where we were going with this...


    }




}
