import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Aya", "Hezam", LocalDate.of(1999, 10, 06),123456, 100);
        BankAccount bankAccount2 = new BankAccount("John", "Smith",LocalDate.of(1998, 11, 07), 78912, 200);
        BankAccount bankAccount3 = new BankAccount("Emily", "Brown",LocalDate.of(1997, 12, 18), 654321, 300);

        System.out.println(bankAccount.getLastName());

        bankAccount.getBalance(1000);
        System.out.println(bankAccount.getNewBalance());

    }




}
