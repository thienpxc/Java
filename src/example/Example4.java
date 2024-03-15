package example;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("vui long nhap so dong tuong ung");
        byte row = scanner.nextByte();
        System.out.println("vui long nhap so cot tuong ung");
        byte col = scanner.nextByte();
        byte[][] numberArr = new byte[row][col];
        for (int rowIndex =0; rowIndex < row ; rowIndex++){
            for(int colIndex = 0; colIndex < col ; colIndex ++){
                System.out.printf("vui long nhap phan tu tai cot ham tai hang %d ,cot %d \n",rowIndex +1,colIndex+1);
                numberArr[rowIndex][colIndex] = scanner.nextByte();
            }
        }
        byte max = numberArr[0][0];
        byte item;
        for (int rowIndex = 0 ; rowIndex < row; rowIndex++){
            for (int colIndex = 0 ; colIndex < col; colIndex++){
                item = numberArr[rowIndex][colIndex];
                if (max < item){
                    max = item;

                }
            }
        }
        System.out.printf("gia tri lon nhat cua mang ba vua nhap la : %d", max);
    }

}
