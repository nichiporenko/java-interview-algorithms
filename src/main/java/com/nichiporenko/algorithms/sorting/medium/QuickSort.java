package com.nichiporenko.algorithms.sorting.medium;

public class QuickSort {

    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int p = partition(nums, low, high);
            quickSort(nums, low, p);
            quickSort(nums, p + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[(low + high) / 2];
        int i = low;
        int j = high;

        while (true) {
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }
            if (i >= j) {
                return j;
            }
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
