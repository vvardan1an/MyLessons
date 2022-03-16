package LessonEightTeen;

public class ArraySort {
    public static void sort(int[] array) {
        int sort = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    sort = array[i];
                    array[i] = array[j];
                    array[j] = sort;
                }
            }
            System.out.println(array[i]);
        }
    }

    public static void showArray(String[][] array) {
        String[][] arr = {{"element0", "element1"}, {"element10"}, {"element10", "element11"}};
        System.out.println(arr);
    }

    public static void main(String[] args) {
        //int[] array = {1, 9, 2, 4, -4, 7, 10, 25, 21};
        //ArraySort.sort(array);
        String s1 = new String();
        //ArraySort.showArray();
    }
}
