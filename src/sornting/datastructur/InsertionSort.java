package sornting.datastructur;

public class InsertionSort {
    int arr[];
    // A constructor that creates a copy of the array passed in the arguments
    public InsertionSort(int a[]) {
        this.arr = new int[a.length];
        for (int i =0; i < a.length; i ++)
            arr[i] = a[i];
    }

    // The sort function returns the sorted array.
    public int[] sort() {
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            int key = arr[i];
            // Put the element arr[i] into the sorted sub-array arr[0....(i-1)]
            int j = i-1;
            while (j >=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            // Finally place the key at its position i.e. (j+1)th index
            arr[j+1] = key;
        }
        return arr;
    }
}