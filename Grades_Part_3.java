import java.util.Scanner;

public class Grades_Part_3 {
    static private Scanner sc1 = new Scanner(System.in);
    public static void main(String[] args)
    {
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
            studentName=sc1.next();
            System.out.print("Enter the mark achieved by the student "+ i+": ");
            mark=sc1.nextInt();
            grade=gradeCalculator(mark);
            results=results+"\n"+i+"-Name of Stduent: "+studentName+"\nMark achieved: "+mark+"\nGrade Achieved: "+ grade+"\n==================";
            //System.out.println("Name of student: "+ studentName+", " + "\nMark Achieved: "+ mark+ "\nGrade Achieved: "+grade);
        }
        System.out.print("Student Details as follows: \n"+results);
    }//main()

    public static char gradeCalculator (int mark)
    {
        char gradeAchieved;
        if(mark >=80)
        {
            gradeAchieved='A';
        }

        else if(mark>=60)
        {
            gradeAchieved='B';
        }
        else if (mark>=50)
        {
            gradeAchieved='C';
        }
        else
        {
            gradeAchieved='F';
        }
        return gradeAchieved;
    }
}
