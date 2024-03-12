package exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nao");
        int number = scanner.nextInt();
        int square = number * number;
        int cube = number * number * number;
        System.out.printf("so binh phuong la : %d",square);
        System.out.printf("so thap phan la:%d",cube);
    }
}
