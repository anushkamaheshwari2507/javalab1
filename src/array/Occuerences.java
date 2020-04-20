package array;

import java.util.Scanner;

public class Occuerences {
    public static void main(String[] args) {
        Occuerences obj = new Occuerences();
        int n;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element you want to find its occurences");
        n = sc.nextInt();
        System.out.println("enter the size of the array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = obj.arraysearch(arr, n, size);
        System.out.println("number of times element is present is=" + count);
    }

    public int arraysearch(int[] arr, int n, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }
}
