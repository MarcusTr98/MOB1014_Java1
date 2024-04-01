package Lab3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
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
}
