package tugasrumus;

import java.util.Scanner;

public class Lingkaran extends Rumus{

	public void lingkaran() {
		Scanner scan = new Scanner (System.in);
		
		double luas, keliling, r;
		double phi = 3.14;
		
		System.out.println("LINGKARAN");
		System.out.println("==========");
		System.out.print("Input Jari-Jari = ");
		r = scan.nextDouble();
		luas = phi * (r*r);
		keliling = 2 * phi * r;
		
		System.out.println("Luas Lingkaran = "+luas);
		System.out.println("Keliling Lingkaran = " +keliling);
	}
}
