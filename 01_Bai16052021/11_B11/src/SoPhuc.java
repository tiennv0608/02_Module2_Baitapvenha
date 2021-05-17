import java.util.Scanner;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;
    private SoPhuc[] soPhucs =new SoPhuc[30];
    int size = 0;


    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public SoPhuc() {
    }

    public SoPhuc[] getSoPhucs() {
        return soPhucs;
    }

    public void setSoPhucs(SoPhuc[] soPhucs) {
        this.soPhucs = soPhucs;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    @Override
    public String toString() {
        return "So Phuc {" + phanThuc + " + " +
                +phanAo + "i}";
    }

    public SoPhuc nhapSoPhuc(Scanner scanner) {
        System.out.println("Nhap phan thuc");
        double phanThuc = scanner.nextDouble();
        System.out.println("Nhap phan ao");
        double phanAo = scanner.nextDouble();
        SoPhuc soPhuc = new SoPhuc(phanThuc, phanAo);
        return soPhuc;
    }

    public void themSoPhuc(SoPhuc soPhuc) {
        soPhucs[size] = soPhuc;
        size++;
    }

    public void hienThiSoPhuc() {
        for (int i = 0; i < size; i++) {
            System.out.println(this.getSoPhucs()[i]);
        }
    }

    public SoPhuc cong2SoPhuc(SoPhuc soPhuc1, SoPhuc soPhuc2) {
        SoPhuc tong2SoPhuc = new SoPhuc();
        tong2SoPhuc.setPhanThuc(soPhuc1.getPhanThuc() + soPhuc2.getPhanThuc());
        tong2SoPhuc.setPhanAo(soPhuc1.getPhanAo() + soPhuc2.getPhanAo());
        return tong2SoPhuc;
    }

    public SoPhuc nhan2SoPhuc(SoPhuc soPhuc1, SoPhuc soPhuc2) {
        SoPhuc tich2SoPhuc = new SoPhuc();
        tich2SoPhuc.setPhanThuc(soPhuc1.getPhanThuc() * soPhuc2.getPhanThuc() - soPhuc1.getPhanAo() * soPhuc2.getPhanAo());
        tich2SoPhuc.setPhanAo(soPhuc1.getPhanThuc() * soPhuc2.getPhanAo() + soPhuc1.getPhanAo() * soPhuc2.getPhanThuc());
        return tich2SoPhuc;
    }
    public int timkiem(double phanThuc){
        for (int i = 0; i<size; i++) {
            if (soPhucs[i].getPhanThuc() == phanThuc) {
                return i;
            }
        }
        return -1;
    }
}
