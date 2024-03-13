package example1;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chuong trinh tinh diem trung binh cac mon hoc");
        float maths,physics,chemistry,literature,english;
        float totalScore;
        System.out.println("nhap diem mon toan");
        maths = scanner.nextFloat();

        System.out.println("nhap diem mon ly");
        physics = scanner.nextFloat();

        System.out.println("nhap diem mon hoa");
        chemistry =scanner.nextFloat();

        System.out.println("nhap diem mon van");
        literature = scanner.nextFloat();

        System.out.println("nhap diem mon anh");
        english = scanner.nextFloat();

        totalScore = (maths+ physics + chemistry + literature +english) / 5;
        System.out.printf("diem trung binh cua ban la : %.2f \n",totalScore);
        if (totalScore < 5){
            System.out.println("xep loai yeu");

        } else if (totalScore < 6.5) {

            System.out.println("xep loai trung binh");

        } else if (totalScore < 8) {
            System.out.println("xep loai kha");

        } else if (totalScore <9) {
            System.out.println("xep loai gioi");

        }else {
            System.out.println("xep loai xuat sac");
        }


    }
}
