
package Lab8;

public class Lab8 {
    // Bài 1: Phương thức tính tổng
    public static final double sum(double... x) {
        double total = 0;
        for (double item : x) {
            total += item;
        }
        return total;
    }

    // Bài 2: Phương thức tìm số nhỏ nhất
    public static double min(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Mang ko the de trong");
        }

        double minValue = x[0];
        for (double item : x) {
            if (item < minValue) {
                minValue = item;
            }
        }
        return minValue;
    }

    // Bài 2: Phương thức tìm số lớn nhất
    public static double max(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Mang ko the de trong");
        }

        double maxValue = x[0];
        for (double item : x) {
            if (item > maxValue) {
                maxValue = item;
            }
        }
        return maxValue;
    }

    // Bài 3: Phương thức chuyển đổi ký tự đầu tiên của mỗi từ sang ký tự hoa
    public static String toUpperFirstChar(String s) {
        String[] name = s.split(" "); // => tách name thành 1 mảng các từ đã đc tách
        
        for (int i=0; i<name.length; i++) {
            char firstChar = name[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            name[i]= upperFirstChar + name[i].substring(1); //subtring là phần còn lại của mảng
        }
        String kq = String.join(" ", name);
        return kq;
    }

    public static void main(String[] args) {
        // Bài 4: Sử dụng các phương thức trong lớp XPoly
        double[] numbers = { 1.5, 3.8, 2.0, 4.7 };

        System.out.println("Sum: " + sum(numbers));
        System.out.println("Min: " + min(numbers));
        System.out.println("Max: " + max(numbers));

        String ten = "nguyen van teo";
        String tenMoi = toUpperFirstChar(ten);
        System.out.println("Viet hoa: " +tenMoi);
        
        String ten1 = "ngo quang quoc";
        String tenMoi1 = toUpperFirstChar(ten1);
        System.out.println("Viet hoa: " +tenMoi1);
    }
}
