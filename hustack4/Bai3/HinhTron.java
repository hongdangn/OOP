public class HinhTron extends HinhHoc 
                      implements ITron, ISoSanh {

    protected double bk;

    public double HinhTron(double bk) {
        this.bk = bk;
    }

    public double lay_bk() {
        return bk;
    }

    public double chuvi() {
        return 2*PI*bk;
    }

    public double dientich() {
        return PI*bk*bk;
    }

    public boolean sosanh_nguong() {
        if (dientich() > NGUONG) return true;
        return false;
    }
}
