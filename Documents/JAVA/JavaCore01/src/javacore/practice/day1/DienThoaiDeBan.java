package javacore.practice.day1;

import java.util.Scanner;

public class DienThoaiDeBan extends DienThoai{
    private String coDayHayKhongDay;

    public DienThoaiDeBan() {
    }

    public DienThoaiDeBan(String tenDienThoai, String nhaSanXuat, String namSanXuat, int giaTien, String coDayHayKhongDay) {
        super(tenDienThoai, nhaSanXuat, namSanXuat, giaTien);
        this.coDayHayKhongDay = coDayHayKhongDay;
    }

    public String getCoDayHayKhongDay() {
        return coDayHayKhongDay;
    }

    public void setCoDayHayKhongDay(String coDayHayKhongDay) {
        this.coDayHayKhongDay = coDayHayKhongDay;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Nhap co hay khong co day: ");
        this.setCoDayHayKhongDay(sc1.nextLine());
    }

    @Override
    public void hienThiThongTin() {
//        StringBuilder thongTinDTTM = new StringBuilder("Dien thoai de ban: -- ");
        System.out.print("Dien thoai de ban: -- ");
        super.hienThiThongTin();
//        thongTinDTTM.append(" | Day: " + getCoDayHayKhongDay());
//        System.out.println(thongTinDTTM);
        System.out.println(" | Day: "+this.getCoDayHayKhongDay());
    }
}
