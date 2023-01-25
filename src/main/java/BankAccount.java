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
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Integer accountNumber;
    private double balance;
    private String accountType;

    public BankAccount(String inputFirstName, String inputLastName, LocalDate inputDateOfBirth, int accountNumber, double balance, String inputAccountType){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = 0;
        this.balance = 0;
        this.accountType = inputAccountType;
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

    public double getBalance(Integer BankBalance){
        return this.balance;
    }
    public void setBalance(Integer BankBalance){
        this.balance = 0;
    }

    public String getAccountType(String AccountType){
        return this.accountType;
    }
    public void setAccountType(String AccountType){
        this.accountType = accountType;
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
        this.balance += amountDeposited;
        System.out.println("Deposited balance: " + amountDeposited);
    }
    public double getNewBalance(){
        return balance;
    }

    public void withdraw(int amountWithdrawn) {
        this.balance -= amountWithdrawn;
        System.out.println("Deposited balance: " + amountWithdrawn);
    }
    public double getBalance(){
        return balance;
    }


//    Lab review correct interest calculator
    public double calculateInterest(double percentage){
        double interestToPay = this.balance * percentage;
        return interestToPay;
    }

    
//    public static void payInterest(double savingAccountInterest, double currentAccountInterest){
//        if (accountType.equals("Savings Account")){
//            this.balance += calculateInterest(savingAccountInterest);
//        }
//        else if (accountType.equals("Current Account")) {
//            this.balance += calculateInterest(currentAccountInterest);
//        }
//    }



}
