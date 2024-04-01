
package Lab6;

import java.util.ArrayList;
import java.util.Scanner;
public class Lab6 {
    Scanner input= new Scanner(System.in);
    
    public void bai3(){
        ArrayList<SinhVien> list= new ArrayList<>();
        for(int i=0; i<5; i++){
            SinhVien sv= new SinhVien();
            sv.nhap();
            list.add(sv);
        }
        System.out.println("-------------------");
        System.out.println("Danh sach SV");
        System.out.printf("%18s ||%25s ||%15s ||%15s\n", "Ten sinh vien","Email","SDT","So CMND");
        for(SinhVien sv: list){
            sv.xuat();
        }
    }
    
    public void bai2(){
        ArrayList<SanPham> list= new ArrayList<>();
        for(int i=0; i<5; i++){
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }
        for(SanPham sp: list){
            if(sp.getHang().equalsIgnoreCase("Nokia")){
                sp.xuat();
                System.out.println("");
            }
        }        
    }
    
    public void bai1(){     
        System.out.println("Nhap ho ten: ");
        String hoTen= input.nextLine();
        hoTen.trim();
        
        String ho= hoTen.substring(0, hoTen.indexOf(" "));
        String tenDem= hoTen.substring(hoTen.indexOf(" "),
                hoTen.lastIndexOf(" "));
        String ten= hoTen.substring(hoTen.lastIndexOf(" "));
        
        System.out.printf("%s %s %s",ho.toUpperCase(), tenDem, ten.toUpperCase());
    }
}
