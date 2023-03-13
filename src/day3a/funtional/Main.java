package day3a.funtional;

public class Main {
    public static void main(String[] args) {
        MyFunctional sum = new MyFunctional() {
            @Override
            public double calculator(double a, double b) {
                return a + b;
            }
        };

        System.out.println("tong 3 va 5 = " + sum.calculator(3.0,5.0));

        // Định nghĩa 1 phương thức tính biểu thức
        // A = 5*a + 3*b - 10

        double A ;
        MyFunctional cal = new MyFunctional() {
            @Override
            public double calculator(double a, double b) {
                return 5*a + 3*b - 10;
            }
        };

        System.out.println("A = " + cal.calculator(3.0,5.0));

        // thường dùng định nghĩa trong trường hợp cần dùng đến
        // thường kết hợp với stream API và lambda expression
    }

}
