public class lop {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printTriangle(int size) {
        for (int i = 0; i <= size; i++) {
            printSpace(size , i);
            printStar(i);
//            for (int j = i; j < size; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
            System.out.println();
        }
    }

    public static void printStar(int number){
        for (int j = 0; j < number; j++) {
            System.out.print(" ");
        }
    }

    public static void printSpace(int size , int i){
        for (int j = i; j < size; j++) {
            System.out.print(" ");
        }
    }
}
