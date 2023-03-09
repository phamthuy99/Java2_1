package day1b.bai3;

public class HinhTron implements MyComparator<HinhTron>{

    private double banKinh = 1.0;
    public HinhTron() {

    }

    public HinhTron(double banKinh) {
        if (banKinh <= 0){
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        if (banKinh <= 0){
            throw new RuntimeException("Error");
        }
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh <= 0){
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }

    public double chuVi(){
        return Math.PI * 2 * banKinh;
    }

    public double dienTich(){
        return Math.PI * banKinh * banKinh;
    }
    @Override
    public int compare(HinhTron o) {
        if (this.banKinh > o.banKinh){
            return 1;
        }else if (this.banKinh < o.banKinh){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
