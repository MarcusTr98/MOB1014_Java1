
package Lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
    ArrayList<SinhVienPoly> list = new ArrayList<>();
    public void nhap(){
        do{
            Scanner input= new Scanner(System.in);
            System.out.print("Nhap ho ten sinh vien: ");
            String hoTen= input.nextLine();
            if(hoTen==null || hoTen.equals("")){
                break;
            }
            System.out.print("Nhap Nganh hoc(IT/Biz): ");
            String nganh = input.nextLine();
            if(nganh.equalsIgnoreCase("IT")){
                System.out.print("Nhap diem Java: ");
                float diemJava= input.nextFloat();
                System.out.print("Nhap diem CSS: ");
                float diemCSS= input.nextFloat();                
                System.out.print("Nhap diem HTML: ");
                float diemHTML= input.nextFloat();
                SinhVienPoly sv1= new SinhVienIT(diemJava, diemCSS, diemHTML, hoTen, nganh) {};
                list.add(sv1);
            }else{
                if(nganh.equalsIgnoreCase("Biz")){
                System.out.print("Nhap diem Marketing: ");
                float diemMar= input.nextFloat();
                System.out.print("Nhap diem Sales: ");
                float diemSale= input.nextFloat();    
                SinhVienPoly sv2= new SinhVienBiz(diemMar, diemSale, hoTen, nganh) {};
                list.add(sv2);
                }else{
                    System.out.println("Moi nhap lai nganh hoc!");
                }
            }
        }while(true);
    }
    
    public void xuat(){
        System.out.printf("%20s ||%15s ||%10s ||%15s\n","HO TEN SV","NGANH HOC","DIEM TB","HOC LUC");
        for(SinhVienPoly sv: list){
            System.out.printf("%20s ||%15s ||%10.2f ||%15s\n",sv.getHoTen(),sv.getNganh(),sv.getDiem(),sv.getHocLuc());
        }
    }
    
    public void xuatSVGioi(){
        System.out.printf("%20s ||%15s ||%10s ||%15s\n","HO TEN SV","NGANH HOC","DIEM TB","HOC LUC");
        for(SinhVienPoly sv: list){
            if(sv.getHocLuc().equalsIgnoreCase("Gioi")){
                System.out.printf("%20s ||%15s ||%10.2f ||%15s\n",sv.getHoTen(),sv.getNganh(),sv.getDiem(),sv.getHocLuc());
            }
        }
    }
    
    Comparator<SinhVienPoly> sv1 = new Comparator<SinhVienPoly>() {
        @Override
        public int compare(SinhVienPoly o1, SinhVienPoly o2) {
            return Double.compare(o1.getDiem(), o2.getDiem());
        }
    };
    
    public void sapXepTheoDiem(){
        Collections.sort(list, sv1);
        System.out.println("Sap xep theo thu tu diem tang dan");
        xuat();
    }
    
    public void menu() {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("-------------------Menu-------------------");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem tang dan");
            System.out.println("0. Thoat!");
            System.out.println("------------------------------------------");           
            System.out.print("Xin moi chon chuc nang: ");
            int chon = input.nextInt();
            input.nextLine();
            switch(chon){
                case 1:
                    System.out.println("Ban da chon: Nhap danh sach sinh vien");
                    nhap();
                    break;
                case 2:
                    System.out.println("Ban da chon: Xuat thong tin danh sach sinh vien");
                    xuat();
                    break;
                case 3:
                   System.out.println("Ban da chon: Xuat danh sach sinh vien co hoc luc gioi");
                   xuatSVGioi();
                   break;                   
                case 4:
                   System.out.println("Ban da chon: Sap xep danh sach sinh vien theo diem tang dan");
                   sapXepTheoDiem();
                   break;                 
                case 0:
                   System.out.println("Thoat chuong trinh!");
                   System.exit(0);
                default:
                    System.out.println("Chuc nang khong ton tai. Moi chon lai!");
            }
        }while(true);
        
    }
}
