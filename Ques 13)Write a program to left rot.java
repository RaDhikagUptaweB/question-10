/*Ques 13)Write a program to left rotate an array.
For Example
Input
Input 10 elements in array: 1 2 3 4 5 6 7 8 9 10
Input number of times to rotate: 3
Output
Array after left rotation 3 times: 4 5 6 7 8 9 10 1 2 3*/
  

import java.util.Arrays;

public class LeftRotation {
public static void main(String[] args) {
int[] arr = { 1, 2, 3, 4, 5 };
int r = 2;

 leftRotate(arr, r);

    System.out.println(Arrays.toString(arr));
}

public static void leftRotate(int[] arr, int r) {
    if (arr == null || arr.length == 0 || r <= 0) {
        return;
    }

    int n = arr.length;
    r = r % n;

    reverseArray(arr, 0, r - 1);
    reverseArray(arr, r, n - 1);
    reverseArray(arr, 0, n - 1);
}

public static void reverseArray(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}