package javacore.practice.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDienThoai {

    ArrayList<DienThoaiThongMinh> list_DTTM = new ArrayList<>();
    ArrayList<DienThoaiDeBan> list_DTDB = new ArrayList<>();

    public void nhapThongTinDienThoaiThongMinh(){
        if (list_DTTM.size() < 5){
            DienThoaiThongMinh dttm = new DienThoaiThongMinh();
            dttm.nhapThongTin();

            list_DTTM.add(dttm);
            chonTiepTucHoacThoat(1);
        }else{
            System.out.println("        So luong Dien Thoai Di Dong toi da !");
            chucNang1();
        }

    }
    public void nhapThongTinDienThoaiDeBan(){
        if (list_DTDB.size() < 5 ){
            DienThoaiDeBan dtdb = new DienThoaiDeBan();

            dtdb.nhapThongTin();

            list_DTDB.add(dtdb);
            chonTiepTucHoacThoat(0);
        }else{
            System.out.println("        So luong Dien Thoai De Ban toi da !");
            chucNang1();
        }

    }
    public void chonTiepTucHoacThoat(int loaiDT){
        System.out.println("1. Tiep tuc nhap thong tin ");
        System.out.println("0. Quay lai");

        Scanner sc_chon_thaoTac = new Scanner(System.in);
        int num_chon_thaoTac = sc_chon_thaoTac.nextInt();
        switch (num_chon_thaoTac) {
            case 1:
                if (loaiDT == 1){
                    nhapThongTinDienThoaiThongMinh();
                }else{
                    nhapThongTinDienThoaiDeBan();
                }
                break;
            case 0:
                chucNang1();
                break;
            default:
                System.out.println("        Hay chon lai thao tac !");
                chonTiepTucHoacThoat(loaiDT);
                break;

        }
        sc_chon_thaoTac.close();
    }
    public void chonHienThiHoacThoat(){
        System.out.println("1. Tiep tuc hien thi danh sach hai loai dien thoai");
        System.out.println("0. Quay lai ");

        Scanner scanner_cn1 = new Scanner(System.in);
        int num_choose = scanner_cn1.nextInt();


        switch (num_choose) {
            case 1:
                this.chucNang2();
                break;
            case 0:
                this.chonMenu();
                break;
        }

    }
    public void chucNang1(){
        System.out.println("        Chon loai dien thoai can nhap thong tin: ");
        System.out.println("1. Dien Thoai Thong Minh ");
        System.out.println("2. Dien Thoai De Ban ");
        System.out.println("0. Quay lai");

        Scanner sc_chon_loaiDT = new Scanner(System.in);
        int num_chon_loaiDT = sc_chon_loaiDT.nextInt();

        switch (num_chon_loaiDT) {
            case 1:
                nhapThongTinDienThoaiThongMinh();
                break;
            case 2:
                nhapThongTinDienThoaiDeBan();
                break;
            case 0:
                this.chonMenu();
                break;
            default:
                System.out.println("        Hay chon lai thao tac ! ");
                chucNang1();
                break;
        }
        sc_chon_loaiDT.close();
    }
    public void chucNang2(){
        for (DienThoaiThongMinh list_dttm : list_DTTM){
            list_dttm.hienThiThongTin();
        };
        for (DienThoaiDeBan list_dtdb: list_DTDB) {
            list_dtdb.hienThiThongTin();
        };
        chonHienThiHoacThoat();
    }
    public void chucNang3(){
        System.out.println("Nhap ten dien thoai can tim: ");
        Scanner scanner = new Scanner(System.in);
        String tenDT = scanner.nextLine();
        boolean check = false;
        for (DienThoaiThongMinh dttm : list_DTTM){
            if (dttm.getTenDienThoai().equals(tenDT)){
                dttm.hienThiThongTin();
                check = true;
            }else{
            }
        };
        for (DienThoaiDeBan dtdb : list_DTDB){
            if (dtdb.getTenDienThoai().equals(tenDT)){
                dtdb.hienThiThongTin();
                check = true;
            }else{
            }
        };
        if (check == false){
            System.out.println("Not found !");
        }
        chonMenu();
    }
    public void chucNang4(){

        int giaDTTMCaoNhat = list_DTTM.get(0).getGiaTien();
        int giaDTDBCaoNhat = list_DTDB.get(0).getGiaTien();
        int indexDTTM = 0;
        int indexDTDB = 0;
        for (int i = 0; i < list_DTTM.size();i++){
            if (giaDTTMCaoNhat <= list_DTTM.get(i).getGiaTien()){
                giaDTTMCaoNhat = list_DTTM.get(i).getGiaTien();
                indexDTTM = i;
            }
        }
        for (int i = 0; i < list_DTDB.size();i++){
            if (giaDTDBCaoNhat <= list_DTDB.get(i).getGiaTien()){
                giaDTDBCaoNhat = list_DTDB.get(i).getGiaTien();
                indexDTDB = i;
            }
        }

        list_DTTM.get(indexDTTM).hienThiThongTin();
        list_DTTM.get(indexDTDB).hienThiThongTin();

        chonMenu();
    }
    public void chucNang5(){
        int giaDTTMThapNhat = list_DTTM.get(0).getGiaTien();
        int giaDTDBThapNhat = list_DTDB.get(0).getGiaTien();
        int indexDTTM = 0;
        int indexDTDB = 0;
        for (int i = 0; i < list_DTTM.size();i++){
            if (giaDTTMThapNhat >= list_DTTM.get(i).getGiaTien()){
                giaDTTMThapNhat = list_DTTM.get(i).getGiaTien();
                indexDTTM = i;
            }
        }
        for (int i = 0; i < list_DTDB.size();i++){
            if (giaDTDBThapNhat >= list_DTDB.get(i).getGiaTien()){
                giaDTDBThapNhat = list_DTDB.get(i).getGiaTien();
                indexDTDB = i;
            }
        }

        list_DTTM.get(indexDTTM).hienThiThongTin();
        list_DTTM.get(indexDTDB).hienThiThongTin();

        chonMenu();
    }

    public void chonMenu(){

        System.out.println("Chon chuc nang: ");
        System.out.println("1. Nhap danh sach hai loai dien thoai");
        System.out.println("2. Hien thi danh sach hai loai dien thoai");
        System.out.println("3. Tim kiem dien thoai DienThoaiThongMinh: tìm kiếm theo tên điện thoại");
        System.out.println("4. Hien thi DienThoaiThongMinh hoặc DienThoaiDeBan có giá tiền max");
        System.out.println("5. Hien thi DienThoaiThongMinh hoặc DienThoaiDeBan có giá tiền min");
        System.out.println("0. Thoat");

        Scanner scanner_main = new Scanner(System.in);
        int num_choose = scanner_main.nextInt();

        switch (num_choose){
            case 1:
                chucNang1();
                break;
            case 2:
                chucNang2();
                break;
            case 3:
                chucNang3();
                break;
            case 4:
                chucNang4();
                break;
            case 5:
                chucNang5();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Hay chon lai chuc nang !");
                chonMenu();
                break;
        }

    }

    public static void main(String[] args) {
        TestDienThoai testDienThoai = new TestDienThoai();
        testDienThoai.chonMenu();
    }


}
