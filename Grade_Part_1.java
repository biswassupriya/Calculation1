import java.util.Scanner;

public class Grade_Part_1 {
    private static Scanner sc1=new Scanner(System.in);
    public static void main(String[] args) {
        String studentName1 = "Mahmood";
        int mark1 = 0;
        char grade1 = 'f';

        String studentName2 = "";
        int mark2 = 0;
        char grade2 = 'f';

        String studentName3 = "";
        int mark3 = 0;
        char grade3 = 'f';


        System.out.print("Enter the name for student 1: ");
        studentName1 = sc1.next();
        System.out.print("Enter the mark for student 1: ");
        mark1 = sc1.nextInt();
        grade1 = gradeCalculator(mark1);

        System.out.print("Enter the name for student 2: ");
        studentName2 = sc1.next();
        System.out.print("Enter the mark for student 2: ");
        mark2 = sc1.nextInt();
        grade2 = gradeCalculator(mark2);


        System.out.print("Enter the name for student 3: ");
        studentName3 = sc1.next();
        System.out.print("Enter the mark for student 3: ");
        mark3 = sc1.nextInt();
        grade3 = gradeCalculator(mark3);

        //====================================Print Statements=======================

        System.out.println("Name of student: "+ studentName1 +", " + "\nMark Achieved: "+ mark1
                + "\nGrade Achieved: "+grade1);
        System.out.println("\nName of student: "+ studentName2 +"\nMark Achieved: " + mark2
                + "\nGrade Achieved: "+grade2);
        System.out.println("Name of student: "+ studentName3 + "\nMark Achieved: "+ mark3 +
                "\nGrade Achieved: "+grade3);
    }
    public static char gradeCalculator(int mark)
    {
        char grade;
        if (mark >=80)
        {
            grade = 'A';
        }
        else if (mark >= 60)
        {
            grade = 'B';
        }
        else if (mark >= 50)
        {
            grade = 'C';
        }
        else
        {
            grade = 'F';
        }
        return grade;
    }
}
