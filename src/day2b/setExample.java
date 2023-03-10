package day2b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setExample {
    public static void main(String[] args) {
        // tạo 1 set chứa các chuỗi được nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        while (true){
            System.out.println("Enter your string: ");
            String tmp = scanner.nextLine();
            stringSet.add(tmp);
            if (tmp.equalsIgnoreCase("exit")){
                break;
            }
            // print set
            System.out.println(stringSet);
        }
        //Đóng phần nhập
        scanner.close();
    }
}
