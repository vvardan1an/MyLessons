package Anubis;


public class Zoo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 1; i < j; j++){
                if(i % j == 0) {
                    continue;
                }
                System.out.println(arr[i]);
            }
        }
    }
}
