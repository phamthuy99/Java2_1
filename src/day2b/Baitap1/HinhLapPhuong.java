package day2b.Baitap1;

public class HinhLapPhuong implements HinhHoc3D{

    private double canh;


    public HinhLapPhuong() {
    }

    public HinhLapPhuong(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhTheTich() {
        return canh * canh * canh;
    }

    @Override
    public String toString() {
        return "HinhLapPhuong{" +
                "canh=" + canh +
                '}';
    }
    // định nghĩa
}
