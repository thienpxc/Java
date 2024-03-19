package run;

import java.util.Scanner;

public class StudentManagement {
    private Student[] studentArr = new Student[0];


    public void addNewStudent(Scanner scanner) {
        //nhap so luong can them
        System.out.println("nhap so luong can them sinh vien");
        byte inputQuantily = Byte.parseByte(scanner.nextLine());
        // khai bao 1 mang moi de them sinh vien
        Student[] newArrStudent = new Student[inputQuantily + studentArr.length];
        // Copy dữ liệu từ mảng cũ sang mảng mới

        for (int i = 0; i < studentArr.length; i++) {
            newArrStudent[i] = studentArr[i];
        }
        // Nhập thông tin cho các sinh viên mới và đưa vào mảng mới

        for (int i = studentArr.length; i < newArrStudent.length; i++) {
            newArrStudent[i] = getInputForStudent(scanner);
        }
        studentArr = newArrStudent;
    }

    public void deleteStudent(Scanner scanner) {
        //hien thi ra student ra man hinh
        System.out.println("danh sach sinh vien hien tai \n");
        for (int i = 0; i < studentArr.length; i++) {
            System.out.println(studentArr[i].toString());
        }
        // nhap vi tri can xoa

        byte studentArrLength = (byte) studentArr.length;
        byte indexNeedDelete = getIndexFromUser(studentArrLength, scanner);


        //khai bao 1 mang moi
        Student[] newDeleteStudent = new Student[studentArrLength - 1];
        byte currentIndex = 0;
        //tim vi tri can xoa trong mang
        for (int i = 0; i < studentArrLength; i++) {
            if (i == indexNeedDelete) {
                continue;
            }
            newDeleteStudent[currentIndex] = studentArr[i];
        }
        studentArr = newDeleteStudent;
    }

    private byte getIndexFromUser(byte arraySize, Scanner scanner) {
        boolean isNotValid;
        do {
            System.out.println("vui long nhap vi tri ma ban mong muon");
            byte arrayLocation = Byte.parseByte(scanner.nextLine());
            isNotValid = arrayLocation < 0 || arrayLocation > arraySize - 1;
            if (isNotValid) {
                System.out.println("vi tri nhap khong hop le");
            } else {
                return arrayLocation;
            }
        } while (isNotValid);
        return -1;
    }

    public void updateStudent(Scanner scanner) {
        //hien thi ra tất cả vị trí trong mảng
        System.out.println("Hien thi danh sach sinh vien ");
        byte arraySize = (byte) studentArr.length;
        for (int i = 0; i < arraySize; i++) {
            System.out.printf(studentArr[i].toString());
        }
        //nhap vao vi tri can cap nhat thong tin

        int indexNeedUpDate = getIndexFromUser(arraySize, scanner);
        Student student = getInputForStudent(scanner);
        //tim so sanh voi mang
        for (int i = 0; i < arraySize; i++) {
            if (i == indexNeedUpDate) {
                studentArr[i] = student;
                return;
            }
        }


    }

    public Student getInputForStudent(Scanner scanner) {
//        System.out.println("Neu muon thoat chuong trinh, type 5");
//        byte outProgram = Byte.parseByte(scanner.nextLine());
//        if(outProgram == 5){
//            return;
//        }
        System.out.println("nhap ma so sinh vien");
        String newIdStudent = scanner.nextLine();
        System.out.println("nhap ten sinh vien");
        String newNameStudent = scanner.nextLine();
        System.out.println("nhap tuoi");
        byte newAgeStudent = Byte.parseByte(scanner.nextLine());
        System.out.println("nhap gioi tinh sinh vien ");
        boolean newSexStudent = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhap diem trung binh");
        float newMedium = Float.parseFloat(scanner.nextLine());


        return new Student(newIdStudent, newNameStudent, newAgeStudent, newMedium, newSexStudent);
    }

    public void displaysStudents() {
        byte arrySize = (byte) studentArr.length;
        System.out.println("Hiện thị danh sách sinh viên");
        if (arrySize <= 0) {
            System.out.println("hien tai chua co sinh vien nao");
        } else {
            for (int i = 0; i < arrySize; i++) {
                System.out.println(studentArr[i].toString());
            }

        }


    }

}
