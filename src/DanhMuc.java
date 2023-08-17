import java.util.ArrayList;
import java.util.Scanner;

public class DanhMuc {
    private String MaDanhMuc;
    private String TenDanhMuc;
    private ArrayList<SanPham>sanPhamList;



    public String getMaDanhMuc() {
        return MaDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        MaDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return TenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        TenDanhMuc = tenDanhMuc;
    }

    public ArrayList<SanPham> getSanPhamList() {
        return sanPhamList;
    }

    public void setSanPhamList(ArrayList<SanPham> sanPhamList) {
        this.sanPhamList = sanPhamList;
    }

    public DanhMuc(String maDanhMuc, String tenDanhMuc) {
        MaDanhMuc = maDanhMuc;
        TenDanhMuc = tenDanhMuc;

    }

    public DanhMuc() {
    }
    public void input(Scanner scanner){
        System.out.println("Nhap ma Danh Muc: ");
        this.MaDanhMuc = scanner.nextLine();
        System.out.println("Nhap ten Danh Muc: ");
        this.TenDanhMuc = scanner.nextLine();
    }
}
