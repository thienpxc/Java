package exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri usd");
        int usd = scanner.nextInt();
        int vnd = rate * usd;
        System.out.printf("ket qua chuyen doi tu usd sang vnd: %d",vnd);
    }
}
