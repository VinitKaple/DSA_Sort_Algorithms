import java.util.Arrays;

//baapSORT
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {22, 44, 55, 5, 667, 1, 46, 98,};
        int[] num = {1, 2, 3, 4, 5, 6};
        int[] eq = {1, 1, 2, 4, 5, 2, 0, 6, -2};
        BS(nums);
        BS(num);
        BS(eq);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(eq));
    }

    static void BS(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap) { //!false=true or swap==false
                break; //break kiya if i++ loop
            }
        }
    }
}
