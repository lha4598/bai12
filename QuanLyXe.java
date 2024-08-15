import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyXe {
    private List<Xe> xes;

    public QuanLyXe() {
        this.xes = new ArrayList<Xe>();
    }

    public void addXe(Xe xe) {
        this.xes.add(xe);
    }

    public void removeXe(String id) {
        this.xes.removeIf(xe -> xe.getId() == id);
    }

    public void showXe() {
        this.xes.forEach(xe -> System.out.println(xe.toString()));
    }

    public void timXeOto(String hang, String mau) {
        List<Oto> otos = this.xes.stream().filter(xe -> xe instanceof Oto).map(xe -> (Oto) xe).filter(oto -> oto.getHang().equals(hang) && oto.getMau().equals(mau)).collect(Collectors.toList());
        otos.forEach(oto -> System.out.println(oto.toString()));
    }

    public void timXeMay(String hang, String mau) {
        List<XeMay> xeMays = this.xes.stream().filter(xe -> xe instanceof XeMay).map(xe -> (XeMay) xe).filter(xeMay -> xeMay.getMau().equals(mau) && xeMay.getHang().equals(hang)).collect(Collectors.toList());
        xeMays.forEach(xeMay -> System.out.println(xeMay.toString()));
    }

    public void timXeTai(String hang, String mau) {
        List<XeTai> xeTais = this.xes.stream().filter(xe -> xe instanceof XeTai).map(xe -> (XeTai) xe).filter(xeTai -> xeTai.getHang().equals(hang) && xeTai.getMau().equals(mau)).collect(Collectors.toList());
        xeTais.forEach(xeTai -> System.out.println(xeTais.toString()));
    }


}


