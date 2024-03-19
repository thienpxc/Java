package staff;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeManagement {
    private Manage[] managesArr = new Manage[0];

    //add STAFF
    public void addMoreStaff(Scanner scanner) {
        System.out.println("Danh muc Thêm nhân viên");
        byte manageLegnth = (byte) managesArr.length;
        Manage manage = getInputForStaff(scanner);
        Manage[] newArrStaff = new Manage[manageLegnth + 1];
        for (byte i = 0; i < manageLegnth; i++) {
            newArrStaff[i] = managesArr[i];
        }
        newArrStaff[manageLegnth] = manage;
        managesArr = newArrStaff;

    }

    public void displaysStaff() {
        byte manageLegnth = (byte) managesArr.length;
        System.out.println("hiện thị danh sách nhân viên");
        if (manageLegnth <= 0) {
            System.out.println("chưa có danh sách nhân viên nào");
        } else {
            for (int i = 0; i < manageLegnth; i++) {
                System.out.println(managesArr[i].toString());
            }
        }
    }

    public void updateStaff(Scanner scanner) {
        //hien thi danh sach nhan vien
        System.out.println("danh sach nhan vien hien tai la: \n");
        byte manageLegnth = (byte) managesArr.length;
        for (int i = 0; i < manageLegnth; i++) {
            System.out.println(managesArr[i].toString());
        }
        //cap nhat thong tin
        System.out.println("chọn vị trí cần cập nhật thông tin");
        byte arrayLocation = Byte.parseByte(scanner.nextLine());
        Manage indexNeedUpDate = getInputForStaff(scanner);
        for (int i = 0; i < manageLegnth; i++) {
            if (i == arrayLocation) {
                managesArr[i] = indexNeedUpDate;
                return;
            }
        }
    }

    public void deleteStaff(Scanner scanner) {
        System.out.println("danh sach nhan vien hien tai la: \n");
        byte manageLegnth = (byte) managesArr.length;
        for (int i = 0; i < manageLegnth; i++) {
            System.out.println(managesArr[i].toString());
        }
        // xoa nhan vien
        System.out.println("chon vi tri can xoa");
        byte arrayLocation = Byte.parseByte(scanner.nextLine());
        //khai bao 1 mnang
        Manage[] newDeleteStaff = new Manage[manageLegnth - 1];
        byte currentIndex = 0;
        for (int i = 0; i < manageLegnth; i++) {
            if (i == arrayLocation) {
                continue;
            }
            newDeleteStaff[currentIndex] = managesArr[i];
        }
        managesArr = newDeleteStaff;
    }

    public void displaysEmployee(Scanner scanner) {
        System.out.println("danh sach nhan vien hien tai la: \n");
        byte manageLegnth = (byte) managesArr.length;
        for (int i = 0; i < manageLegnth; i++) {
            System.out.println(managesArr[i].toString());
        }
        //xem danh sach nhan vien theo ma nhan vien
        System.out.println("nhap ma de xem thong tin nhan vien");
        byte arrayLocation = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < manageLegnth; i++) {
            if (managesArr[i].getStaffId().equals(arrayLocation)) {
                System.out.printf("Thông tin nhân viên có mã %s: " , arrayLocation );
                System.out.println(managesArr[i].toString());
                break;
            } else {
                System.out.println("Không tìm thấy nhân viên có mã " + arrayLocation);
            }
        }




    }
    public void searchEmployeeByName(Scanner scanner) {
        System.out.println("Danh sách nhân viên hiện tại:\n");
        byte manageLength = (byte) managesArr.length;
        for (int i = 0; i < manageLength; i++) {
            System.out.println(managesArr[i].toString());
        }

      //tim kiem ten trong mang
        System.out.println("Nhập tên hoặc phần của tên nhân viên:");
        //nhap Viết thường tất cả ký tự chuỗi
        String searchTerm = scanner.nextLine().toLowerCase();
            //dat co
        boolean isFound = false;
        System.out.printf("Nhân viên tìm thấy với tên chứa %s", searchTerm);
        for (int i = 0; i < manageLength; i++) {
            //Kiểm tra trong chuỗi co chứa ky tu
            if (managesArr[i].getStaffName().toLowerCase().contains(searchTerm)) {
                System.out.println(managesArr[i].toString());
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.printf("Không tìm thấy nhân viên nào có tên chứa %s ",searchTerm);
        }
    }



    public Manage getInputForStaff(Scanner scanner) {

        System.out.println("Nhập mã nhân viên:");
        String staffId = scanner.nextLine();
        System.out.println("Nhập tên nhân viên:");
        String staffName = scanner.nextLine();
        System.out.println("Nhập ngày sinh nhân viên:");
        String staffDate = scanner.nextLine();
        System.out.println("Nhập số địa chỉ nhân viên:");
        String staffAddress = scanner.nextLine();
        System.out.println("Nhập số điện thoại nhân viên:");
        long staffNumber = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập lương cơ bản nhân viên:");
        double staffBasicSalary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hệ số năng suất nhân viên:");
        double staffProductivity = Double.parseDouble(scanner.nextLine());
        return new Manage(staffId, staffName, staffDate, staffAddress, staffNumber, staffBasicSalary, staffProductivity);
    }
}
