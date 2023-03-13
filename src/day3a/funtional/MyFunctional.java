package day3a.funtional;

@FunctionalInterface
public interface MyFunctional {
    // functional interface chỉ chứa 1 phương thức trừu tượng
    // đánh dấu là functional interface bằng anotation
    double calculator(double a, double b);
}
