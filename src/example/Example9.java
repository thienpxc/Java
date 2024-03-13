package example;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int perimeter;
        while (true){
            System.out.println("nhap 1 so de lua chon");
            System.out.println("1. tinh chu vi va dien tich hinh chu nhat");
            System.out.println("2. tinh chu vi hinh tam giac");
            System.out.println("3. tinh chu vi va dien tich hinh tron");
            System.out.println("4. thoat");
            boolean isExits = false;
            perimeter = scanner.nextInt();
            switch (perimeter){
                case 1:
                    System.out.println("Nhap chieu dai");
                    int chieudai = scanner.nextInt();
                    System.out.println("nhap chieu rong");
                    int chieurong = scanner.nextInt();
                    int dientich = chieudai * chieurong;
                    int chuvi = 2 * (chieudai + chieurong);
                    System.out.printf("chu vi cua hinh chu nhat la : %d " ,chuvi );
                    System.out.printf("dien tich cua hinh chu nhat la : %d \n" ,dientich);
                    break;
                case 2:
                    System.out.println("nhap canh a tam giac ");
                    int canhA = scanner.nextInt();
                    System.out.println("nhap canh b tam giac");
                    int canhB = scanner.nextInt();
                    System.out.println("nhap canh c tam giac");
                    int canhC = scanner.nextInt();
                    double p = (canhA+canhB+canhC) /2.0;
                    double dientichtamgiac = Math.sqrt(p *(p - canhA) * (p - canhB) * (p - canhB));
                    System.out.printf("dien tich cua hinh tam giac la : %.2f%n \n",dientichtamgiac);
                    break;
                case 3:
                    System.out.println("nhap ban kinh duong tron");
                    int bankinh = scanner.nextInt();
                    double chuVi = 2 * Math.PI * bankinh;
                    double dienTich = Math.PI * Math.pow (bankinh ,2);
                    System.out.println("Chu vi của hình tròn là: " + chuVi);
                    System.out.println("Diện tích của hình tròn là: \n" + dienTich);
                    break;
                case 4:
                    isExits = true;
                    break;
                default:
                    System.out.println("vui long nhap dung so");
            }if (isExits){
                break;
            }
        }
    }
}
