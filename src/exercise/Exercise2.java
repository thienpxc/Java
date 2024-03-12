package exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien can doi");
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.printf("ket qua chuyen doi tu usd sang vnd: %d",vnd);
    }
}
