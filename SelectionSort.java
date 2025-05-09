import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {40, 44, 56, 323, 6, 78, 99,};
        selection(arr);
        int[] arrs = {4, 444, 56, -323, 0, 0, 99,};
        selectionOPTIMIZE(arrs);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrs));

    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void selectionOPTIMIZE(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1, max = 0;
            for (int j = 1; j <= last; j++)
                if (arr[j] > arr[max]) max = j;
            int temp = arr[max]; arr[max] = arr[last]; arr[last] = temp;
        }
    }


}