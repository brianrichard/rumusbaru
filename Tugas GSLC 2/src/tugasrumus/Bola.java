package tugasrumus;

import java.util.Scanner;

public class Bola extends Rumus{

	public void bola() {
		Scanner scan = new Scanner (System.in);
		
		double luas, keliling, volume, r;
		double phi = 3.14;
		
		System.out.println("BOLA");
		System.out.println("=====");
		System.out.print("Input Jari-Jari = ");
		r = scan.nextDouble(); scan.nextLine();
		
		luas = 4*phi*r*r;
		keliling = 0.75 * phi *r*r;
		volume = 0.75 * phi * r*r*r;
		
		System.out.println("Luas Bola = "+luas);
		System.out.println("Keliling Bola = "+keliling);
		System.out.println("Volume Bola = " +volume);
	}
}
