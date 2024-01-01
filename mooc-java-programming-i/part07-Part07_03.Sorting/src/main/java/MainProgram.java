import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest){
                smallest = array[i];
                temp = i;
            }
        }
        return temp;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex];
        int temp = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest){
                smallest = table[i];
                temp = i;
            }
        }
        return temp;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int smallest;
        for (int i = 0; i < array.length; i++) {
            smallest = indexOfSmallestFrom(array, i);
            swap(array, smallest, i);
            System.out.println(Arrays.toString(array));
        }
    }

}
