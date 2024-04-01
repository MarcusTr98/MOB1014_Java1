package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu: "); int a= sc.nextInt();
        int[] mang= new int[a];
        for(int i=0; i<a; i++){
            System.out.print("a["+i+"]= "); mang[i]=sc.nextInt();
        }
        System.out.println("Mang vua nhap la: "+Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println("1.Mang sap xep tang dan la: "+Arrays.toString(mang));
        
        int min=mang[0];
        for(int i=1; i< a; i++){
            for(int j=i+1; j< a; j++){
                min=Math.min(min,mang[i]);
            }
        }
        System.out.println("2.Phan tu nho nhat la: "+min);
        int tong=0, dem=0;
        for(int i=1; i< a; i++){
            if(mang[i]%3==0){
                tong+=mang[i];
                dem++;
            }
        }
        System.out.printf("3.TB cong: %.2f",(double)tong/dem);
    }
}
