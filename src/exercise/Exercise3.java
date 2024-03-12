package exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        int length = scanner.nextInt();
        System.out.println("Nhap chieu rong");
        int width = scanner.nextInt();
        int perimeter = (length + width)*2;
        int acreage = length * width;
        System.out.printf("chu vi la : %d",perimeter);
        System.out.printf("dien tich la : %d",acreage);
    }
}
