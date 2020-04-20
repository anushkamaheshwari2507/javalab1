package duplicate;

import java.util.Scanner;

public class DuplicateinArray {
    public static void main(String[] args) {
        DuplicateinArray obj = new DuplicateinArray();
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        obj.duplicate(arr, size);
    }

    public void duplicate(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicate element is=" + arr[i]);
                }
            }

        }
    }
}
