package example;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        int[] array1 = getArrUser();
        System.out.println("Array 1: " + printArray(array1));

        int[] array2 = getArrUser();
        System.out.println("Array 2: " + printArray(array2));

        // Tạo array3
        int length3 = array1.length + array2.length;
        int[] array3 = new int[length3];
        short index = 0;
        for (int number : array1) {
            array3[index] = number;
            index++;
        }
        for (int number : array2) {
            array3[index] = number;
            index++;
        }

        System.out.println("Array 3: " + printArray(array3));
    }

    public static int[] getArrUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng:");
        byte length = Byte.parseByte(scanner.nextLine());
        int[] array = new int[length];
        for (byte i = 0; i < length; i++) {
            System.out.println(String.format("Vui lòng nhập số thứ %d:", i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    public static String printArray(int[] array) {
        String result = "[";
        for (int number : array) {
            result += number + ",";
        }
        result = result.substring(0, result.length() - 1);
        result += "]";
        return result;
    }
}
