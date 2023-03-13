package day3a.Bai1;

import java.util.*;

public class Main {
    // Key- sdt, Value - tên
    static Map<String, String> listContact = new HashMap<>();


    private static void mainMenu() {
        System.out.println("--- QUẢN LÝ DANH BẠ ---");
        System.out.println("1. Thêm danh bạ");
        System.out.println("2. Cập nhật tên danh bạ");
        System.out.println("3. Xoá danh bạ theo sdt");
        System.out.println("4. Xem toàn bộ danh bạ");
        System.out.println("5. Thoát");
    }

    private static void option1(Scanner in) {
        // Buoc 1: Nhap so dien thoai
        System.out.print("\tNhập số điện thoại:");
        String sdt = in.nextLine();
        // Buoc 2: Kiem tra xem sdt da co hay chua
        if (listContact.containsKey(sdt)) {
            System.out.println("Đã tồn tại liên hệ!");
            return;
        }
        System.out.print("Nhập tên liên hệ: ");
        String hoTen = in.nextLine();

        // Buoc 3: Neu chua co thi -> nhap ten -> lưu vào danh bạ, neu co sdt roi -> "đã lưu liên hệ"
        listContact.put(sdt, hoTen);
        // Bước 4: Thoát
        System.out.println("Lưu thành công");
    }

    private static void option2(Scanner in) {
        // Buoc 1: Nhap so dien thoai
        System.out.print("\tNhập số điện thoại:");
        String sdt = in.nextLine();
        // Buoc 2: Kiem tra xem sdt da co hay chua
        if (!listContact.containsKey(sdt)) {
            System.out.println("Không tồn tại liên hệ!");
            return;
        }
        String hoTenCu = listContact.get(sdt);
        System.out.println("Tên liên hệ cũ là: " + hoTenCu);
        System.out.print("Nhập tên liên hệ mới: ");
        String hoTenMoi = in.nextLine();

        // Thay the
        listContact.replace(sdt, hoTenMoi);
        System.out.println("Cập nhật thành công!");
    }

    private static void option3(Scanner in) {
        // Buoc 1: Nhap so dien thoai
        System.out.print("\tNhập số điện thoại:");
        String sdt = in.nextLine();
        // Buoc 2: Kiem tra xem sdt da co hay chua
        if (!listContact.containsKey(sdt)) {
            System.out.println("Không tồn tại liên hệ!");
            return;
        }
        listContact.remove(sdt);

        System.out.println("Xóa thành công!");
    }

    public static void main(String[] args) {

        listContact.put("0918206178", "NNT");

        int option = -1;
        Scanner in = new Scanner(System.in);
        do {
            mainMenu();
            System.out.print("Nhập lựa chọn: ");
            try {
                option = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng!");
                continue;
            }
            if (option < 1 || option > 5) {
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }
            // Xu ly cac TH thoa man
            switch (option) {
                case 1:
                    option1(in);
                    break;
                case 2:
                    option2(in);
                    break;
                case 3:
                    option3(in);
                    break;
                case 4:
                    // In ra danh ba -> duyet map
                    for (String phone : listContact.keySet()) {
                        System.out.printf("\t%s - %s \n", listContact.get(phone), phone);
                    }
                    break;
            }

        }
        while (option != 5);
        in.close();
    }
}
