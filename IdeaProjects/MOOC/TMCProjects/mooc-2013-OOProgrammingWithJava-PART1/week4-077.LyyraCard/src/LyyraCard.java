public class LyyraCard {

    private double balance;

    public LyyraCard(double startingBalance) {
        this.balance = startingBalance;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
        else{
            System.out.println("not enough funds");
        }
    }

    public void payGourmet() {
        if (this.balance >= 4) {
            this.balance -= 4;
        }
        else{
            System.out.println("not enough funds");
        }
    }

    public void loadMoney(double amount){
        if((this.balance+amount)<=150 && amount>=0){
            this.balance+=amount;
        }
        else if (this.balance + amount >150){
            this.balance=150;
        }
        else{
            System.out.println("amount is less than zero, or exceeds the maximum of 150");
        }
    }
}
