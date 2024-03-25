import java.util.*;
import java.io.*;
import java.lang.*;

public class Diem {
    private double hoanhDo;
    private double tungDo;

    public Diem(){
    }
    
    public void setInfo(double hoanhDo, double tungDo){
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public double getHoanhDo(){
        return this.hoanhDo;
    }
    public double getTungDo(){
        return this.tungDo;
    }

}