package com.tms.patterns.stratage;

public class Sorter {
    private SortStratage sortStratage;

    public void setSortStratage(SortStratage sortStratage) {
        this.sortStratage = sortStratage;
    }

    public void sortArray(int[] array){
        sortStratage.sort(array);
    }
}
