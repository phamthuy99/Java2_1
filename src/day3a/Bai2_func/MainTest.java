package day3a.Bai2_func;

public class MainTest {
    public static void main(String[] args) {
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
    }
}
