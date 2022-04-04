package sornting.datastructur;

public class SelectionSort {
    int arr[];
    // A constructor that creates a copy of the array passed in the arguments
    public SelectionSort(int a[]) {
        this.arr = new int[a.length];
        for (int i =0; i < a.length; i ++)
            arr[i] = a[i];
    }

    // The sort function returns the sorted array.
    public int[] sort() {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            // find the minimum from the right sub-array
            for (int j = i+1; j < n ; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            // swap the elements positioned at the ith and minIndexth position
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
