/**
 * Find the names and statistics of certain name inputted
 * @author Joseph Rosenberry
 * @version 10/15/2017
 */
import java.util.*;
public class NameTest{
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        String p1First, p1Middle , p1Last, p2First, p2Middle, p2Last;
        System.out.print("\fPlease enter the name of person #1 (first,middle, last): ");
        p1First = scan.next();
        p1Middle = scan.next();
        p1Last = scan.next();
        Name person1 = new Name (p1First, p1Middle, p1Last);
        System.out.print("Please enter the name of person #2 (first, middle, last): ");
        p2First = scan.next();
        p2Middle = scan.next();
        p2Last = scan.next();
        Name person2 = new Name(p2First, p2Middle, p2Last);
        System.out.println(person1.firstMiddleLast());
        System.out.println(person1.getLast() + ", " + person1.getFirst() + " " + person1.getMiddle());
        System.out.println(person1.initials());
        System.out.println("The name length is " + person1.length()+"\n");
        System.out.println(person2.firstMiddleLast());
        System.out.println(person2.getLast() + ", " + person2.getFirst() + " " + person2.getMiddle());
        System.out.println(person2.initials());
        System.out.println("The name length is " + person2.length());
        if (person1.equals(person2))
            System.out.println("\nThe names do not match");
        else 
            System.out.println ("\nThe names are the same!");
    }
}
