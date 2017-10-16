/**
 * Coin lab
 * @author Joseph Rosenberry
 * @version 10/3/2017
 */
public class Coin
{

    // When using static, it only creates one copy of the variable for the entire program to use. 
    public static final int HEADS = 0;
    public static final int TAILS = 1;

    private int face; // Instance variable, each coin object will have it's own copy. Contains 'heads' or 'tails'. 

    /**
     * Constructor Method. Called when new Coin() is executed.
     * Note:
     *      1) name of constructor is EXACTLY the class name 'Coin'. Case sensitive 
     *      2) there is no return type in the header, not even 'void'
     */
    public Coin ()
    {
        flip ();
    }

    /**
     * Method to randomly generate 'heads' or 'tails'.
     * Simulates coin flipping. 
     * Return type is void - no information is passed back. 
     */
    public void flip () // This is method header, no ; after header.
    {
        face = (int) (Math.random() * 2); // Returns 0 or 1 
    }

    /**
     * Method to evaluate face of a coin. Returns 'true' if the coin is facing heads up.
     * @return true if coin is 'heads', false if coin is 'tails' 
     */
    public boolean isHeads ()
    {
        return (face == HEADS);
    }

    /**
     * Returns a string representation of the coin object. 
     * Every class you write should have a toString() method. 
     * @return string representation of a Coin object. 
     */

    public String toString()
    {
        String faceName;    //Local variable, only exists in method
        //Will be deleted when method is done executing.
        //If you don't put a modifier, it defaults to public. 
        if (isHeads())
            faceName = "Heads";
        else
            faceName = "Tails";
        return faceName;
    }
}