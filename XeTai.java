import java.util.Scanner;

public class XeTai extends Xe {
    private int trongTai;

    public XeTai() {

    }

    public XeTai(String id, String hang, int nsx, int gia, String mau,int trongTai) {
        super(id, hang, nsx, gia, mau);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("Trọng tải: ");
        trongTai = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "XeTai{" +
                "trongTai=" + trongTai +
                '}';
    }
}
