import java.util.*;
import java.java.lang.*;


class quickSort {
    static void printArr(int[] arr) {
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static int partition(int[] arr, int left, int right) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (left < 0 || right >= arr.length || left > right) {
            return -1;
        } 

        int p = arr[left];
        int l = left -1;
        int r = right +1;

        while (l <= r) {
            while (++l < r && arr[l] <= p);
            while (--r >=l && arr[r] >p);

            if (l < r) {
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }
        }

        if (r > left) {
            int t = arr[left];
            arr[left] = arr[r];
            arr[r] = t;
        }
        printArr(arr);
        return r;
    }

    static void sort(int[] arr, int left, int right) {
        int m = partition(arr, left, right);
        if (m!=-1) {
            sort(arr, left, m-1);
            sort(arr, m +1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};    
        sort(arr, 0, arr.length-1);

        printArr(arr);
    }
}

