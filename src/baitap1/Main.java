package baitap1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("====menu====");
            System.out.println("1. Hình Tròn");
            System.out.println("2. Hình Trụ");
            System.out.println("3. thoat");
            byte inputFromUser =  Byte.parseByte(scanner.nextLine()) ;
            switch (inputFromUser) {
                case 1:
                    Circle circle = createCircle(scanner);
                    System.out.println(circle);
                    System.out.printf("Diện tích của hình tròn: %.2f | Màu %s \n ", circle.getArea(), circle.getColor());
                    break;
                case 2:
                    Cylinder cylinder = createCylinder(scanner);
                    System.out.println(cylinder);
                    System.out.printf("Dien tich hinh tru la : %.2f | chieu dai la : %.2f | mau : %s \n",
                            cylinder.getRadius(),cylinder.getHeight(),cylinder.getColor());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("vui long nhap lai");
            }
        }
    }

    private static Cylinder createCylinder(Scanner scanner) {
        System.out.println("nhap ban kinh hinh tru");
        float inputRadius = Float.parseFloat(getInputFromUser(scanner, "\\d+"));
        System.out.println("nhap chieu dai hinh tru");
        float inputHeight = Float.parseFloat(getInputFromUser(scanner, "\\d+"));
        System.out.println("nhap mau sac hinh tru");
        String inputColor = scanner.nextLine();
        return new Cylinder(inputHeight, inputRadius, inputColor);
    }

    private static Circle createCircle(Scanner scanner) {
        System.out.println("nhap ban kinh vong tron ");
        float inputRadius = Float.parseFloat(getInputFromUser(scanner, "\\d+"));
        System.out.println("nhap mau sac cua vong tron");
        String inputColor = scanner.nextLine();
        return new Circle(inputRadius, inputColor);
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
