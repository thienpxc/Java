package staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();
        while (true){
            System.out.println("Vui lòng Chọn 1 chức Năng");
            System.out.println("========Menu=======");
            System.out.println("1. Thêm mới 1 nhân viên ");
            System.out.println("2. Hiển thị danh sách thông tin nhân viên ");
            System.out.println("3. Xem thông tin nhân viên theo mã nhân viên");
            System.out.println("4. Cập nhật thông tin nhân viên");
            System.out.println("5. Xóa nhân viên");
            System.out.println("6. Tìm kiếm nhân viên theo tên (tương đối)");
            System.out.println("7. Sắp xếp và hiển thị danh sách nhân viên theo tên từ a - z (chưa làm được)");
            System.out.println("8. Thoát");
            byte select = Byte.parseByte(scanner.nextLine());
            switch (select){
                case 1:
                    employeeManagement.addMoreStaff(scanner);
                    break;
                case 2:
                    employeeManagement.displaysStaff();
                    break;
                case 3:
                    employeeManagement.displaysEmployee(scanner);
                    break;
                case 4:
                    employeeManagement.updateStaff(scanner);
                    break;
                case 5:
                    employeeManagement.deleteStaff(scanner);
                    break;
                case 6:
                    employeeManagement.searchEmployeeByName(scanner);
                case 7:
                    System.out.println("hehe");
                case 8:
                    return;
                default:
                    System.out.println("vui long nhap dung so");
            }
        }
    }
}
