package day3a.Bai2_func;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HandleString demSoKiTu = new HandleString() {
            @Override
            public int execute(String s) {
                return s.length();
            }
        };
        String s1 = "Hello world";
        System.out.println("So ki tu trong s1:" + demSoKiTu.execute(s1));

        // Dem so tu
        String s2 = "Welcome      to     Java       ";
        // Khi nào bắt đầu 1 từ ?? i là khoảng trắng, i+1 ko phải khoảng trắng

        HandleString demSoTu = new HandleString() {
            @Override
            public int execute(String s) {
                int count = 0;
                if(s.charAt(0) != ' '){
                    count++;
                }
                for(int i = 1; i < s.length() - 1; i++){
                    if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
                        count ++;
                    }
                }
                return count;
            }
        };
        System.out.println("Số từ = " +  demSoTu.execute(s2));

        // String -> list cac ki tu don -> set
        HandleString demSoKiTuSuDung = new HandleString() {
            @Override
            public int execute(String s) {
                Set<Character> characters = new HashSet<>();
                for (int i = 0; i < s.length(); i++) {
                    characters.add(s.charAt(i));
                }
                return characters.size();
            }
        };

        System.out.println(demSoKiTuSuDung.execute("Hello hello"));

    }

}
