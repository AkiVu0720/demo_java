import java.util.Scanner;

public class SanPham {
    private String tenSanPham;
    private String maSanPham;
    private String maDanhMuc;

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public SanPham() {
    }

    public SanPham( String maSanPham,String tenSanPham, String maDanhMuc) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.maDanhMuc = maDanhMuc;
    }

    public void  input(Scanner scanner){
         System.out.println("nhap ma SanPham: ");
         this.maSanPham = scanner.nextLine();
         System.out.println("nhap ten SanPham: ");
         this.tenSanPham = scanner.nextLine();
     }
}
