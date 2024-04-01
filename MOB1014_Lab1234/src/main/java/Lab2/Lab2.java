package Lab2;

import java.util.Scanner;

public class Lab2 {
    public static void bai1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Moi nhap vao he so a: \n"); double a=sc.nextDouble();
        System.out.print("Moi nhap vao he so b: \n"); double b=sc.nextDouble();
        System.out.println("Phuong trinh bac nhat do la: "+a+"x+"+b+"=0");
        if(a==0){
            if(b==0){
                System.out.println("Pt Vô số nghiệm");
            }else{
                System.out.println("Pt Vô nghiệm");
            }
        }else{
            double x=-b/a;
            System.out.println("Pt co nghiem x= "+x);
        }
    }
    public static void bai2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Moi nhap vao he so a: \n"); double a= sc.nextDouble();
        System.out.print("Moi nhap vao he so b: \n"); double b= sc.nextDouble();
        System.out.print("Moi nhap vao he so c: \n"); double c= sc.nextDouble();
        System.out.println("Phuong trinh do la: "+a+"x^2+"+b+"x+"+c+"=0");
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Pt vo so nghiem");
                }else{
                    System.out.println("Pt vo nghiem");
                }
            }else{
                double x=-c/b;
                System.out.println("Pt co 1 nghiem x= "+x);
            }
        }else{
            double delta=Math.pow(b,2)-4*a*c;
            System.out.println("Delta = "+delta);
            if(delta<0){
                System.out.println("Pt vo nghiem");
            } else if (delta==0){
                double x= -b/(2*a);
                System.out.println("Pt co nghiem kep: x= "+x);
            }else{
                double x1= (-b-Math.sqrt(delta))/(2*a);
                double x2= (-b+Math.sqrt(delta))/(2*a);
                System.out.printf("Pt có 2 nghiem phan biet x1= %.2f va x2= %.2f", x1,x2);
            }
        }
    }
    public static void bai3() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao so dien su dung: \n");
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
    public static void Menu() {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("+------------------MENU----------------+");
            System.out.println("\t 1.Giai phuong trinh bac nhat");
            System.out.println("\t 2.Giai phuong trinh bac hai");
            System.out.println("\t 3.Tinh tien dien");
            System.out.println("\t 0.Ket thuc.");
            System.out.println("+-------------------------------------+");
            //System.out.println("Moi chon chuc nang: ");
            //int luaChon =sc.nextInt();
            int luaChon=0;
            // chưa fixx
            try {
               System.out.println("Moi chon chuc nang: ");
               luaChon=sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Ban phai chon so");
            } 
            switch(luaChon){
                case 1:
                    System.out.println("Ban da chon giai PT bac nhat");
                    bai1();
                    break;
                case 2:
                    System.out.println("Ban da chon giai PT bac hai");
                    bai2();
                    break;
                case 3:
                    System.out.println("Ban da chon Tinh tien dien");
                    bai3();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Khong co chuc nang nay, vui long nhap lai: ");
            }
        }
    }
}