
package mob1014.huyentt_pp03261_test1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int chon;
        Scanner input = new Scanner(System.in);
        DongVatService listDV = new DongVatService();
        
        while(true){
            System.out.println("\n-------------MENU-------------");
            System.out.println("1. Nhap thong tin doi tuong");
            System.out.println("2. Hien thi danh sach doi tuong");
            System.out.println("3. Tim kiem theo khoang can nang"); 
            System.out.println("5. Dong vat meo");
            System.out.println("4. THOAT");            
            System.out.println("------------------------------");
            System.out.print("Moi chon chuc nang: ");
            chon = input.nextInt();
            
            switch(chon){
                case 1: 
                    System.out.println("Ban da chon: Nhap thong tin doi tuong");
                    listDV.nhap();
                    break;
                case 2: 
                    System.out.println("Ban da chon: Hien thi danh sach doi tuong");
                    listDV.xuat();
                    break;
                case 3: 
                    System.out.println("Ban da chon: Tim kiem theo khoang can nang");
                    listDV.khoangCanNang();
                    break;
                case 5: 
                    System.out.println("Ban da chon: Dong vat meo");
                    listDV.conMeo();
                    break;
                case 4: 
                    System.out.println("Thoat chuong trinh!");
                    System.exit(0);    
                default:
                    System.out.println("Khong co chuc nang nay, vui long chon lai");
            }
        }
    }
}
