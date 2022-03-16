package mooc;

public class Stars {
    public static void main(String[] args) {
        //printSquare(4);
        //printRectangle(4, 10);
        printTriangle(5);

    }

    public static void  printTriangle(int size) {
        if (size >= 2) {
            for (int i = 0; i < size; i++) {
                for (int j = i; j < size; j--) {
                    //printSpaces(i);
                }
                for (int k = 0; k < i; k++) {
                    printStars(k);
                }
                printSpaces(i);
            }
        }
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void printStars(int number) {
        int num = 0;
        while (num < number) {
            System.out.print("*");
            num++;
        }
        System.out.println();
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < width; i++) {
            printStars(height);
        }
    }

    public static void printSquare(int size) {
        printStars(4);
    }
}

