package example;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số dòng tương ứng:");
        byte row = scanner.nextByte();
        System.out.println("Vui lòng nhập số cột tương ứng:");
        byte col = scanner.nextByte();
        byte[][] numberArr = new byte[row][col];

        // Nhập các phần tử cho mảng
        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
            for (int colIndex = 0; colIndex < col; colIndex++) {
                System.out.printf("Vui lòng nhập phần tử tại dòng %d, cột %d:\n", rowIndex + 1, colIndex + 1);
                numberArr[rowIndex][colIndex] = scanner.nextByte();
            }
        }

        // Tìm giá trị nhỏ nhất
        byte min = numberArr[0][0];
        byte item;
        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
            for (int colIndex = 0; colIndex < col; colIndex++) {
                item = numberArr[rowIndex][colIndex];
                if (min > item) {
                    min = item;
                }
            }
        }
        System.out.printf("Giá trị nhỏ nhất trong mảng bạn vừa nhập là: %d\n", min);
    }
}
