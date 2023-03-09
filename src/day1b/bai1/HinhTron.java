package day1b.bai1;
public class HinhTron implements IHinhHoc {
    private double r;

    public HinhTron() {
    }

    public HinhTron(double r) {
        if (r <= 0){
            throw new RuntimeException("Error");
        }
        this.r = r;
    }

    public double getR() {
        if (r <= 0){
            throw new RuntimeException("Error");
        }
        return r;
    }

    public void setR(double r) {
        if (r <= 0){
            throw new RuntimeException("Error");
        }
        this.r = r;
    }

    @Override
    public double tinhChuvi() {
        return 2*Math.PI*r;
    }

    @Override
    public double tinhDientich() {
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "r=" + r +
                '}';
    }
}
