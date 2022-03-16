package LessonEight;

public class ConstTest {
    static final double p = 3.14;

    double circle(double radius) {
        double area = p * radius * radius;
        return area;
    }

    static double circumference(double radius) {
        double area = 2 * p * radius;
        return area;
    }

    public void showInfo(double radius) {
        System.out.println("Radius: " + radius + " Area: " + circle(radius) + " Circumference " + circumference(radius));
    }
}

class Const {
    public static void main(String[] args) {
        ConstTest constTest = new ConstTest();
        constTest.circle(6);
        ConstTest.circumference(6);
        constTest.showInfo(6);
    }
}