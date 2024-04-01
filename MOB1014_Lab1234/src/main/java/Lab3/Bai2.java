
package Lab3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.print(+j+"x"+i+"="+(i*j));
                System.out.print("\t");
            }
            System.out.println("");
        }
    }         
}
