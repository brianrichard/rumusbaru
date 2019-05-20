package tugasrumus;

import java.util.Scanner;

public class Kubus extends Rumus {

	public void kubus() {
		Scanner scan = new Scanner (System.in);
		
		double luas, keliling, volume, sisi;
		
		System.out.println("KUBUS");
		System.out.println("=====");
		System.out.print("Input Sisi = ");
		sisi = scan.nextDouble(); scan.nextLine();
		
		luas = 6*(sisi*sisi);
		keliling = 12*sisi;
		volume = sisi*sisi*sisi;
		
		System.out.println("Luas Kubus = "+luas);
		System.out.println("Keliling Kubus = " +keliling);
		System.out.println("Volume Kubus = "+volume);
	}
}
