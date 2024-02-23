public class helloworld {
    public static void main(String[] args){
        System.out.print("Hello World! ");
        System.out.println("I will print on the same line.");
        System.out.println(10 + 15);
        // int a = 10, b = 15, c = 20;
        // System.out.println(a + b + c);
        // String s = "dang";
        // System.out.println(s);
        float x = 1.99f;
        System.out.println(x);
        char m = 65;
        System.out.println(m);
        double db = 2.3d;
        System.out.println((int) db);
        String txt = "ans,sdjdskdks";
        System.out.println("the length of txt is " + txt.length());
        System.out.println(txt.indexOf("ds"));
        String dang = "dang an \'cut chi ma gioi rua";
        System.out.println(dang);
        if(dang.length() > txt.length()){
            System.out.println("dang top 1");
        }
        int var = (dang.length() < txt.length()) ? 10 : 20;
        System.out.println(var);
        int i = 0;
        while(i < 10){
            i++;
            if(i == 4){
                continue;
            }
            System.out.print(i);
        }
        String[] cars = {"BMW", "Lambor", "Ford"};
        cars[0] = "dang";
        System.out.println(cars);
        System.out.println(cars.length);
    }
}