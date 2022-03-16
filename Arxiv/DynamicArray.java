package Arxiv;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    // extend the size of array;
    private void extend() {
        int[] extendedArray = new int[array.length + 10];

        for (int k = 0; k < array.length; k++) {
            extendedArray[k] = array[k];
        }
        array = extendedArray;
    }

    public int sizeOfArray() {
        return size;
    }

    public int getByIndex(int id) {
        if (id >= 0 && id < size) {
            return array[id];
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    //find the biggest number in array;
    public int max() {
        int maxValue = array[0];
        for (int j : array) {
            if (j > maxValue)
                maxValue = j;
        }
        return maxValue;
    }

    public int min() {
        int minValue = array[0];
        for (int j : array) {
            if (j < minValue)
                minValue = j;
        }
        return minValue;
    }

    public void deleteByIndex(int index) {
        if (index < size && index >= 0) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void deleteAllByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
                i--;
            }
        }
    }

    //մասիվից ջնջում ենք տված value-ին հավասար միայն առաջին էլեմենտները։ Այսինքն եթե ասում ենք ջնջի 23 թիվը, ու մասիվում ունենք 2 և ավել 23-ներ, կջնջի միայն առաջինը։
    public void deleteByValueFirst(int value) {
        for (int k = 0; k < size; k++) {
            if (array[k] == value) {
                deleteByIndex(k);
                break;
            }
        }
    }

    //մասիվից ջնջում ենք տված value-ին հավասար միայն առաջին էլեմենտները։ Այսինքն եթե ասում ենք ջնջի 23 թիվը, ու մասիվում ունենք 2 և ավել 23-ներ, կջնջի միայն առաջինը։
    public void deleteByValueLast(int value) {
        for (int k = size; size > 0; k--) {
            if (array[k] == value) {
                deleteByIndex(k);
                break;
            }
        }
    }

    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և endIndex-ի, որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    //int[] reserveArray;

    public int[] subArray(int startIndex, int endIndex) {
            int[] reserveArray  = new int[endIndex-startIndex];
            int var =0;

            for (int i = startIndex; i < endIndex; i++) {

                reserveArray[var] = array[i];
                var++;
            }
            return reserveArray;
    }

    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և մինչև վերջին էլեմենտի, որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    public int[] subArray(int startIndex) {
        return null;
    }

    public static void main(String[] args) {
        DynamicArray prise = new DynamicArray();

        prise.add(1);
        prise.add(2);
        prise.add(3);
        prise.add(4);
        prise.add(5);
        prise.add(6);
        prise.add(43);
        prise.add(56);

        prise.print();

        int[] ints = prise.subArray(2, 5);
        for (int i = 0;i< ints.length;i++){
            System.out.println(ints[i]);
        }


        // System.out.println(prise.reserveArray[2]);


        //prise.deleteByValueLast(10);
        //prise.deleteByValueFirst(10);
        //prise.deleteAllByValue(10);
        //prise.deleteAllByValue(20);


    }
}