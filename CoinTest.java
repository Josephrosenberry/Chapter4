/**
 * Finds the length of the longest run of heads in 100 flips of a coin.
 * @author Joseph Rosenberry
 * @version 10/10/2017
 */
public class CoinTest
{
    public static void main (String[] args)
    {
        final int FLIPS = 10; 
        int currentRun = 0;
        int maxRun = 0;
        Coin c1 = new Coin();
            
                for (int i = 0; i < FLIPS; i++)
                {
                    c1.flip();
                    System.out.println(c1);
                    
                    if (c1.isHeads()){
                        currentRun++;
                    }
                    else {
                        if (currentRun>maxRun)
                        maxRun = currentRun;
                        currentRun=0;
                }
              
            }
            System.out.println("The maximum run of heads was " + maxRun + ".");
    }
}