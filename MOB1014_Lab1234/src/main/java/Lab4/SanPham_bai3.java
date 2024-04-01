
package Lab4;

import java.util.Scanner;

public class SanPham_bai3 {
    // bổ sung private
    private String tenSp;
    private double donGia, giamGia;
    Scanner sc= new Scanner(System.in);

    public SanPham_bai3() {
    }
    
    public SanPham_bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham_bai3(String tenSp, double donGia) {
        this(tenSp,donGia,0);
    }
    
// dung dac ta truy xuat ( sd phuong thuc getter+setter )
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    public double getThueNhapKhau(){
        return donGia* 0.1;
    }
    
    
    public void nhap(){
        System.out.print("\nMoi nhap ten SP: "); tenSp= sc.nextLine();
        System.out.print("Moi nhap don gia: "); donGia= sc.nextDouble();
        System.out.print("Moi nhap giam gia: "); giamGia= sc.nextDouble();
        getThueNhapKhau();
    }
    public void xuat(){
        System.out.printf("Ten SP: %s || Don gia: %.0f || Giam gia: %.0f || Thue: %.0f\n",
                tenSp, donGia,giamGia,getThueNhapKhau());
    }
}
