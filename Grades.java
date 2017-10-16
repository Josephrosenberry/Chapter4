// ****************************************************************
// Grades.java
//
// Use Student class to get test grades for two students
// and compute averages
//
// ****************************************************************
import java.util.Scanner;
public class Grades
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\fEnter name: ");
        String name1 = scan.nextLine();
        Student student1 = new Student(name1);
        System.out.print("Enter name2: ");
        String name2 = scan.nextLine();
        Student student2 = new Student (name2);
        System.out.println("Enter grades for " + name1 + ": ");
        int test1 = scan.nextInt();
        int test2 = scan.nextInt();
        System.out.println("Average grade for " + name1+ " is: " + student1.getAverage(test1, test2));//print average for Mary
        System.out.println();
        System.out.println("\nEnter grades for " + name2 + ": ");
        int test3 = scan.nextInt();
        int test4 = scan.nextInt();
        System.out.println("\nAverage for "+ name2 +" is: " + student2.getAverage(test3, test4));//print average for Mike
        System.out.println("Name: " + student1.getName() + "   Test1: " + test1 + "   Test2: " + test2 + " Average: " + student1.getAverage(test1, test2));
        System.out.println("Name: " + student2.getName() + "   Test1: " + test3 + "   Test2: " + test4 + " Average: " + student2.getAverage(test3, test4));
    }
}