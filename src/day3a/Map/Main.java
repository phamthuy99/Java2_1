package day3a.Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // tạo 1 map rỗng
        Map<Person, List<Car>> listMap = new HashMap<>();
        // Tạo 2 người
        Person p1 = new Person(1, "User 1", "Male");
        Person p2 = new Person(2, "User 2", "Female");

        // Tạo 3 xe

        Car c1 = new Car(1, "Red", "Honda Civic");
        Car c2 = new Car(2, "White", "Volvo");
        Car c3 = new Car(3, "Blue", "MCX5");

        // p1  sở hữu  xe c1
        listMap.put(p1, Arrays.asList(c1));
        // p1  sở hữu  xe c2
        listMap.put(p2, Arrays.asList(c2));
        // in
        System.out.println(listMap);
        // p1  mua thêm xe c3
        // B1: Lấy ra danh sách xe. Thêm vào list
        List<Car> p1List = new ArrayList<>(listMap.get(p1));
        p1List.add(c3);
        listMap.put(p1,p1List);
        System.out.println("---------------------------------------------");
        System.out.println(listMap);

    }
}
