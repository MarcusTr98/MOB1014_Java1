package Lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so dien su dung: ");
        int soDien=sc.nextInt();
        int tienDien;
        if(soDien<=50){
            tienDien=soDien*1000;
            System.out.println("Tien dien la: "+tienDien+" dong");
        }else{
            tienDien=(50*1000)+(soDien-50)*1200;
            System.out.println("Tien dien la: "+tienDien+" dong");
        }
    }
}
