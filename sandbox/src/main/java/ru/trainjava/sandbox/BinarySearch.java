package ru.trainjava.sandbox;

public class BinarySearch {
    public static int Search(int[] list, int item) {

        int low = 0;
        int high = list.length - 1;
        int mid;
        //Integer j = null;
        while (low <= high) {
            mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

  /* public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        System.out.println(search.Search(new int[]{1,2,4,8},9));
    }*/

}
