import java.util.Scanner;

public class Xe {
    private String id;
    private String hang;
    private int nsx,gia;
    private String mau;
    public Xe() {

    }

    public Xe(String id,String hang, int nsx, int gia, String mau) {
        this.id = id;
        this.hang = hang;
        this.nsx = nsx;
        this.gia = gia;
        this.mau = mau;
    }

    public String getId() {
        return id;
    }


    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNsx() {
        return nsx;
    }

    public void setNsx(int nsx) {
        this.nsx = nsx;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID xe: ");
        id = sc.nextLine();
        System.out.println("Hãng: ");
        hang = sc.nextLine();
        System.out.println("Năm sản xuất: ");
        nsx = sc.nextInt();
        System.out.println("Giá bán:");
        gia = sc.nextInt();
        sc.nextLine();
        System.out.println("Màu xe: ");
        mau = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Xe{" +
                "id='" + id + '\'' +
                ", hang='" + hang + '\'' +
                ", nsx=" + nsx +
                ", gia=" + gia +
                ", mau='" + mau + '\'' +
                '}';
    }
}
