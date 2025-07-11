import java.util.Arrays;

class MergeSortWithRecursion {

    static int[] mergesort(int[] arr, int s, int e) {
        if (s == e) {
            return new int[]{arr[s]};  // base case: single element
        }
        int m = s + (e - s) / 2;
        int[] left = mergesort(arr, s, m);
        int[] rig = mergesort(arr, m + 1, e);
        return merge(left, rig);
    }

    static int[] merge(int[] l, int[] r) {
        int[] mix = new int[l.length + r.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                mix[k] = l[i];
                i++;
            } else {
                mix[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < l.length) {
            mix[k] = l[i];
            i++;
            k++;
        }
        while (j < r.length) {
            mix[k] = r[j];
            j++;
            k++;
        }
        return mix;
    }


    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 7, 2, 12, 14};
        int[] ans = mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(ans));

    }
}
