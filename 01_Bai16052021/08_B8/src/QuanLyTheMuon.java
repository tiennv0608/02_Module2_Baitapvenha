import java.util.Date;
import java.util.Scanner;

public class QuanLyTheMuon {
    private TheMuon[] theMuons = new TheMuon[1000];
    int size = 0;

    public void them(TheMuon theMuon) {
        theMuons[size] = theMuon;
        size++;
    }

    public void hienThi() {
        if (size>0){
            for (int i = 0; i < size; i++) {
                System.out.println(theMuons[i]);
            }
        } else {
            System.out.println("Khong co danh sach the muon");
        }
    }

    public int tim(String maThe) {
        for (int i = 0; i < size; i++) {
            if (theMuons[i].getMaThe().equals(maThe)) {
                return i;
            }
        }
        return -1;
    }

    public void xoa(String maThe) {
        int viTri = tim(maThe);
        if (viTri != -1) {
            for (int i = viTri;i<size;i++) {
                theMuons[i] = theMuons[i+1];
            }
            size--;
            hienThi();
        } else {
            hienThi();
        }
    }
    public TheMuon taoTheMuon(Scanner scanner){
        System.out.println("Nhap ma the");
        String maThe = scanner.nextLine();
        System.out.println("Nhap ngay muon");
        int ngayMuon = scanner.nextInt();
        System.out.println("Nhap han tra");
        int hanTra = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap so hieu sach");
        String soHieuSach = scanner.nextLine();
        System.out.println("Nhap ho ten");
        String hoTen = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap lop");
        String lop = scanner.nextLine();
        SinhVien sinhVien = new SinhVien(hoTen,tuoi,lop);
        TheMuon theMuon = new TheMuon(maThe,ngayMuon,hanTra,soHieuSach,sinhVien);
        return theMuon;
    }
}
