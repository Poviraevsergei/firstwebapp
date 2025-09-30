package com.tms.patterns.stratage;

public class BubbleSort implements SortStratage {
    @Override
    public void sort(int[] array) {
        System.out.println("Bubble Sort");
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
    }
}
