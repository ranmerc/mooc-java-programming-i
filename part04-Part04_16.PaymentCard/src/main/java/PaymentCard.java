
/**
 *
 * @author ranmerc
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        double remainingBalance = this.balance - 2.6;
        if (remainingBalance >= 0) {
            this.balance = remainingBalance;
        }
    }

    public void eatHeartily() {
        double remainingBalance = this.balance - 4.6;
        if (remainingBalance >= 0) {
            this.balance = remainingBalance;
        }
    }
    
    public void addMoney(double amount) {
        if (amount > 0) {
            double newBalance = this.balance + amount;
            if (newBalance > 150) {
                this.balance = 150;
            } else {
                this.balance = newBalance;
            }
        }
    }
}
