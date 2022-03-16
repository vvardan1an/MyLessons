package mooc;

import java.util.Scanner;

public class MoreLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int val = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give number: ");
        while (true) {
            int user = scanner.nextInt();
            if (user > -1) {
                val++;
                sum = sum + user;
                if (user % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else if (user == -1) {
                System.out.println("Thx bye!The sum is = " + sum + " Value = " + val + " Average: " + (double) sum / val
                        + " Even " + even + " Odd " + odd);
                sum = sum + user;
                break;
            }
        }
    }
    // int sum = 1;
//        System.out.println("First number? ");
//        int user = scanner.nextInt();
//        System.out.println("Last number? ");
//        int user2 = scanner.nextInt();
//        for (int i = 1; i <= user; i++) {
//            sum *= i;
//        }
//        System.out.println("The sum is: " + sum);

//        System.out.println("Where to? ");
//        int user = scanner.nextInt();
//        System.out.println("Where from? ");
//        int user1 = scanner.nextInt();
//        for(int i = user1;i <= user;i++){
//            System.out.println(i);


//        System.out.println("Give number: ");
//        int user = scanner.nextInt();
//        int i = 0;
//        while (i < user){
//            i++;
//            System.out.println(i);
//        }
//       for(int i = user;i <= 100;i++){
//            System.out.println(i);
//        }
}
