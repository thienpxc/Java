package example;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        System.out.println("Nhập số phần tử của mảng:");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        // Nhập các phần tử cho mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.printf("Phần tử thứ %d: ", i);
            arr[i] = scanner.nextInt();
        }
        // Bước 2: Nhập X là số cần chèn
        System.out.println("Nhập số cần chèn (X):");
        int X = scanner.nextInt();
        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.println("Nhập vào vị trí index cần chèn X vào trong mảng:");
        int index = scanner.nextInt();
        // Bước 4: Kiểm tra và thông báo nếu index không hợp lệ
        if (index < 0 || index >= arr.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
            arr = insertElement(arr, X, index);
            // Bước 6: In ra mảng
            System.out.println("Mảng sau khi chèn:");
            printArray(arr);
        }

        scanner.close();
    }
    // Phương thức chèn phần tử X vào mảng tại vị trí index
    public static int[] insertElement(int[] arr, int X, int index) {
        int[] newArray = new int[arr.length + 1]; // Tạo mảng mới với độ dài lớn hơn
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = X;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = arr[i - 1];
        }
        return newArray;
    }
    // Phương thức in ra mảng
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
