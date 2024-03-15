package example;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so cot");
        byte row = scanner.nextByte();
        System.out.println("Moi ban nhap so dong");
        byte col = scanner.nextByte();

        byte[][] numberArr = new byte[row][col];
        for (byte rowIndex = 0; rowIndex < row; rowIndex++){
            for(byte colIndex = 0;colIndex < col; colIndex++ ){
                System.out.printf("Moi ban nhap du lieu tai hang %d, cot %d: ",rowIndex +1,colIndex +1);
                numberArr[rowIndex][colIndex] = scanner.nextByte();
            }
        }


        System.out.println("Mang du lieu ma ban da nhap:");
        for (byte[] rowArray : numberArr) {
            for (byte value : rowArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        while (true){
            System.out.println("Ban muon tinh tong gia tri o cot thu may");
            byte totalCol = scanner.nextByte();
            if (totalCol < 0 || totalCol > col){
                System.out.println("Moi ban nhap lai vi vi tri ban nhap vuot qua so cot trong mang");
            } else {
                byte sum = 0;
                for (byte rowIndex = 0; rowIndex < row ; rowIndex++){
                    sum += numberArr[rowIndex][totalCol-1];
                }
                System.out.printf("Tong gia tri tren cot %d ma ban da chon: %d \n",totalCol,sum);
            }
        }


    }
}