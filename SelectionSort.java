import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arrs = { 4, 444, 56, -323, 0, 0, 99, };
        selectionOPTIMIZE(arrs);
        System.out.println(Arrays.toString(arrs));

    }

    static void selectionOPTIMIZE(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1, max = 0;
            for (int j = 1; j <= last; j++)
                if (arr[j] > arr[max])
                    max = j;
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }

}