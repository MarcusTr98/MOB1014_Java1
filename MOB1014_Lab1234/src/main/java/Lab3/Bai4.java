package Lab3;
import java.util.Arrays;
import java.util.Scanner;
public class Bai4 {
    Scanner sc= new Scanner(System.in);
    int n;
    String sv[], hocLuc[];
    float diem[];   
    public void nhap() {
        System.out.print("Nhap so luong sinh vien: "); 
        n=sc.nextInt(); sc.nextLine();
        sv =new String[n];
        diem= new float[n];
        hocLuc= new String[n];
        for(int i=0; i<n; i++){
            System.out.printf("Nhap ten SV thu [%d]: ", i+1);
            sv[i]= new Scanner(System.in).nextLine(); //
            System.out.printf("Nhap diem SV thu [%d]: ", i+1);
            diem[i]= sc.nextFloat();          
            if (diem[i] >= 9) {
                hocLuc[i]= "Xuat sac";
            } else if (diem[i] >= 7 && diem[i] < 9) {
                hocLuc[i]= "Gioi";
            } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                hocLuc[i]="Kha";
            } else if (diem[i] >= 5 && diem[i] < 6.5) {
                hocLuc[i]="Trung binh";
            } else {
                hocLuc[i]="Yeu";
            }
        }
    }
    public void xuat() {
        System.out.printf("| %4s | %18s | %7s | %12s |\n", "STT", "Ho va ten", "Diem", "Hoc luc");
        for(int i=0; i<n; i++){
            System.out.printf("| %4d | %18s | %7s | %12s |\n", i+1, sv[i], diem[i], hocLuc[i]);
        }
    }
    public void sortSV() {
        for(int i=0; i< n-1; i++){
            for( int j=i+1; j< n; j++){
                if(diem[i]>diem[j]){
                    float temp= diem[i];
                    diem[i]=diem[j];
                    diem[j]=temp;
                    String svTemp= sv[i];
                    sv[i] =sv[j];
                    sv[j] =svTemp;
                    String hlTemp= hocLuc[i];
                    hocLuc[i] =hocLuc[j];
                    hocLuc[j] =hlTemp;                    
                }
            }
        }
    }
    public void Bai4(){
        System.out.println("4.Mang SV");
        nhap();
        System.out.println("Danh sach SV vua nhap la: ");        
        xuat();
        sortSV();
        System.out.println("\nDanh sach sap xep tang dan theo diem la: ");
        xuat();
    }
}

