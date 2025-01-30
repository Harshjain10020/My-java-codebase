import java.util.*;
public class sorting {

    public static void bubblesort(int arr[]) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++)// turns
        {
            for (int j = 0; j < arr.length - 1 - i; j++)// swaps
            {
                if (arr[j] > arr[j + 1]) {
                    // swap

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println(swaps);
    }

    public static void selectionSort(int arr[]){
    for (int i = 0; i < arr.length-1; i++) {
        int minpos =i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minpos]>arr[j]) {
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos]= arr[i];
            arr[i]= temp;
        }
    }


    public static void insertionsort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr =arr[i]; 
            int prev = i-1;
            //finding the correct position to insert 
            //change arr[prev] < curr to arr[prev] > curr to dsc to asc 
            while (prev >=0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;

            }
            //insertion
            arr[prev+1]= curr; 

        }
    }
    public static void countsort(int arr[]){
        int lr = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            lr = Math.max(lr, arr[i]);
        }
        int count[] = new int[lr+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // public static void printarr(Integer[] arr1) {
    //     for (int i = 0; i < arr1.length; i++) {
    //         System.out.print(arr1[i] + " ");
    //     }
    //     System.out.println();
    // }
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1,1, 3, 2 };
        Integer arr1[] = { 5, 4, 1, 3, 2 };
        countsort(arr);
        printarr(arr);
        // bubblesort(arr);
        // selectionSort(arr);
        // insertionsort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,4);
        // Arrays.sort(arr1,Collections.reverseOrder());
        // Arrays.sort(arr1,0,3,Collections.reverseOrder());
        // printarr(arr1);
    }
}