public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added){
        return new Money((this.euros+added.euros), (this.cents+added.cents));
    }


    public boolean less(Money compared){
        if((this.euros*100 + this.cents)<(compared.euros*100 + compared.cents)){
            return true;
        }

        return false;
    }

    public Money minus(Money decremented){
        int tCents = this.euros*100+this.cents;
        int dCents = decremented.euros*100+decremented.cents;
        int balance = tCents-dCents;
        int remainingEuros = balance/100;
        int remainingCents = balance%100;

//        System.out.println("balance: " +balance);
//        System.out.println("remaining Euros " + remainingEuros);
//        System.out.println("remaining cents " + remainingCents);

        if(balance>0){
            return new Money(remainingEuros,remainingCents);
        }
        return new Money(0,0);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}