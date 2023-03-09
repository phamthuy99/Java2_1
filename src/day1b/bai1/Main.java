package day1b.bai1;

public class Main {
    public static void main(String[] args) {

        HinhTron hinhTron = new HinhTron(3);
        HinhVuong hinhVuong = new HinhVuong(4);
        HinhThangCan hinhThangCan = new HinhThangCan();

        Drawable drawable = new Drawable();
        drawable.draw(hinhTron);
        drawable.draw(hinhVuong);
        drawable.draw(hinhThangCan);
    }

}
