package day2b.Baitap1;

public class HinhCau implements HinhHoc3D{
    private double banKinh;

    public HinhCau() {
    }

    public HinhCau(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhTheTich() {
        return 4/3 * Math.PI * banKinh * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhCau{" +
                "banKinh=" + banKinh +
                '}';
    }
}
