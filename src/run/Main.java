package run;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        //taoj menu lưa chọn
        while (true){

            System.out.println("vui long nhap 1 so");
            System.out.println("=========menu=========");
            System.out.println("1. hiện thị tất cả sinh vien");
            System.out.println("2. xóa sinh vien");
            System.out.println("3. chỉnh sửa và cập nhật sinh viên");
            System.out.println("4. thêm sinh viên");
            System.out.println("5. thoat");

            byte userValue = Byte.parseByte(scanner.nextLine());
            switch (userValue){
                case 1:
                    studentManagement.displaysStudents();

                    break;
                case 2:
                    studentManagement.deleteStudent(scanner);
                    break;
                case 3:
                    studentManagement.updateStudent(scanner);

                    break;
                case 4:
                    studentManagement.addNewStudent(scanner);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Option mismatch");
                    break;
            }
        }
        //1 thêm sinh vien
        // xóa sinh sinh vien
        //chinh sửa và cập nhật sinh viên
        //hien thị tất cả sinh viên



    }

}
