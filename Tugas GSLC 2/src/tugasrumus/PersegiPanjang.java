package tugasrumus;

import java.util.Scanner;

public class PersegiPanjang {
	
	public void persegipanjang() {
		Scanner scan = new Scanner (System.in);
		
		double luas, keliling, panjang, lebar;
		
		System.out.println("PERSEGI PANJANG");
		System.out.println("===============");
		System.out.print("Input Panjang = ");
		panjang = scan.nextDouble(); scan.nextLine();
		System.out.print("Input Lebar = ");
		lebar = scan.nextDouble(); scan.nextLine();
		
		luas = panjang*lebar;
		keliling = (2*panjang) + (2*lebar);
		
		System.out.println("Luas Persegi Panjang = " +luas);
		System.out.println("Keliling Persegi Panjang = "+keliling);
	}
}
