
package mob1014.huyentt_pp03261;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class QLSV {
    ArrayList<SinhVien> listSV = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void Nhap(){
        String traloi;
        do{
            System.out.print("Moi nhap ma sinh vien: ");
            String maSV = input.nextLine();
            System.out.print("Moi nhap ten sinh vien: ");
            String tenSV = input.nextLine();
            System.out.print("Moi nhap chuyen nganh: ");
            String chuyenNganh = input.nextLine();
            SinhVien sv = new SinhVien(maSV, tenSV, chuyenNganh);
            listSV.add(sv);
            System.out.print("Co muon nhap tiep khong? (Y/N): ");
            traloi = input.nextLine();
        }while(traloi.equalsIgnoreCase("Y"));
        System.out.println("Da nhap xong du lieu.");
    }
    
    public void Xuat(){
        System.out.println("----------------");
        System.out.println("Danh sach sinh vien");
        System.out.printf(" %8s || %20s || %15s ", "MA SV", "TEN SV", "CHUYEN NGANH");
        for(SinhVien sv : listSV){
            sv.inThongTin();
        }
    }
    
    public void timTheoMa() {
        System.out.print("Moi nhap ma sinh vien can tim: ");
        String maFound = input.nextLine();

        boolean found = false;
        for (SinhVien sv : listSV) {
            if (sv.getMaSV().equals(maFound)) {
                found = true;
                sv.inThongTin();
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien co ma " + maFound);
        }
    }
    
    public void sapXepChuyenNganh() {
        listSV.sort(Comparator.comparing(SinhVien :: getChuyenNganh).reversed());
        Xuat();
    }
//    public void sapXepChuyenNganh(){
//        listSV.sort((s1,s2)-> s1.getChuyenNganh().compareTo(s2.getChuyenNganh()));
//        Xuat();
//    }
}
