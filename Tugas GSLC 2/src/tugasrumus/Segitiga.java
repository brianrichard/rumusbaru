package tugasrumus;

import java.util.Scanner;

public class Segitiga extends Rumus{

	public void segitiga() {
		Scanner scan = new Scanner(System.in);
		
		double alas, tinggi, sisi, luas, keliling;
		
		System.out.println("SEGITIGA");
		System.out.println("========");
		System.out.print("Input Alas = ");
		alas = scan.nextDouble();
		System.out.print("Input Tinggi = ");
		tinggi = scan.nextDouble();
		System.out.print("Input Sisi Miring = ");
		sisi = scan.nextDouble(); scan.nextLine();
		
		luas = (alas*tinggi)/2;
		keliling = (sisi*2) + alas;
		
		System.out.println("Luas Segitiga = " + luas);
		System.out.println("Keliling Segitiga = " + keliling);
	}
}
