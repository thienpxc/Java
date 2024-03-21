package baitap2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Tạo một điểm 3D
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        // In ra thông tin của điểm 3D
        System.out.println("Thông tin của điểm 3D:");
        System.out.println(point3D);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem x");
        float pointX = Float.parseFloat(getInputFromUser(scanner, "\\d"));
        System.out.println("nhap diem y");
        float pointY = Float.parseFloat(getInputFromUser(scanner, "\\d"));
        System.out.println("nhap diem z");
        float pointZ = Float.parseFloat(getInputFromUser(scanner, "\\d"));

        System.out.printf("Gia tri x la : %.2f | Gia tri y : %.2f | Gia tri z %.2f",
                pointX, pointY, pointZ);


    }

    private static String getInputFromUser(Scanner scanner, String regex) {
        while (true) {
            String dataInput = scanner.nextLine();
            boolean isValid = Pattern.compile(regex).matcher(dataInput).matches();
            if (isValid) {
                return dataInput;
            }
            System.out.println("Vui long nhap lai");
        }
    }
}
