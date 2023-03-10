package day2a;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Collection
        Collection<String> stringCollection = new ArrayList<>();
        // Thêm một string
        stringCollection.add("Hello");
        stringCollection.add("Hi");
        // In ra collection
        System.out.println(stringCollection);
        // Thay đổi giá trị 1 phần tử theo index
        // arr[index] => collection.get(),set
        stringCollection.remove("Hello");
        System.out.println(stringCollection);
        // lấy ra kích thước
        System.out.println(stringCollection.size());
    }
}
