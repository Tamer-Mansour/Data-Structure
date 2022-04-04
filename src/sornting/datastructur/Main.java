package sornting.datastructur;


public class Main {
    public static void main(String[] args) {
        // These four variables store the total times(in milliseconds) of each sorting algorithm over the 10 attempts.
        // Also for any of the 4 arrays below, 0th element is the total time for arrays of size 100, 1 for 1000, 2 for 10000, and 3 for 100000.
        double[] totalTimeBubble = {0, 0, 0, 0};
        double[] totalTimeInsertion = {0, 0, 0, 0};
        double[] totalTimeSelection = {0, 0, 0, 0};
        double[] totalTimeQuick = {0, 0, 0, 0};

        int[] arr_100 = new int[0];
        int[] arr_1000 = new int[0];
        int[] arr_10000 = new int[0];
        int[] arr_100000 = new int[0];
        for (int attempts = 1; attempts <= 2; attempts++) {
            arr_100 = new int[100];
            arr_1000 = new int[1000];
            arr_10000 = new int[10000];
            arr_100000 = new int[100000];
            int arrays[][] = {arr_100, arr_1000, arr_10000, arr_100000};

            for (int[] arr : arrays) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * 100);
                }
            }

            for (int arrIndex = 0; arrIndex < 4; arrIndex++) {
                int arr[] = arrays[arrIndex];
                // For each of the array, create instances of each of the 4 sorting algorithms, and note the runtime.
                BubbleSort b = new BubbleSort(arr);
                SelectionSort s = new SelectionSort(arr);
                InsertionSort i = new InsertionSort(arr);
                QuickSort q = new QuickSort(arr);

                // The start and endTimes are noted using System.currentTimeMillis. Subtraction of the two values gives the running time of the algorithm in milliseconds.
                long startTime = 0, endTime = 0;

                startTime = System.currentTimeMillis();
                int[] sortedArrBubble = b.sort();
                endTime = System.currentTimeMillis();
                totalTimeBubble[arrIndex] += ((endTime - startTime));

                startTime = System.currentTimeMillis();
                int[] sortedArrSelection = s.sort();
                endTime = System.currentTimeMillis();
                totalTimeSelection[arrIndex] += ((endTime - startTime));

                startTime = System.currentTimeMillis();
                int[] sortedArrInsertion = i.sort();
                endTime = System.currentTimeMillis();
                totalTimeInsertion[arrIndex] += ((endTime - startTime));

                startTime = System.currentTimeMillis();
                int[] sortedArrQuick = q.sort();
                endTime = System.currentTimeMillis();
                totalTimeQuick[arrIndex] += ((endTime - startTime));
            }

            System.out.println("Attempt " + attempts + " complete");
        }
        System.out.print("[");

        for (int bbs : arr_100) {
            System.out.print(bbs + ", ");
        }
        System.out.print("],[");

        for (int iis : arr_1000) {
            System.out.print(iis + ", ");
        }
        System.out.print("],[");

        for (int sss : arr_10000) {
            System.out.print(sss + ", ");
        }
        System.out.print("],[");

        for (int qqs : arr_100000) {
            System.out.print(qqs + ", ");
        }lll;k
        System.out.println("]");

        System.out.println("Average Running times");
        System.out.println("         Bubble Sort   Insertion Sort    Selection Sort     Quick Sort");
        System.out.println("List of size 100         " + totalTimeBubble[0] / 10 + "\t\t" + totalTimeInsertion[0] / 10 + "\t\t" + totalTimeSelection[0] / 10 + "\t\t" + totalTimeQuick[0] / 10);
        System.out.println("List of size 1000        " + totalTimeBubble[1] / 10 + "\t\t" + totalTimeInsertion[1] / 10 + "\t\t" + totalTimeSelection[1] / 10 + "\t\t" + totalTimeQuick[1] / 10);
        System.out.println("List of size 10000       " + totalTimeBubble[2] / 10 + "\t\t" + totalTimeInsertion[2] / 10 + "\t\t" + totalTimeSelection[2] / 10 + "\t\t" + totalTimeQuick[2] / 10);
        System.out.println("List of size 100000      " + totalTimeBubble[3] / 10 + "\t" + totalTimeInsertion[3] / 10 + "\t" + totalTimeSelection[3] / 10 + "\t" + totalTimeQuick[3] / 10);
    }
}