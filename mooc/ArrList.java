package mooc;


import java.util.Scanner;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name ");
        //sc1.nextLine();

        ArrayList<String> aL1 = new ArrayList<>();
        for (String s: aL1){
            if(sc1.nextLine() == null && aL1.size() < 4) {
                break;
            }
            aL1.add("Tom");
            aL1.add("Ann");
            aL1.add("Sam");
            aL1.add("Tik");
        }
        System.out.println(aL1.get(2));
    }
}
