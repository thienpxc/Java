package example;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chuong trinh chia het cho 3 vs 5");

        String continous;
        do{
            System.out.println("nhap so de chia het cho 3 va 5");
            int checkNumber = scanner.nextInt();
            scanner.nextLine();
            if (checkNumber % 3 == 0 &&
                    checkNumber % 5 == 0) {
                System.out.println("so chia het cho 3 va 5 ");
            } else if (checkNumber % 3 == 0 &&
                    checkNumber % 5 != 0) {
                System.out.println("so chi chia het cho 3");
            } else if (checkNumber % 3 != 0 &&
                    checkNumber % 5 == 0) {
                System.out.println("so chi chia het cho 5");
            } else {
                System.out.println("so khong chia het cho 3 va 5");
            }
            System.out.println("Nếu muốn tiếp tục type yes, if not, type no");
            continous = scanner.nextLine();

        }while (continous.equals("yes"));

    }
}
