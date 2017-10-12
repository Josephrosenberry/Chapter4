import java.util.Scanner;
public class Student
{
    private String name;
    private int test1, test2;
    private double average;
    Scanner scan = new Scanner (System.in);
    public Student(String studentName)
    {
        name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter Joe's score for test1: ");
        test1 = scan.nextInt();//add body of inputGrades
        System.out.println("Enter Joe's score for test2: ");
        test2 = scan.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public double getAverage()
    {
        average =   (double) (test1 + test2 ) /2; //add body of getAverage
        return average;
    }
    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public String getName(){

        return name;

    }
}