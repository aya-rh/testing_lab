import java.time.LocalDate;

public class BankAccount{
    Long add(Long a,Long b){
        return a + b;
    }

    Long subtract(Long a, Long b){
        return a - b;
    }
//    create Bank Account class




//    list properties
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public Integer accountNumber;
    public Integer balance;

    public BankAccount(String inputFirstName, String inputLastName, LocalDate inputDateOfBirth, int accountNumber, int balance){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = 0;
        this.balance = 100;
    }

    public BankAccount() {

    }


    //     create getters and setters for each property
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String forename){
        this.firstName = forename;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String Surname){
        this.firstName = Surname;
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    public void setDateOfBirth(LocalDate DOB){
        this.dateOfBirth = DOB;
    }

    public Integer getAccountNumber(Integer AccountNumber){
        return this.accountNumber;
    }
    public void setAccountNumber(Integer accountNumber){
        this.accountNumber = 0;
    }

    public Integer getBalance(Integer BankBalance){
        return this.balance;
    }
    public void setBalance(Integer BankBalance){
        this.balance= 0;
    }


//    created a method called deposit() in test
//    accept amount as deposit
//    add to/update balance property in bank account
//    should have parameter balance = amount

    Long sumArray(Long[] numbers){
        Long sum = 0L;

        for(var num : numbers) {
            sum += num;

        }
        return sum;
    }

    public void deposit(Integer amountDeposited) {
        balance += amountDeposited;
        System.out.println("Deposited balance: " + amountDeposited);
    }
    public Integer getNewBalance(){
        return balance;
    }

    public void withdraw(int amountWithdrawn) {
        balance -= amountWithdrawn;
        System.out.println("Deposited balance: " + amountWithdrawn);
    }
    public Integer getBalance(){
        return balance;
    }



}
