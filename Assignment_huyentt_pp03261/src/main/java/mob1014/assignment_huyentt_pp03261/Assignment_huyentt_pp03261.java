package mob1014.assignment_huyentt_pp03261;
public class Assignment_huyentt_pp03261 {

    public static void main(String[] args) {
        AssGD1 nv= new AssGD1();
        NhanVien nv01 = new HanhChinh("NV01", "Hoang Doan Cuong",  5000,"Hanh Chinh");
        NhanVien nv02 = new HanhChinh("NV02", "Do Ngoc Nam",  4000, "Hanh Chinh");
        NhanVien nv03 = new TruongPhong("NV03", "Le Van Hoang",  7000, "Truong Phong", 2500);
        NhanVien nv04 = new TiepThi("NV04", "Tran Quang Anh", 4000, "Tiep Thi", 90000, 20);
        NhanVien nv05 = new TiepThi("NV05", "Vu Quang Tuan", 5000, "Tiep Thi", 70000, 20);
        nv.listNV.add(nv01);
        nv.listNV.add(nv02);
        nv.listNV.add(nv03);
        nv.listNV.add(nv04);
        nv.listNV.add(nv05);
        nv.Menu();
    }
}
