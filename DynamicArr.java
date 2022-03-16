public class DynamicArr {

    int[] array = new int[10];
    int size = 0;
    int index = 0;

    public void add(int value) {
        array[index] = value;
        index++;
        size++;
    }

    public int getByIndex(int index) {
        if (index < array.length) {
            return index;
        } else {
            return -1;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int min(int[] array) {
        int min = array[0];
        for (int i :array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public void max() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                System.out.print(max + " ");
            }
        }
    }
    public void deleteByIndex(int value){
        if (index < size && index >= 0) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }
}

class DynamicArrTest {
    public static void main(String[] args) {
        DynamicArr mass = new DynamicArr();
        mass.add(1);
        mass.add(2);
        mass.add(4);
        mass.add(10);
        mass.add(20);
        mass.add(19);
        mass.add(7);
        mass.add(5);
        mass.add(2);
        mass.deleteByIndex(0);
        mass.min(mass.array);
        System.out.println();
        //mass.print();
        //System.out.println();
        //System.out.println(Arrays.toString(mass.array));
        //System.out.println(mass.getByIndex(4));

    }
}
