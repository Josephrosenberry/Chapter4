import java.util.*;
public class BandTest{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        int x = 1;
        int tyler;
        int joe;
        int y = 1;
        BandBooster name1, name2;
        String n1, n2;
        System.out.print("\fPlease enter the name of the band booster: ");
        n1 = scan.nextLine();
        name1 = new BandBooster(n1);
        System.out.print("Please enter the name of another band booster: ");
        n2 = scan.nextLine();
        name2 = new BandBooster(n2);
        while (x<4){
            System.out.print("Enter the number of boxes sold by " + n1 + " for week " + x + ":");
            joe = scan.nextInt();
            name1.updateSales1(joe);
            x++;

        }    
        System.out.println();
        while (y<4){
            System.out.print("Enter the number of boxes sold by " + n2 + " for week " + y + ":");
            tyler = scan.nextInt();
            name2.updateSales1(tyler);
            y++;
        }
        
        System.out.println(name1.toString());
        System.out.println(name2.toString());
    }
}