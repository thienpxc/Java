package example;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri ban dau");
        int start = scanner.nextInt();
        System.out.println("nhap gia tri ket thuc");
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i ++){
            if(i % 2 ==0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);
    }
}
