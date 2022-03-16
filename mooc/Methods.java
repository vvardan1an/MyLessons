package mooc;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give number? ");
//        int numerator = scanner.nextInt();
//        System.out.println("Give den? ");
//        int denominator = scanner.nextInt();
//        System.out.println("Please!");
//        division(numerator,denominator);
//    }
//    public static void division (int numerator ,int denominator){
//        System.out.println(numerator/denominator);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give beginning: ");
        int beginning = scanner.nextInt();
        System.out.println("Give end: ");
        int end = scanner.nextInt();
        System.out.println("Please");
        divisibleByThreeInRange(beginning,end);
    }
    public static void divisibleByThreeInRange(int beginning ,int end ){
        for (int i = beginning ; i <=end; i++){
            if(i%3 == 0){
                System.out.println(i);
            }
        }

    }
}
