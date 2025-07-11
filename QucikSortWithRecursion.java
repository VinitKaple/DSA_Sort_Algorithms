import java.util.Arrays;

public class QucikSortWithRecursion {

    static void quick(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pvtI = partition(arr, si, ei);
        quick(arr, si, pvtI - 1);
        quick(arr, pvtI + 1, ei);
    }

    static int partition(int[] arr, int si, int ei) {
        int i = si - 1;
        int pvt = arr[ei];
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pvt) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pvt;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 9, 4, 0, -1};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
