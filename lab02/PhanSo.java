/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PhanSo{
	private int tuSo;
	private int mauSo;
	
	public PhanSo(){
	}
	
	public void setTT(int tuSo, int mauSo){
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public int getTuso(){
		return this.tuSo;
	}
	public int getMauSo(){
		return this.mauSo;
	}
	
	public int UCLN(){
		int newTuSo = Math.abs(this.tuSo);
		int newMauSo = Math.abs(this.mauSo);
		
		while(newTuSo != newMauSo){
			if (newTuSo > newMauSo) newTuSo -= newMauSo;
			else newMauSo -= newTuSo;
		}
		
		return newTuSo;
    }
	
	static void congPhanSo(PhanSo ps1, PhanSo ps2){
		PhanSo ps = new PhanSo();
		
		ps.tuSo = ps1.tuSo * ps2.mauSo + ps1.mauSo * ps2.tuSo;
		ps.mauSo = ps1.mauSo * ps2.mauSo;
		
		int gcd = ps.UCLN();
		ps.tuSo = ps.tuSo / gcd;
		ps.mauSo = ps.mauSo / gcd;
		
		System.out.println(ps.tuSo + '/' + ps.mauSo);
	}
	
	static void nhanPhanSo(PhanSo ps1, PhanSo ps2){
		PhanSo ps = new PhanSo();
		
		ps.tuSo = ps1.tuSo * ps2.tuSo;
		ps.mauSo = ps1.mauSo * ps2.mauSo;		
		int gcd = ps.UCLN();

		ps.tuSo /= gcd;
		ps.mauSo /= gcd;
		
		System.out.println(ps.tuSo + "/" + ps.mauSo);
	}

	public static void main (String[] args) throws java.lang.Exception{
		PhanSo phanso1 = new PhanSo();
		phanso1.setTT(15, 10);
		
		PhanSo phanso2 = new PhanSo();
		phanso2.setTT(20, 3);
		
		nhanPhanSo(phanso1, phanso2);
	}
}