package day1b.bai1;

public class Drawable{
    // chỉ phuowgn thức này sử dụng t extend
    public<T extends IHinhHoc> void draw(T t){
        String tmp = String.format("Vẽ hình %s, có diện tích là %.2f, chu vi là %.2f",
                t.getClass().getSimpleName(),
                t.tinhDientich(),
                t.tinhChuvi());

        System.out.println(tmp);
    }
}
