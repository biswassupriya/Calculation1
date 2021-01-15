import java.util.Scanner;

public class Grades_Part_2 {
    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        // TODO Auto-generated method stub
        String studentName="";
        int mark=0;
        char grade='f';
        String results="";
        int numberOfStudents =0;

        System.out.print("Enetr the number of students: ");
        numberOfStudents=sc1.nextInt();
        sc1.nextLine();

        for (int i =1; i<= numberOfStudents;i++)
        {
            System.out.print("Enter the name for student "+ i+": ");
            studentName=sc1.nextLine();
            System.out.print("Enter the mark achieved by student "+ i+": ");
            mark=sc1.nextInt();
            sc1.nextLine();

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
            results=results+"Name of Stduent: "+studentName+", Mark achieved: "+mark+
                    ", Grade Achieved: "+ grade+"\n";
        }

        System.out.print("Student Details as follows: \n"+results);
    }
}
