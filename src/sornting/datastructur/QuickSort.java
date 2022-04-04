package sornting.datastructur;

public class QuickSort {
    int arr[];
    // A constructor that creates a copy of the array passed in the arguments
    public QuickSort(int a[]) {
        this.arr = new int[a.length];
        for (int i =0; i < a.length; i ++)
            arr[i] = a[i];
    }

    // The sort function returns the sorted array.
    public int[] sort() {
        int n = arr.length;
        sortUtil(0, n-1);
        return arr;
    }

    // This is the recursive helper function used by sort()
    private void sortUtil(int low, int high) {
        if (low >= high)return;
        int partition = partition(low, high);
        sortUtil(low, partition-1);
        sortUtil(partition+1, high);
    }

    // This function picks arr[high] as the pivot element.
    private int partition(int low, int high) {
        int pivot = arr[high];
        // At the end of the traversal i will denote the position immediately left to the pivot element.
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                // This element is to be to the left of pivot
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Finally swap arr[i+1] and arr[high]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        // The pivot is stored at (i+1)th index.
        return (i+1);
    }
}