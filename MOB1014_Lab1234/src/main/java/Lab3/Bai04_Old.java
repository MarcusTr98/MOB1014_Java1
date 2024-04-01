
package Lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Bai04_Old {
    // bài 4
    public void sortSV(String SV[], float diem[]) {
        for(int i=0; i< SV.length; i++){
            for( int j=i+1; j< SV.length; j++){
                if(diem[i]>diem[j]){
                    float temp= diem[i];
                    diem[i]=diem[j];
                    diem[j]=temp;
                    String svTemp= SV[i];
                    SV[i] =SV[j];
                    SV[j] =svTemp;
                }
            }
        }
    }
    public void bai4() {
        System.out.println("4.Mang SV");
        Scanner sc= new Scanner(System.in);
        System.out.print("Moi nhap so luong SV: "); int n= sc.nextInt();
        String sv[]=new String[n];
        float diem[]=new float[n];
        for(int i=0; i<n; i++){
            System.out.printf("Nhap ten SV thu [%d]: ", i+1);
            sv[i]= new Scanner(System.in).nextLine();
            System.out.printf("Nhap dien SV thu [%d]: ", i+1);
            diem[i]= sc.nextFloat();
            //sc.nextLine();
        }      
        System.out.println("Mang Sinh Vien: "+ Arrays.toString(sv));
        System.out.println("Mang diem Sinh Vien: "+ Arrays.toString(diem));
        System.out.println();
        sortSV(sv, diem);
        
        for(int i=0; i<n; i++){
            System.out.printf("Ho ten SV[%d]: %s \n",i+1, sv[i]);
            System.out.println("Diem: "+diem[i]);
            if (diem[i] >= 9) {
                System.out.println("Xuat sac");
            } else if (diem[i] >= 7 && diem[i] < 9) {
                System.out.println("Gioi");
            } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                System.out.println("Kha");
            } else if (diem[i] >= 5 && diem[i] < 6.5) {
                System.out.println("Trung binh");
            } else {
                System.out.println("Yeu");
            }
            System.out.println();
        }
    }
}
