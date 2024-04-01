package Lab1;

import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao canh cua khoi lap phuong: ");
        double canh=sc.nextDouble();
        double tt= Math.pow(canh,3);
        System.out.println("The tich cua khoi lap phuong: "+tt);
    }
}