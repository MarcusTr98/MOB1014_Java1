
package Lab4;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia, giamGia;
    Scanner sc= new Scanner(System.in);
    
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
