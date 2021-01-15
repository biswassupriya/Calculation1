package Software;

public class CalculateSum {

    public static void main(String[] args) {
        System.out.println("Hello world");
        double number1 = 10.0d;
        double number2 = 20.0d;
        double result = add(number1, number2);
        //CalculateSum c = new CalculateSum();
        //System.out.println(c.add(number1, number2));
    }

    public static   double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }


}
