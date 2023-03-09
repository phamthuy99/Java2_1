package day1b.bai1;

public class HinhVuong  implements IHinhHoc{

    private double canh;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        if (canh <= 0){
            throw new RuntimeException("Error");
        }
        this.canh = canh;
    }

    public double getCanh() {
        if (canh <= 0){
            throw new RuntimeException("Error");
        }
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0){
            throw new RuntimeException("Error");
        }
        this.canh = canh;
    }

    @Override
    public double tinhChuvi() {
        return canh*4;
    }

    @Override
    public double tinhDientich() {
        return canh*canh;
    }
}
