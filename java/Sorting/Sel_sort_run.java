package Sorting;

public class Sel_sort_run {
    public static void main(String args[])
    {
        Sorting ob = new Sorting();
        int arr[] = {64,25,12,22,11};
        System.out.println("Unsorted array");
        ob.printArray(arr);

        ob.Selectionsort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
