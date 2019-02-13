
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

//        Account mattAccount = new Account("Matt's account", 1000);
//        Account myAccount = new Account("My account", 0);
//        mattAccount.withdrawal(100);
//        myAccount.deposit(100);

        Account a = new Account ("A", 100);
        Account b = new Account ("B", 0);
        Account c = new Account ("C", 0);

        transfer(a,b,50);
        transfer(b,c,25);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

//        System.out.println(mattAccount.balance());
//        System.out.println(myAccount.balance());
    }

    public static void transfer(Account account1, Account account2, double amount){
        account1.withdrawal(amount);
        account2.deposit(amount);
    }

}
