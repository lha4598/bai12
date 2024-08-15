import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyXe quanLyXe = new QuanLyXe();
        while (true) {
            System.out.println("-------MENU------");
            System.out.println("1. Thêm xe ");
            System.out.println("2. Xóa xe");
            System.out.println("3. Tìm xe theo hãng và màu");
            System.out.println("4. Thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("1.Xe ô tô \n2.Xe máy \n3.Xe tải");
                    int chon = sc.nextInt();
                    sc.nextLine();
                    if (chon == 1) {
                        Xe oto = new Oto();
                        oto.Nhap();
                        quanLyXe.addXe(oto);
                        break;
                    }
                    if (chon == 2) {
                        Xe xeMay = new XeMay();
                        xeMay.Nhap();
                        quanLyXe.addXe(xeMay);
                        break;
                    }
                    if (chon == 3) {
                        Xe xeTai = new XeTai();
                        xeTai.Nhap();
                        quanLyXe.addXe(xeTai);
                        break;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nhập id xe cần xóa ");
                    String id = sc.nextLine();
                    quanLyXe.removeXe(id);
                    break;
                }
                case 3: {
                    System.out.println("Nhập hãng cần tìm");
                    String hang = sc.nextLine();
                    System.out.println("Nhập màu cần tìm ");
                    String mau = sc.nextLine();
                    System.out.println("\"1.Xe ô tô \\n2.Xe máy \\n3.Xe tải\"");
                    int chon1 = sc.nextInt();
                    sc.nextLine();
                    if (chon1 == 1) {
                        quanLyXe.timXeOto(hang, mau);
                    }
                    if (chon1 == 2) {
                        quanLyXe.timXeMay(hang, mau);
                    }
                    if (chon1 == 3) {
                        quanLyXe.timXeTai(hang, mau);
                    }
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}
