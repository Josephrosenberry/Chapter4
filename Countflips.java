/**
 * CoinFlips. Flips a coin multiple times and counts the number of heads and tails that result
 * @Author Joseph Rosenberry
 * @version 10/3/2017
 */

public class Countflips
{
    public static void main (String [] args)
    {
        final int NUM_FLIPS = 2;
        int heads = 0, tails = 0; // Holds number heads/tails
        int c1heads = 0;
        int c2heads= 0;
        System.out.println("\f");
        Coin c1 = new Coin(); // Initiate/Creates the coin object
        Coin c2 = new Coin(); // Initializes second object
        System.out.println(" c1 \t\tc2");    
       while (c1heads !=3 && c2heads !=3){
            c1.flip();
            c2.flip();
            System.out.println(" " + c1 + "\t\t" + c2);
            
            if (c1.isHeads())
                c1heads++;
            else
                c1heads = 0;
                
            if (c2.isHeads())
                c2heads++;
            else 
                c1heads = 0;
                
            }  
            if (c1heads == c2heads)
                System.out.println ("\nIts a tie! c1 and c2 Flipped 3 heads in a row!.");
            else if (c1heads < c2heads)
                System.out.println ("\nc2 wins!");
            else
                System.out.println ("\nc1 wins!");
    }
}