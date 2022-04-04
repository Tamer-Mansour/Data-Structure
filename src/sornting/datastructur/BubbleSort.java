package sornting.datastructur;

public class BubbleSort {
    int arr[];
    // A constructor that creates a copy of the array passed in the arguments
    public BubbleSort(int a[]) {
        this.arr = new int[a.length];
        for (int i =0; i < a.length; i ++)
            arr[i] = a[i];
    }

    // The sort function returns the sorted array.
    public int[] sort() {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}