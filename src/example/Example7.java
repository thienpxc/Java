package example;

import java.util.Scanner;

public class Example7 {

    //Đường chéo chính ( i == j )
    //Đường chéo phụ (i + j == row-1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte row, col;
        boolean isNotValid;
        do {
            System.out.println("nhap so dong cho ma tran");
            row = scanner.nextByte();
            System.out.println("nhap so cot cho ma tran");
            col = scanner.nextByte();
            isNotValid = row != col;
            if (isNotValid) {
                System.out.println("row vs col phai bang nhau");
            }

        } while (isNotValid);
        //khoi tao ma tran
        byte[][] matrix = initializeMatrix(row, col, scanner);
        //hien thi ma tran
        displayMatrix(matrix);
        //tinh tong cua cac so o duong cheo chinh
        System.out.printf("tong cac so tren duong cheo chinh la %d \n", getTotal(row, col, matrix));
        System.out.printf("tong cac so tren duong cheo phu la %d ",reverse(row,col,matrix));
    }
    public static int getTotal(byte row, byte col, byte[][] matrix) {
        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    total += matrix[i][j];
                }

            }

        }
        return total;
    }
    public static int reverse (byte row,byte col,byte[][]matrix){
        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i + j == row-1){
                    total += matrix[i][j];
                }

            }

        }
        return total;
    }
    //phuong phap khoi tao va nhap gia tri cho ma tran
    public static byte[][] initializeMatrix(byte row, byte col, Scanner scanner) {
        byte[][] matrix = new byte[row][col];
        System.out.println("nhap cac gia tri cho ma tran vuong");
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < col; j++) {
                System.out.printf("nhap phan tu thu cot %s dong %s \n ", i, j);
                matrix[i][j] = scanner.nextByte();
            }
        }
        return matrix;
    }
    // Phương thức để hiển thị ma trận
    public static void displayMatrix(byte[][] matrix) {
        System.out.println("Ma tran ban vua nhap la: ");
        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix.length; j++) {
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
