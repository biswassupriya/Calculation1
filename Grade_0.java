import java.util.Scanner;

public class Grade_0 {
    public static Scanner sc=new Scanner(System.in);//using the Scanner class to read input from screen
    public static void main(String[] args)
    {
        String name;
        int mark;
        char grade;
        System.out.print("Please enter the name of the student: ");
        name=sc.next();//next() reads a String from the screen

        System.out.print("Please enter the mark for "+ name+": ");
        mark=sc.nextInt();//nextInt() reads an integer from the screen

        //Logic statements to work out the grade based on the mark achieved
        if (mark>=80)
        {
            grade='A';
        }
        else if(mark >=60)
        {
            grade='B';
        }
        else if (mark >=50)
        {
            grade='C';
        }
        else
        {
            grade='F';
        }

        System.out.println("Name of student: "+name);
        System.out.println("Mark achieved by "+name+":"+mark);
        System.out.println("Grade achived by "+name+":"+ grade);
    }

}
