package day3b.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
// Tao san danh sach sinh vien
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "AB1", 20, "Male", 80));
        studentList.add(new Student(2, "S2", 21, "Male", 90));
        studentList.add(new Student(3, "S3", 20, "Female", 70));
        studentList.add(new Student(4, "SABC4", 22, "Male", 100));

        // In diem trung binh
        final double[] t = {0};
        studentList.stream().forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                t[0] = t[0] + student.getMark();

            }
        });
        System.out.println("Điểm trung bình: " + t[0] / studentList.size());

        // In ra cac ban la nam va diem lon hon 80, tên phải có chữ A
        studentList.stream().filter(s -> s.getGender().equals("Male") && s.getMark() > 80)
                .filter(s -> s.getName().toLowerCase().contains("a"))
                .forEach(System.out::println);

        // Tao 1 danh sach chi gom cac ban nu sinh vien ??
        List<Student> newListStudent = studentList.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .collect(Collectors.toList());

        System.out.println(newListStudent);

        System.out.println(studentList);
    }
}
