import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

// create a method called deposit() in test
// should take in amount that updates balance property in bank account

    // SETUP
    BankAccount deposit;
    @BeforeEach
    void setUp(){
        deposit = new BankAccount();
    }
    @Test
    void canAdd(){
        var deposit = new BankAccount();
        assertThat(deposit.add(3L,2L)).isEqualTo(5L);
    }
    @Test
    void canSubtract(){
        var withdrawal = new BankAccount();
        assertThat(withdrawal.subtract(4L, 3L)).isEqualTo(1L);
    }
    @Test
    void canSumArray(){
        Long[] arr = {345L, 976L, 251L};
        assertThat(deposit.sumArray(arr)).isEqualTo(1572);
    }



    // DEPOSIT
    public class DepositAccountBalance {
        double balance;

        public void withdraw(double amount) {
            this.balance += amount;
        }
        public double getBalance() {
            return this.balance;
        }
    }

    // WITHDRAWAL
    public class WithdrawalAccountBalance {
        double balance;

        public void withdraw(double amount) {
            this.balance -= amount;
        }
        public double getBalance() {
            return this.balance;
        }
    }



}
