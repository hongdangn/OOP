public class HinhVuong extends HinhChuNhat 
                       implements ISoSanh {
    
    protected double canh;

    public HinhVuong(double canh) {
        super(canh, canh);
        this.canh = canh;
    }

    public double lay_canh() {
        return canh;
    }

    public double chuvi() {
        return 4*canh;
    }

    public double dientich() {
        return canh*canh;
    }

    public boolean sosanh_nguong() {
        if (dientich() > NGUONG) return true;
        return false;
    }
}
