package com.tms.patterns.stratage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 1, 2, 6};
        System.out.println(Arrays.toString(numbers));

        Sorter sorter = new Sorter();

        sorter.setSortStratage(new InsertionSort());

        sorter.sortArray(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
