package exercise;

public class Exercise5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("STT:");
//        int stt = scanner.nextInt();
//        scanner.nextLine(); // consume newline character
//        System.out.println("Nhập họ và tên:");
//        String name = scanner.nextLine();
//        System.out.println("Nhập tuổi:");
//        int age = scanner.nextInt();
//        scanner.nextLine(); // consume newline character
//        System.out.println("Nhập số điện thoại:");
//        String number = scanner.nextLine();
//        System.out.println("Nhập email:");
//        String email = scanner.nextLine();

        System.out.println(String.format("%50s","danh sach sinh vien"));
        String lineSeparator = "==========================================================================";
        //stt:3
        //ho va ten : 15
        //age: 5
        //sdt:15
        //email:20
        String formatHeader = "| %3s | %-15s | %-5s | %-15s | %-20s |";
        String formatRow = "| %-3d | %-15s | %-5d | %-15s | %-20s |";
        System.out.println(lineSeparator);
        System.out.println(String.format(formatHeader,"STT","Ho van ten","tuoi","so dien thoai","email"));
        System.out.println(lineSeparator);
        System.out.println(String.format(formatRow,1,"nguyen van a",20,"0966141082","email@gmail.com"));
        System.out.println(lineSeparator);

    }
}



