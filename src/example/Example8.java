package example;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] value = {'v', 'a', 'n', 't', 'h', 'i', 'e','n','l','e'};
        char number;
        int count = 0;
        while (true) {
            System.out.println("nhap gia tri ban can tim");
            String input = scanner.nextLine();
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))){
                System.out.println("vui long nhap mot ky tu");
                continue;
            }
            number = input.charAt(0);
            break;
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i] == number) {
                count++;
            }
        }
        if (count > 0) {
            System.out.printf("gia  nhap trong chuoi %s xuat hien %d lan \n", Arrays.toString(value), count);
        } else {
            System.out.printf("ky tu %s ban nhap khong co %s xuat hien trong mang ", number, Arrays.toString(value));
        }



        //


    }
}
