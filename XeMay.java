import java.util.Scanner;

public class XeMay extends Xe {
    private int congSuat;

    public XeMay() {

    }

    public XeMay(String id,String hang, int nsx, int gia, String mau, int congSuat) {
        super(id, hang, nsx, gia, mau);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Công suất: ");
        congSuat = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "XeMay{" +
                "congSuat=" + congSuat +
                '}';
    }
}
