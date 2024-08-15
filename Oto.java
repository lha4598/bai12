import java.util.Scanner;

public class Oto extends Xe {
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto() {

    }

    public Oto(String id, String hang, int nsx, int gia, String mau, int soChoNgoi, String kieuDongCo) {
    super(id, hang, nsx, gia, mau);
    this.soChoNgoi = soChoNgoi;
    this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Số chỗ ngồi: ");
        soChoNgoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Kiểu động cơ: ");
        kieuDongCo = sc.nextLine();

    }

    @Override
    public String toString() {
        return super.toString() + "Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                '}';
    }
}
