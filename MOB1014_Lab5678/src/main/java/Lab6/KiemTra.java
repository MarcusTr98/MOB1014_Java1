
package Lab6;

public class KiemTra {
        
    public boolean Email(String str){
        String pattern = "\\w+@\\w+(\\.\\w+){1,2}";
        return str.matches(pattern);
    }
    public boolean Phone(String str){
        String pattern = "0\\d{9}";
        return str.matches(pattern);
    }
    public boolean CMND(String str){
        String pattern = "031\\d{9}";
        return str.matches(pattern);
    }
}
