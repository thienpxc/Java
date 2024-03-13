package example;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chuong trinh chuyen doi tu so sang chu");
        int number;
        do{
            System.out.println("nhap 0 so tu 0 toi 9");
            number = scanner.nextInt();
            switch (number){
                case 0 :
                    System.out.println("so 0");
                    break;
                case 1 :
                    System.out.println("so 1");
                    break;
                case 2 :
                    System.out.println("so 2");
                    break;
                case 3 :
                    System.out.println("so 3");
                    break;
                case 4 :
                    System.out.println("so 4");
                    break;
                case 5 :
                    System.out.println("so 5");
                    break;
                case 6 :
                    System.out.println("so 6");
                    break;
                case 7 :
                    System.out.println("so 7");
                    break;
                case 8 :
                    System.out.println("so 8");
                    break;
                case 9 :
                    System.out.println("so 9");
                    break;
                default:
                    System.out.println("nhap so khong hop le");
            }
        }
        while (number != 100);

        }



    }

