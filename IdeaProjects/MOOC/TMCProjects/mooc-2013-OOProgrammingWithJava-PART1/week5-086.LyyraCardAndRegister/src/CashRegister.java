
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;


    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        double economicalLunch = 2.5; // price of the economical lunch is 2.50 euros
        if (cashGiven >= economicalLunch) { // if the given cash is at least the price of the lunch:
            this.cashInRegister += economicalLunch; //    the price of lunch is added to register
            economicalSold++; //    the amount of sold lunch is incremented by one
            return cashGiven - economicalLunch; //    method returns cashGiven - lunch price
        } else {
            return cashGiven; // if not enough money given, all is returned and nothing else happens
        }
    }

    public boolean payEconomical(LyyraCard lyyraCard){ // Method Overload to allow payment with LyyraCard
        double economicalLunch = 2.5;
        if(lyyraCard.balance()>=economicalLunch){
            economicalSold++;
            return lyyraCard.pay(economicalLunch);
        }
        else {
            return false;
        }
    }

    public double payGourmet(double cashGiven) {

        double gourmetLunch = 4;
        if (cashGiven >= gourmetLunch) {
            this.cashInRegister += gourmetLunch;
            gourmetSold++;
            return cashGiven - gourmetLunch;
        } else {
            return cashGiven;
        }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
    }

    public boolean payGourmet(LyyraCard lyyraCard){ // Method Overload to allow payment with LyyraCard
        double gourmetLunch = 4;
        if(lyyraCard.balance()>=gourmetLunch){
            gourmetSold++;
            return lyyraCard.pay(gourmetLunch);
        }
        else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {

        if (this.cashInRegister >= sum && sum >= 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
