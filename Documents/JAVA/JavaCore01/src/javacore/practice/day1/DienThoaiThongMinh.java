package javacore.practice.day1;

import java.util.Scanner;

public class DienThoaiThongMinh extends DienThoai {
    private String heDieuHanh ;
    private String phienBanHeDieuHanh;

    public DienThoaiThongMinh(String tenDienThoai, String nhaSanXuat, String namSanXuat, int giaTien, String heDieuHanh, String phienBanHeDieuHanh) {
        super(tenDienThoai, nhaSanXuat, namSanXuat, giaTien);
        this.heDieuHanh = heDieuHanh;
        this.phienBanHeDieuHanh = phienBanHeDieuHanh;
    }

    public DienThoaiThongMinh() {
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public String getPhienBanHeDieuHanh() {
        return phienBanHeDieuHanh;
    }

    public void setPhienBanHeDieuHanh(String phienBanHeDieuHanh) {
        this.phienBanHeDieuHanh = phienBanHeDieuHanh;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Nhap he dieu hanh: ");
        this.setHeDieuHanh(sc1.nextLine());

        System.out.println("Nhap phien ban he dieu hanh: ");
        this.setPhienBanHeDieuHanh(sc1.nextLine());
    }

    @Override
    public void hienThiThongTin() {
        System.out.print("Dien thoai thong minh: -- ");
        super.hienThiThongTin();
        System.out.println(
                " | He dieu hanh: "+this.getHeDieuHanh() + " | Phien ban HDH: " + this.getPhienBanHeDieuHanh()
        );
    }
}
