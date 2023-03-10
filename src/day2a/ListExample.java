package day2a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Tạo 1 ArrayList lưu trữ thông tin của các bạn sinh vien
        // Chưa biết số lượng cu thể , có thể thêm nhiều
        List<Student> arrayList = new ArrayList<>();

        // thêm 1 bạn sinh viên
        Student s1 = new Student(10, "Student 1");
        arrayList.add(s1);

        // thêm student 2
        Student s2 = new Student(2, "Student 2");
        arrayList.add(s2);
        // In ra danh sách sinh viên
        System.out.printf("Có %d bạn sinh viên trong danh sách\n",arrayList.size());
        System.out.println(arrayList);

        // thay đổi tên của baạn Student 2 -> sinh viên 2

        Student s = arrayList.get(1);
        s.setName("Sinh viên 2");
        System.out.println(arrayList);

        // thay thế phần tử tại ví trí index = 1
        Student s3 = new Student(3, "Student 3");
        arrayList.set(1, s3);
        System.out.println(arrayList);

        /*// xóa phần tử trong arrayList theo index
        arrayList.remove(0);
        System.out.println(arrayList);

        // xóa phần tử theo Object
        arrayList.remove(s3);
        System.out.println(arrayList);*/

        // sắp xếp các phần tử
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }

}
