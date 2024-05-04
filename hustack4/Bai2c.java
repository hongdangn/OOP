public class Bai2c {
    static StringBuffer dao(StringBuffer str) {
        int n = str.length();
        StringBuffer daoStr = new StringBuffer(n);
        for (int i = 0; i < n; i++) {
            daoStr.append(str.charAt(n - 1 - i));
        }
        return daoStr;
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("dang");
        System.out.println(dao(str));
    }
}
