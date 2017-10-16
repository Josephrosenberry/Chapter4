/**
 * BandBooster.java checks the fundraising completed by a band member and calculates the boxes sold
 * @version 10/15/2017
 * @author Joseph Rosenberry
 */
public class BandBooster{
    private int boxesSold;
    private String name;

    public BandBooster(String n){
        name = n;
        boxesSold = 0;
    } 
    
    public void updateSales1(int g){
        boxesSold += g;
    } 
    
    public String getName()
    {
        return name;
    }
    
    public String toString(){
        return name + " sold " + boxesSold + " boxes.";
    }
}

