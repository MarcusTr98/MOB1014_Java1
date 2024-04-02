
package mob1014.huyentt_pp03261_test1;

import java.util.ArrayList;
import java.util.Scanner;

public class DongVatService {
    ArrayList<DongVat> listDV = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    public void nhap(){
        String traloi;
        do{
            System.out.print("Nhap ma dong vat: ");
            String id = input.nextLine();
            System.out.print("Nhap ten dong vat: ");
            String name = input.nextLine();               
            System.out.print("Nhap noi song: ");
            String house = input.nextLine();
            int kg;
            do{
                System.out.print("Nhap can nang: ");
                kg = input.nextInt(); 
                if(kg<=0){
                    System.out.println("Nhap lai, can nang phai > 0");
                }
            }while(kg<=0);
            input.nextLine();
            
            DongVat dv = new DongVat(id, name, house,kg);
            listDV.add(dv);           
            System.out.print("Co muon nhap tiep khong? (Y/N): ");           
            traloi= input.nextLine();          
        }while(traloi.equalsIgnoreCase("Y"));
        System.out.println("Da nhap xong du lieu!");
    }
    
    public void xuat(){
        System.out.println("\n-----------------");
        System.out.println("Xuat danh sach: ");
        System.out.printf("%10s || %12s || %15s || %6s ", "Ma DV", "Ten DV", "Noi Song", "Can Nang");
        for(DongVat dv : listDV){
            dv.inThongTin();
        }
    }
    
    public void khoangCanNang(){
        int min;
        System.out.print("Nhap can nang toi thieu: ");
        min = input.nextInt();     
        for(DongVat dv : listDV){
            if(dv.getCanNang() > min){
                dv.inThongTin();
            }
        }  
    }
    
    public void conMeo(){
        Meo meo = new Meo("v3", "Con Meo", "Nha", 4, "Meoooo");
        meo.inThongTin();
    }
}
