
package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2_Lab5 {
    private ArrayList<String> ds= new ArrayList<>();
    Scanner input =new Scanner(System.in);
    
    public void xoa(){
        System.out.println("Nhao vao ten muon xoa: ");
        String hoTen= input.nextLine();
        String tenFound= "";
        
        for(String ten: ds){
            if(ten.equalsIgnoreCase(hoTen)){
                tenFound = hoTen;
                break;
            }
        }
        if(tenFound!=null){
            ds.remove(hoTen);
            System.out.println("Da xoa thanh cong!");
        }else{
            System.out.println("Khong tim thay du lieu");
        }
    }
            
    public void sapXepGiamDan(){
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();
    }
    
    public void xuatNgauNhien(){
        Collections.shuffle(ds);
        xuat();
    }

    public void xuat(){
        System.out.println("--------------------");
        System.out.println("Danh sach ho ten: ");
        for(String sv: ds){
            System.out.println(sv);
        }
    }
    public void nhap(){
        System.out.println("Moi nhap danh sach ho ten");
        while(true){
            System.out.println("Nhap ho ten: ");
            String ten= input.nextLine();
            if(ten.isEmpty()){
                System.out.println("Nhap du lieu thanh cong!");
                break;
            }
            ds.add(ten);
        }
    }
    
    public void menu(){
        int chon;
        while(true){
            System.out.println("--------------Menu-------------");
            System.out.println("1. Nhap danh sach ho va ten"); 
            System.out.println("2. Xuat danh sach vua nhap"); 
            System.out.println("3. Xuat danh sach ngau nhien");
            System.out.println("4. Sap xep giam dan và xuat danh sach");
            System.out.println("5. Tim va xoa ho ten nhap tu ban phim");
            System.out.println("0. Thoat chuong trinh"); 
            System.out.println("Moi chon: ");
            chon = input.nextInt();
            switch (chon){
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatNgauNhien();
                    break;
                case 4:
                    sapXepGiamDan();
                    break;                    
                case 5:
                    xoa();
                    break;
                case 0:
                    System.exit(0);
                default :
                    System.out.println("Chuc nang khong hop le. Moi nhap lai");                    
            }     
        }
    }
}
