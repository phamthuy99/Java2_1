package day2b.Baitap1;

public class HinhTru implements HinhHoc3D{
    public double chieuCao = 1.0;
    public double banKinh = 1.0;

    public HinhTru() {
    }

    public HinhTru(double chieuCao, double banKinh) {
        this.chieuCao = chieuCao;
        this.banKinh = banKinh;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhTheTich() {
        return Math.PI * banKinh * banKinh * chieuCao;
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "chieuCao=" + chieuCao +
                ", banKinh=" + banKinh +
                '}';
    }
}
