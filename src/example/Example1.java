package example;

import java.util.Scanner;

public class Example1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("chuong trinh xoa 1 phan tu khoi mnag");
//        int[] arrInt = {1,2,3,4,5,6,7,8,9};
//        int sizeArr = arrInt.length;
//        int[] arrInt2 = new int[sizeArr -1];
//
//
//
//
//    }
    public static void main(String[] args) {
        System.out.println("Chương trình xóa 1 phần tu khỏi mảng");
        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12};
        int sizeOfArray = arrInt.length;
        int[] newArr = new int[sizeOfArray - 1];
        int inputValue = getInputFormUser(arrInt);
        int index = 0, item;
        for (int i = 0; i < sizeOfArray; i++) {
            item = arrInt[i];
            if (item == inputValue) {
                continue;
            }
            newArr[index] = item;
            index++;
        }
        for (int number : newArr) {
            System.out.printf("%d ", number);
        }
    }

    public static int getInputFormUser(int[] arrInt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng Gia Tri");
        for (int number : arrInt) {
            System.out.printf("%d ", number);
        }
        boolean checkValid;
        while (true) {
            System.out.println("Xin mời nhập giá tri muốn xóa");
            int inputValue = Integer.parseInt(scanner.nextLine());
            checkValid = isValid(arrInt, inputValue);
            if (checkValid) {
                return inputValue;
            }
            System.out.println("bạn nhập gia trị ko có trong mảng chinh xác");
        }
    }

    public static boolean isValid(int[] intArray, int inputValue) {
        for (int number : intArray) {
            if (inputValue == number) {
                return true;
            }
        }
        return false;
    }

}
