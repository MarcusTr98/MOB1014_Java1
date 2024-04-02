
package mob1014.huyentt_pp03261;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLSV quanly = new QLSV();
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("\n------------------MENU------------------");
            System.out.println("1. Nhap danh sach Sinh vien");
            System.out.println("2. Xuat danh sach Sinh vien");
            System.out.println("3. Tim Sinh vien theo ma Sinh vien");
            System.out.println("4. Sap xep Sinh vien theo chuyen nganh");
            System.out.println("5. Ke thua");
            System.out.println("0. THOAT"); 
            System.out.println("----------------------------------------");           
            System.out.print("Moi chon chuc nang: ");
            int chon = input.nextInt();           
            switch(chon){
                case 1:
                    System.out.println("Ban da chon: Nhap danh sach Sinh vien");
                    quanly.Nhap();
                    break;
                case 2:
                    System.out.println("Ban da chon: Xuat danh sach Sinh vien");
                    quanly.Xuat();
                    break;
                case 3:
                    System.out.println("Ban da chon: Tim Sinh vien theo ma Sinh vien");
                    quanly.timTheoMa();
                    break;
                case 4:
                    System.out.println("Ban da chon: Sap xep Sinh vien theo chuyen nganh");
                    quanly.sapXepChuyenNganh();
                    break;
                case 5:
                    System.out.println("Ban da chon: Ke thua");
                    SinhVienPoly poly = new SinhVienPoly("pp03271", "quang anh","ptpm" , 2);
                    SinhVienPoly poly2 = new SinhVienPoly("pp03339", "ming anh","ptpm" , 1);
                    poly.inThongTin();
                    poly2.inThongTin();
                    break;                    
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    System.exit(0);
                default:
                    System.out.println("Khong co chuc nang nay, vui long chon lai!");
            }
        }while(true);
    }
}
