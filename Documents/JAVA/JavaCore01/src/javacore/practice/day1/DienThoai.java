package javacore.practice.day1;

import javacore.practice.day1.impl.IAction;

import java.util.Scanner;

public class DienThoai implements IAction {

    private String tenDienThoai;
    private String nhaSanXuat;
    private String namSanXuat;
    private int giaTien;

    public DienThoai() {
    }

    public DienThoai(String tenDienThoai, String nhaSanXuat, String namSanXuat, int giaTien) {
        this.tenDienThoai = tenDienThoai;
        this.nhaSanXuat = nhaSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaTien = giaTien;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Nhap ten dien thoai: ");
        this.setTenDienThoai(sc1.nextLine());

        System.out.println("Nhap nha san xuat: ");
        this.setNhaSanXuat(sc1.nextLine());

        System.out.println("Nhap gia tien: ");
        this.setGiaTien(Integer.parseInt(sc1.nextLine()));

        System.out.println("Nhap nam san xuat: ");
        this.setNamSanXuat(sc1.nextLine());

    }

    @Override
    public void hienThiThongTin() {
//        StringBuilder thongtin = new StringBuilder();
//        thongtin.append("Ten: " + getTenDienThoai());
//        thongtin.append(" | Nha SX: " + getNhaSanXuat());
//        thongtin.append(" | Gia: " + getGiaTien());
//        thongtin.append(" | Nam SX: " + getNamSanXuat());
//        System.out.println(thongtin);
        System.out.print("Ten: " +
                this.getTenDienThoai() + " | Nha SX: " +
                this.getNhaSanXuat() + " | Gia: " +
                this.getGiaTien() + " | Nam SX: " +
                this.getNamSanXuat());
    }

}
