package example;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("vui long nhap 1 so");
            System.out.println("memu");
            System.out.println("1. kiem tra tinh chan le");
            System.out.println("2. kiem tra nguyen to");
            System.out.println("3. kiem tra mot so co chia het cho 3 khong");
            System.out.println("4. thoat");
            boolean isExits = false;
            choice = scanner.nextInt();
         switch (choice){
             case 1:
                 System.out.println("nhap so kiem tra chan le");
                 int num = scanner.nextInt();
                 if (num % 2 ==0){
                     System.out.println("so chan");
                 }else {
                     System.out.println("so le");
                 }
                 break;
             case 2:
                 System.out.println("nhap so kiem tra nguyen to");
                 int element = scanner.nextInt();
                 int sqrtValue = (int) Math.sqrt(element);
                 boolean isPrime = true;
                 for(int i =2 ; i <= sqrtValue; i++){
                     if (element % i == 0){
                         isPrime = false;
                         break;
                     }
                 }
                 System.out.println(isPrime ? "day la so nguy to" : "day khong phai la so nguyen to");
                 break;
             case 3:
                 System.out.println("nhap so chia het cho 3");
                 int divisible = scanner.nextInt();
                 if (divisible % 3 == 0){
                     System.out.println("so chia het cho 3");
                 }else {
                     System.out.println("so khong chia het cho ba");
                 }
                 break;
             case 4:
                 isExits = true;
                 break;
             default:
                 System.out.println("so ban nhap khong hop le");
         }
         if (isExits){
             break;
         }
        }
    }
}
