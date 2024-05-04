public class HinhChuNhat extends HinhHoc {
    private double dai;
    private double rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double lay_dai() {
        return dai;
    }
    public double lay_rong() {
        return rong;
    }

    public double chuvi() {
        return 2*(dai + rong);
    }

    public double dientich() {
        return dai*rong;
    }
}
