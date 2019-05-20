package tugasrumus;

import java.util.Scanner;

public class Balok extends Rumus{
	
	public void balok() {
		Scanner scan = new Scanner (System.in);
		
		double panjang, lebar, tinggi, luas, keliling, volume;
		
		System.out.println("BALOK");
		System.out.println("=====");
		System.out.print("Input Panjang = ");
		panjang = scan.nextDouble(); scan.nextLine();
		System.out.print("Input Lebar = ");
		lebar = scan.nextDouble();scan.nextLine();
		System.out.print("Input Tinggi = ");
		tinggi = scan.nextDouble(); scan.nextLine();
		
		luas = 2*((panjang*tinggi)+(panjang*lebar)+(lebar*tinggi));
		keliling = 4*(panjang+lebar+tinggi);
		volume = panjang*lebar*tinggi;
		
		System.out.println("Luas Balok = "+luas);
		System.out.println("Keliling Balok = "+keliling);
		System.out.println("Volume Balok = " +volume);
	}
}
