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
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public double getAverage(int test1, int test2)
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