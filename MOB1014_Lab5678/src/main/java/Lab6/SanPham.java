
package Lab6;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private String hang;
    
    public void nhap(){
        Scanner input= new Scanner(System.in);
        //ArrayList <SanPham> listSP= new ArrayList<>();
        System.out.print("Nhap vao ten sp: ");
        tenSP = input.nextLine();
        System.out.print("Nhap vao don gia: ");
        donGia = input.nextDouble();
        input.nextLine();
        System.out.print("Nhap vao hang: ");
        hang = input.nextLine();        
    }
    
    public void xuat(){
        System.out.println("-----------------------");
        System.out.println("San phan: " +tenSP);
        System.out.println("Don gia: "+donGia);
        System.out.println("Hang: "+hang);
    }
    
    public SanPham(String tenSP, double donGia, String hang) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hang = hang;
    }

    public SanPham() {
    }
    

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

}
