/**
 *    Use Account class to create and manage Sally and Joe's 
 *    bank accounts  
 *    @version 10/12/2017
 *    @author Joseph Rosenberry
 */

public class ManageAccounts
{
    public static void main(String[] args)
    {
        System.out.println("\f");
        Account acct1, acct2;

        //create account1 for Sally with $1000
        acct1 = new Account(1000, "Sally", 1111);

        acct2 = new Account (500, "Joe", 2222);//create account2 for Joe with $500

        acct2.deposit(100);//deposit $100 to Joe's account

        System.out.println("Joe's balance is $" + String.format("%.2f", acct2.getBalance()) + "\n");//print Joe's new balance (use getBalance())

        acct2.withdraw(1000);//withdraw $1000 from Joe’s account

        acct1.withdraw(50);//withdraw $50 from Sally's account

        System.out.println("\nSally's balance is $" + String.format("%.2f",acct1.getBalance()) + "\n");//print Sally's new balance (use getBalance())
        acct1.chargeFee();
        acct2.chargeFee();
        System.out.println("Service Fee Charged - Sally's balance is $" + String.format("%.2f", acct1.getBalance()));//charge fees to both accounts
        System.out.println("\nService Fee Charged - Joe's balance is $" + String.format("%.2f",acct2.getBalance()));

        acct2.changeName("Joseph"); //change the name on Joe's account to Joseph

        System.out.println( acct1 ); //print summary for both accounts
        System.out.println( acct2 );
    }
}
