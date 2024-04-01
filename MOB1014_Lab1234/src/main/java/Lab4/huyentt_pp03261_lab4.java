
package Lab4;

import java.util.Scanner;

public class huyentt_pp03261_lab4 {
    public static void main(String[] args) {
        // bài 2
        SanPham sp1= new SanPham();
        sp1.nhap();
        sp1.xuat();
        SanPham sp2= new SanPham();
        sp2.nhap();
        sp2.xuat();
        System.out.println(" ");
        // bài 3
        SanPham_bai3 b3= new SanPham_bai3("SGK Toan",10500);
        b3.xuat();
        SanPham_bai3 bai3=new SanPham_bai3("Sach",119000, 1500);
        bai3.xuat();
        
// nâng cao, tạo mảng sp
//        Scanner sc= new Scanner(System.in);
//        int N;
//        System.out.print("Moi nhap so luong sp: ");
//        N= sc.nextInt();
//        SanPham sp[]= new SanPham[N];
//        for(int i=0; i<N; i++){
//            sp[i]= new SanPham();
//        }
//        System.out.printf("Moi nhap vao thong tin sp \n");
//        for(int i=0; i<N; i++){
//            System.out.printf("San pham [%d]", i+1);
//            sp[i].nhap();
//        }
//        System.out.println("\nThong tn san pham da nhap: ");
//        for(int i=0; i<N; i++){
//            sp[i].xuat();
//        }
    }        
}
