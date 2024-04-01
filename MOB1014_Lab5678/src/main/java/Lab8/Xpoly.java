
package Lab8;
public class Xpoly {
    public static double sum(double...nums){
        double tong=0;
        for(Double item: nums){
            tong += item;
        }
        return tong;
    }
    
    public static double min(double...x){
        double min= x[0];
        for(double item:x){
            min= Math.min(min, item);
        }
        return min;
    }
    
    public static double max(double...x){
        double max= x[0];
        for(double item:x){
            max= Math.max(max, item);
        }
        return max;
    }
 
    public static String toUpperFirstChar(String name){
        String[] ars= name.split(" ");
        StringBuilder str= new StringBuilder();
        for(int i=0; i< ars.length; i++){
            String item= ars[i];
            if(!item.equals("")){
                String ch = item.substring(0,1).toUpperCase();
                item= ch + item.substring(1).toLowerCase();
                str.append(item).append(" ");
            }
        }
        return str.toString().trim();
    }
    
    public static void main(String[] args) {
        //bai1:
        System.out.println("Ket qua tong: "+sum(3));
        System.out.println("Ket qua tong: "+sum(3,5));
        
        double ars1 = sum(5,8,9.2,8);
        System.out.println("Ket qua tong: "+ars1);    
        
        ars1= sum(10,5,21);
        System.out.println("Ket qua tong: "+ars1);        
        
        double[] ars2 = new double[]{1,2,3,4,5,6,9,8};
        System.out.println("Key qua tong: "+sum(ars2));
        
        //bai2:
        double kq1 = min(5,10,24);
        System.out.println("Min= "+kq1);
        
        kq1= min(10,30,15);
        System.out.println("Min= "+kq1);        
        
        double kq2 = max(5,10,24);
        System.out.println("Max= "+kq2);
        
        kq2= min(33,30,15);
        System.out.println("Min= "+kq2);
        
        //bai3:
        String ten= toUpperFirstChar("nguyen van minh");
        System.out.println("Ten: "+ten);
        String ten1 = toUpperFirstChar("  nguyen  van  long");
        System.out.println("Ten: "+ten1);        
    }
}


