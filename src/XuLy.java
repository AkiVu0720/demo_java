import java.util.ArrayList;

public class XuLy {
    static ArrayList<DanhMuc>danhMucArrayList = new ArrayList<>();
    static  ArrayList<SanPham>sanPhamArrayList = new ArrayList<>();
    public static void main(String[] args) {
dataDanhMuc();
dataSanPham();
themSanPhamVaoList();
        System.out.println("So luong san phan cua tung Danh Muc");
        for ( DanhMuc danhmuc : danhMucArrayList) {
            System.out.printf( "%4s - %4d", danhmuc.getTenDanhMuc(),danhmuc.getSanPhamList().size());
        }
    }

    public static DanhMuc layDanhMucTheoId(String danhMucId){
        for (DanhMuc danhMuc : danhMucArrayList) {
            if (danhMuc.getMaDanhMuc().equalsIgnoreCase(danhMucId)){
                return danhMuc;
            }
        }
        return  null;
    }›
    public static void themSanPhamVaoList(){
        for (SanPham sanPham : sanPhamArrayList) {
            DanhMuc danhMuc = layDanhMucTheoId(sanPham.getMaDanhMuc());
            if (danhMuc!=null){
                danhMuc.getSanPhamList().add(sanPham);
            }else {
                System.out.println("Khong the them.");
            }
        }
    }
    public  static void dataDanhMuc(){
        DanhMuc danhMuc = new DanhMuc("DM01", "QuanAo");
        danhMucArrayList.add(danhMuc);
        danhMuc = new DanhMuc("DM02", "DongHo");
        danhMucArrayList.add(danhMuc);
        danhMuc = new DanhMuc("DM03", "PhuongTien");
        danhMucArrayList.add(danhMuc);
    }
    public  static  void  dataSanPham(){
        SanPham sanPham = new SanPham("SP01","AoDai","DM01" );
        sanPhamArrayList.add(sanPham);
        sanPham = new SanPham("SP02","Ao The Thao","DM01" );
        sanPhamArrayList.add(sanPham);
        sanPham = new SanPham("SP03","Casino","DM02" );
        sanPhamArrayList.add(sanPham);
        sanPham = new SanPham("SP04","Rolex","DM02" );
        sanPhamArrayList.add(sanPham);
        sanPham = new SanPham("SP05","Xe oto","DM03" );
        sanPhamArrayList.add(sanPham);
        sanPham = new SanPham("SP06","Xe may","DM03" );
        sanPhamArrayList.add(sanPham);

    }
}
