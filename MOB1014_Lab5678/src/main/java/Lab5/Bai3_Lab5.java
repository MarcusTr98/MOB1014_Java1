
package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3_Lab5 {
    private ArrayList<SanPham> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    public void giaTB(){
        double trBinh=0, tong=0;
        for(SanPham sp: list){
            tong+=sp.getGia();
        }
        trBinh= tong/list.size();
        System.out.println("Gia trung binh cua cac sp la: "+trBinh);
    }
    
    public void timVaXoa(){
        System.out.print("Nhap vao ten sp can tim: ");
        String ten= input.nextLine();
        SanPham sp= null;
        
        for(SanPham sp1 : list){
            if(sp1.getTenSP().equalsIgnoreCase(ten)){
                sp= sp1;
                break;
            }
        }
        if(sp!=null){
            list.remove(sp);
            System.out.println("Da xoa thanh cong!");
        }else{
            System.out.println("Khong tim thay san pham.");
        }
    }
    
    public void sapXep(){
        System.out.println("Sap xep danh sach theo gia giam dan");
//        Comparator<SanPham> comp= new Comparator<SanPham>() {
//            @Override
//            public int compare(SanPham o1, SanPham o2) {
//                return Double.compare(o1.getGia(), o2.getGia());
//            }
//        };
//        Collections.sort(list, comp);
//        xuat();
        // -> là toán tử lambda
        Collections.sort( list, (a,b) -> (int)(b.getGia() - a.getGia()));
        xuat();
    }
    
    public void nhap(){
// cách 2:
//        String tenSP;
//        double gia;
//        System.out.print("Nhap Ten SP: "); tenSP=input.nextLine();
//        System.out.print("Nhap gia SP: "); gia=input.nextDouble();
//        SanPham sp = new SanPham(tenSP, gia);
//        list.add(sp);
        System.out.println("Nhap danh sach san pham");
        int i = 1;
        do{
            System.out.printf("Nhap Ten SP thu %d: ", i);
            String ten = input.nextLine();

            if(ten == null || ten.equals("")){
                System.out.println("Da nhap xong thong tin san pham!");
                break;
            }
            i++;
            System.out.print("Nhap gia SP: ");
            double gia = input.nextDouble();
            list.add(new SanPham(ten, gia));
            input.nextLine();
        }while(true);
    }
    public void xuat(){
        System.out.println("Danh sach san pham: ");
        for(SanPham sp: list){
            System.out.printf("Ten SP: %10s ||Gia: %6.0f VND\n", sp.getTenSP(), sp.getGia());
        }
    }
        
    public void menu(){
        while(true){
            System.out.println("-----------------------Menu---------------------");
            System.out.println("1. Nhap danh sach San pham");
            System.out.println("2. Sap xep giam dan theo gia va xuat ra danh sach"); 
            System.out.println("3. Tim va xoa san pham theo ten san pham");
            System.out.println("4. Xuat gia trung binh cua cac san pham");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("------------------------------------------------");
            System.out.print("Moi chon: ");
            int chon = input.nextInt();
            input.nextLine();
            switch (chon){
                case 1:
                    nhap();
                    break;
                case 2:
                    sapXep();
                    break;
                case 3:
                    timVaXoa(); 
                    break;
                case 4:
                    giaTB();
                    break;                   
                case 0:
                    System.exit(0);
                default :
                    System.out.println("Chuc nang khong hop le. Moi nhap lai");                    
            }     
        }
    }
}
