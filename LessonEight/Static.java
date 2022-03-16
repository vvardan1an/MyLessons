package LessonEight;

public class Static {
    static int multiplication(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    static void division(double number1, double number2) {
        double result = number1 / number2;
        System.out.println("Result: " + result);
    }
}

class StaticTest {
    public static void main(String[] args) {
        //Static.multiplication(4,5,6);
        System.out.println("Result " + Static.multiplication(4,5,6));
        Static.division(16,7);
    }
}
