package org.chapeullah;

import org.chapeullah.sort.n2.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SelectionSort.selectionSort(new int[]{1, 5, 7, 2, 2, 3, 4, 1, 2, 0, -2})));
    }
}