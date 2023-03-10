package day2b.Baitap1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<HinhHoc3D> arrHinh = new ArrayList<>();

        HinhCau hinhCau = new HinhCau(3);
        HinhLapPhuong hinhLapPhuong = new HinhLapPhuong(5);
        HinhTru hinhTru = new HinhTru(2,3);

        arrHinh.add(hinhCau);
        arrHinh.add(hinhLapPhuong);
        arrHinh.add(hinhTru);

        System.out.println(arrHinh);

        /*System.out.println("tt hinh cau " + arrHinh.tinhTheTich());
        System.out.println("tt hinh lap phuong " + hinhLapPhuong.tinhTheTich());*/

        double min  = arrHinh.get(0).tinhTheTich();
        HinhHoc3D hinhHoc3D = arrHinh.get(0);
        for (int i = 0; i < arrHinh.size() ; i++){
            if (arrHinh.get(i).tinhTheTich() < min){
                min = arrHinh.get(i).tinhTheTich();
                hinhHoc3D = arrHinh.get(i);
            }
        }

        System.out.println("Hình có thể tích nhỏ nhất là: " + hinhHoc3D);
        double sum = 0;
        for (int i = 0; i < arrHinh.size() ; i++){
            sum += arrHinh.get(i).tinhTheTich();
        }

        System.out.println("TBC các hình là : " + sum / arrHinh.size());

        // sắp xếp tăng dần
        Collections.sort(arrHinh);

        System.out.println(arrHinh);
        // sắp xếp giảm dần
        Collections.sort(arrHinh, new Comparator<HinhHoc3D>() {
            @Override
            public int compare(HinhHoc3D o1, HinhHoc3D o2) {
                if (o1.tinhTheTich() > o2.tinhTheTich()){
                    return -1;
                }
                else if (o1.tinhTheTich() > o2.tinhTheTich()){
                    return 1;
                }
                return 0;
            }
        });

        System.out.println(arrHinh);
    }
}
