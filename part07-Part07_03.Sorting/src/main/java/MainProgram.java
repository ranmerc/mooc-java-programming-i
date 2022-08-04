
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int element : array) {
            if (element < smallest) {
                smallest = element;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        return indexOfSmallestFrom(array, 0);
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1]= array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array);
            
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
