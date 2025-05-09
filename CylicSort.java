import java.util.Arrays;

public class CylicSort { //(if start from 0 not given cylic take 1 to n)

    public static void main(String[] args) {
        int[] arr = {4, 7, 5, 1, 6, 3, 2};
        CS(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void CS(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            i++;
        }
    }

}
