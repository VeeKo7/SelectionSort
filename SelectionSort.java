package com.vee.chapter7.selection_sort;


import java.util.Arrays;

public class SelectionSort {

    /**
     *sorting double type elements
     * from the array in
     * ascending order
     * @param list - array that needs to be sorted
     * */
    public static void selectionSort(double [] list) {

        /*
        * find smallest element in the array
        * */
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            /*
            * comparing first element from outer loop
            * with second element from inner loop
            * */
            for (int j = i + 1; j < list.length; j++) {
                /*
                * if first number is greater than number after it
                * make first number equal to smaller value
                * of the next number
                * */
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    /*the smaller number would change
                    towards the beginning of the array
                     */
                    currentMinIndex = j;
                }
            }

            /*
            * swapping list[i] with list[currentMinIndex] if necessary
            * */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }

}

class Main {
    public static void main(String[] args) {

        double [] list = {1, 3, 5, 4, 2, 6, 7};
        SelectionSort.selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
