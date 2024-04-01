
package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    public void bai1() {
        System.out.println("1.Kiem tra so nguyen to");
        Scanner sc=new Scanner(System.in);
        System.out.println("Xin moi nhap so nguyen n: ");
        int n=sc.nextInt();
        //int dem=0;
        boolean ok=true;
        for(int i=2; i<n-1; i++){
            if(n%i==0){
                 //dem=+1;
                 ok=false;
                 break;
            }
        }
        if(ok){
            System.out.println("La so nguyen to");
        }else{
            System.out.println("Khong la so nguyen to");
        }
    }
    public void bai2() {
        System.out.println("2.Bang cuu chuong");
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                //System.out.print(+j+"x"+i+"="+(i*j));
                System.out.printf("%d x %2d = %3d", j, i, j*i);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
    public void bai3() {
        System.out.println("3.Mang");
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu: "); int a= sc.nextInt();
        int[] mang= new int[a];
        for(int i=0; i<a; i++){
            System.out.print("a["+i+"]= "); mang[i]=sc.nextInt();
        }
        System.out.println("Mang vua nhap la: "+Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println("Mang sap xep tang dan la: "+Arrays.toString(mang));
        int min=mang[0];
        for(int i=1; i< a; i++){
            for(int j=i+1; j<a; j++){
                min=Math.min(min,mang[i]);
            }
        }
        System.out.println("Phan tu nho nhat la: "+min);
        
        int tong=0, dem=0;
        for(int i=1; i<a; i++){
            if(mang[i]%3==0){
                tong+=mang[i];
                dem++;
            }
        }
        System.out.printf("TB cong cac so chia het cho 3: %.2f \n",(double)tong/dem);
    }
}
