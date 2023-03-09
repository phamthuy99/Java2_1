package day1a.baitap1;

public class Main {
    public static void main(String[] args) {
        MayTinh<Double> mayTinh = new MayTinhDouble();
        // tính tôngr
        System.out.println("Tổng = " + mayTinh.tong(3.0,5.4,7.8,3.7));

        // tính tích
        System.out.println("Tích = " + mayTinh.tich(1.0,2.4,7.8,3.7));




    }
}
