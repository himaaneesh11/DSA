package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_74 {
    static int BinarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int[] Search(int[][] arr, int target) {
        int low = 0;
        int cols = arr[0].length;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target >= arr[mid][0] && target <= arr[mid][cols - 1]) {
                int j = BinarySearch(arr[mid], target);
                return new int[]{mid, j};
            } else if (target > arr[mid][cols - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println("Enter the target number :");
        int target = input.nextInt();
        int[] result = Search(arr, target);
        if (result[1] == -1) {
            System.out.println("Invalid target");
        } else {
            System.out.println(Arrays.toString(result));
        }
    }
}
