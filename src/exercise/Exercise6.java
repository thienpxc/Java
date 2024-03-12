package exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem toan");
        float toan = scanner.nextFloat();
        System.out.println("nhap diem van");
        float van = scanner.nextFloat();
        System.out.println("nhap dien anh");
        float anh = scanner.nextFloat();
        float totalScore = toan + van + anh;
        float medium = totalScore / 3;
        System.out.printf("tổng điểm %.2f", totalScore);
        System.out.printf("Tong diem trung binh %.2f",medium );

    }
}
