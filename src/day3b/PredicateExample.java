package day3b;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // có 1 list string
        List<String> stringList = Arrays.asList("hello","hello world", "hi", "how are you","welcome to java");

        // lọc ra những chuỗi có số từ lớn hơn 2 và có từ 'a'

        // cần 1 hàm tính được số từ
        Function<String, Integer> demSoTu = s -> {
            int count = 0;
            if (s.charAt(0) != ' ') {
                count++;
            }
            for (int i = 1; i < s.length() - 1; i++) {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                    count++;
                }
            }
            return count;
        };

        Predicate<String> soTuLonHon2 = s -> (demSoTu.apply(s) > 2);

        // cần 1 hàm để kiểm tra xem chuỗi có chứa 1 kí tự nào đó hay không

        Predicate<String> kiemTraCoChuaA = s -> (s.contains("a"));

        for (String s : stringList){
            if (soTuLonHon2.test(s) && kiemTraCoChuaA.test(s)){
                System.out.println(s);
            }
        }

    }
}
