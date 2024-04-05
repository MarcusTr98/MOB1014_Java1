package mob1014.assignment_huyentt_pp03261;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class AssGD1 {  
    ArrayList<NhanVien> listNV= new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    public void Nhap(){
        do {
            System.out.println("------");
            System.out.print("Nhap ma nhan vien: ");
            String ID = input.nextLine();
            if (ID.equals("") || ID == null) {
                break;
            }
            System.out.print("Nhap ho ten nhan vien: ");
            String name = input.nextLine();
            System.out.print("Nhap luong co ban: ");
            double luongCoBan = Double.parseDouble(input.nextLine());
            System.out.print("Vi tri lam viec (Hanh chinh/ Tiep thi/ Truong phong): ");
            String phongBan = input.nextLine();
            if(phongBan.equalsIgnoreCase("Hanh chinh")){
                NhanVien nv = new HanhChinh(ID, name, luongCoBan, phongBan);
                listNV.add(nv);
            }else if(phongBan.equalsIgnoreCase("Tiep thi")){
                System.out.print("Moi nhap doanh so: ");
                double doanhSo = input.nextDouble();
                System.out.print("Moi nhap hoa hong(%): ");
                double hoaHong = input.nextDouble();
                input.nextLine();
                NhanVien nv = new TiepThi(ID, name, luongCoBan, phongBan, doanhSo, hoaHong);
                listNV.add(nv); 
            }else if(phongBan.equalsIgnoreCase("Truong phong")){
                System.out.print("Moi nhap luong trach nhiem: ");
                double trachNhiem = input.nextDouble();
                input.nextLine();
                NhanVien nv = new TruongPhong(ID, name, luongCoBan, phongBan, trachNhiem);
                listNV.add(nv); 
            }else{
                System.out.println("Vui long nhap dung vi tri lam viec!");
            }
        } while (true);
        System.out.print("Da nhap xong du lieu!");
    }
    
    public void Xuat() {
        System.out.printf("%10s ||%20s ||%20s ||%20s\n","MA NV","HO TEN NV","LUONG(VND)","PHONG BAN");
        for(NhanVien nv: listNV){
            System.out.printf("%10s ||%20s ||%20s ||%20s\n",nv.getMaNV(),nv.getHoTen(),nv.getThuNhap(),nv.getPhongBan());
        }
    }    
 
    public void timNV(){
        System.out.print("Moi nhap ma nv muon tim: ");
        String idFound= input.nextLine();
        boolean check = false;
        for(NhanVien nv: listNV){
            if(idFound.equalsIgnoreCase(nv.getMaNV())){
               System.out.printf("%10s ||%20s ||%20s ||%20s\n",nv.getMaNV(),nv.getHoTen(),nv.getThuNhap(),nv.getPhongBan());
               check = true;
               break;
            }
        }
        if(!check){
            System.out.println("Khong tim thay nv nay!");
        }
    }
    
    public void timVaXoaNV(){
        System.out.print("Moi nhap ma nv muon tim va xoa: ");
        String idFound= input.nextLine();
        boolean check = false;
        for(NhanVien nv: listNV){
            if(idFound.equalsIgnoreCase(nv.getMaNV())){
               listNV.remove(nv);
               check = true;
               break;
            }
        }
        if(!check){
            System.out.println("Khong tim thay nv nay!");
        }else{
            System.out.println("Nhan vien da duoc xoa thanh cong!");
        }        
    }
    
public void capNhatNV() {
    System.out.print("Moi nhap ma nv muon cap nhat: ");
    String idFound = input.nextLine();
    NhanVien found = null;

    int index = -1;
    for (int i = 0; i < listNV.size(); i++) {
        NhanVien nv = listNV.get(i);
        if (idFound.equalsIgnoreCase(nv.getMaNV())) {
            System.out.printf("%10s ||%20s ||%20s ||%20s\n", nv.getMaNV(), nv.getHoTen(), nv.getThuNhap(), nv.getPhongBan());
            found = nv;
            index = i;
            break; // không có trường hợp trùng ID
        }
    }

    if (found != null) {
        System.out.print("Nhap ma nhan vien moi: ");
        String ID = input.nextLine();
        ID = (ID.equals("") || ID == null) ? found.getMaNV() : ID;

        System.out.print("Nhap ho ten nhan vien moi: ");
        String name = input.nextLine();
        name = (name.equals("") || name == null) ? found.getHoTen() : name;

        System.out.print("Nhap luong co ban moi: ");
        String luongCoBan = input.nextLine();
        luongCoBan = (luongCoBan.equals("") || luongCoBan == null) ? String.valueOf(found.getLuong()) : luongCoBan;

        if (found instanceof TiepThi) {
            System.out.print("Nhap doanh so: ");
            String doanhSo = input.nextLine();
            doanhSo = (doanhSo.equals("") || doanhSo == null) ? String.valueOf(((TiepThi) found).getDoanhSo()) : doanhSo;

            System.out.print("Nhap hoa hong: ");
            String hoaHong = input.nextLine();
            hoaHong = (hoaHong.equals("") || hoaHong == null) ? String.valueOf(((TiepThi) found).getHoaHong()) : hoaHong;

            NhanVien update = new TiepThi(ID, name, Double.parseDouble(luongCoBan), "Tiep Thi", Double.parseDouble(doanhSo), Double.parseDouble(hoaHong));
            listNV.set(index, update);
        } else if (found instanceof TruongPhong) {
            System.out.print("Nhap luong trach nhiem: ");
            String trachNhiem = input.nextLine();
            trachNhiem = (trachNhiem.equals("") || trachNhiem == null) ? String.valueOf(((TruongPhong) found).getTrachNhiem()) : trachNhiem;

            NhanVien update = new TruongPhong(ID, name, Double.parseDouble(luongCoBan), "Truong Phong", Double.parseDouble(trachNhiem));
            listNV.set(index, update);
        } else {
            NhanVien update = new HanhChinh(ID, name, Double.parseDouble(luongCoBan), found.getPhongBan());
            listNV.set(index, update);
        }

        System.out.println("Cap nhat thanh cong");
    } else {
        System.out.println("Khong tim thay nhan vien nay!");
    }
}

    
    public void timNVKhoangLuong(){
        double min, max;
        System.out.print("Moi nhap khoang luong min: ");
        min= input.nextDouble();
        System.out.print("Moi nhap khoang luong max: "); 
        max= input.nextDouble(); 
        for(NhanVien nv : listNV){
            if(nv.getThuNhap() >= min && nv.getThuNhap() <= max){
                System.out.printf("%10s ||%20s ||%20s ||%20s\n",
                nv.getMaNV(),nv.getHoTen(),nv.getThuNhap(),nv.getPhongBan());
            }
        }
    }
        
//    public void sapXepTen(){
//        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien nv1, NhanVien nv2) {
//                return nv1.getHoTen().compareTo(nv2.getHoTen());
//            }
//        };
//        Collections.sort(listNV, comp);
//        Xuat();
//    }
//    
//    public void sapXepThuNhap(){
//        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien nv1, NhanVien nv2) {
//                if(nv1.getThuNhap() > nv2.getThuNhap()) return 1;
//                else return -1;
//            }
//        };
//        Collections.sort(listNV, comp);
//        Xuat();
//    }
    public void sapXepTen() {
        Comparator<NhanVien> comp = Comparator.comparing(NhanVien::getHoTen);
        Collections.sort(listNV, comp);
        Xuat();
    }

    public void sapXepThuNhap() {
        Comparator<NhanVien> comp = Comparator.comparingDouble(NhanVien::getThuNhap);
        Collections.sort(listNV, comp.reversed()); // reversed : giảm dần, tăng thì bỏ reversed
        Xuat();
    }
    
//    public void xuatTop5(){
//        Collections.sort(listNV, (a, b) -> (int) (b.getThuNhap() - a.getThuNhap()));
//        for(int i=0; i<5; i++){
//            System.out.printf("%10s ||%20s ||%20s ||%20s\n",
//            listNV.get(i).getMaNV(),listNV.get(i).getHoTen(),listNV.get(i).getThuNhap(),listNV.get(i).getPhongBan());
//        }
//    }
    
    public void xuatTop5() {
    if (listNV.isEmpty()) {
        System.out.println("Danh sach nhan vien rong. Khong the xuat top 5.");
        return;
    }

    Collections.sort(listNV, (a, b) -> Double.compare(b.getThuNhap(), a.getThuNhap()));
    

    int topCount = Math.min(5, listNV.size());
    for (int i = 0; i < topCount; i++) {
        NhanVien nv = listNV.get(i);
        System.out.printf("%10s ||%20s ||%20s ||%20s\n", nv.getMaNV(), nv.getHoTen(), nv.getThuNhap(), nv.getPhongBan());
    }
}
    
    public void Menu(){
        while(true){
            System.out.println("\n+------------------------MENU----------------------+");
            System.out.println("\t 1.Nhap danh sach Nhan Vien");
            System.out.println("\t 2.Xuat danh sach Nhan Vien");
            System.out.println("\t 3.Tim Nhan Vien theo ma");
            System.out.println("\t 4.Xoa Nhan Vien theo ma");
            System.out.println("\t 5.Cap nhat Nhan Vien theo ma");
            System.out.println("\t 6.Tim Nhan Vien theo khoang luong");
            System.out.println("\t 7.Sap xep Nhan Vien theo ho va ten");
            System.out.println("\t 8.Sap xep Nhan Vien theo thu nhap");
            System.out.println("\t 9.Xuat 5 Nhan Vien co thu nhap cao nhat");            
            System.out.println("\t 0.Ket thuc.");
            System.out.println("+--------------------------------------------------+");
            System.out.print("Moi chon chuc nang: ");
            
            while (!input.hasNextInt()) {
                System.out.print("Vui long nhap so tu 0->9: ");
                input.nextLine();
            }
            
            int luaChon = input.nextInt();
            input.nextLine();
            switch(luaChon){
                case 1:
                    System.out.println("Ban da chon Nhap danh sach Nhan Vien");
                    Nhap();
                    break;
                case 2:
                    System.out.println("Ban da chon Xuat danh sach Nhan Vien");
                    Xuat();
                    break;
                case 3:
                    System.out.println("Ban da chon Tim Nhan Vien theo ma");
                    timNV();
                    break;
                case 4:
                    System.out.println("Ban da chon Xoa Nhan Vien theo ma");
                    timVaXoaNV();
                    break;
                case 5:
                    System.out.println("Ban da chon Cap nhat Nhan Vien theo ma");
                    capNhatNV();
                    break;
                case 6:
                    System.out.println("Ban da chon Tim Nhan Vien theo khoang luong");
                    timNVKhoangLuong();
                    break; 
                case 7:
                    System.out.println("Ban da chon Sap xep Nhan Vien theo ho va ten");
                    sapXepTen();
                    break;
                case 8:
                    System.out.println("Ban da chon Sap xep Nhan Vien theo thu nhap");
                    sapXepThuNhap();
                    break;
                case 9:
                    System.out.println("Ban da chon Xuat 5 Nhan Vien co thu nhap cao nhat");
                    xuatTop5();
                    break;                     
                case 0:
                    System.out.println("Thoat chuong trinh, tam biet !!");
                    System.exit(0);
                default:
                    System.out.println("Khong co chuc nang nay, vui long nhap lai!");
            }
        }
    }
}
