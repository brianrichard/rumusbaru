package tugasrumus;

import java.util.Scanner;

public class Persegi extends Rumus{
	
	public void persegi() {
		Scanner scan = new Scanner(System.in);
		
		double keliling, luas, inputan;
		
		System.out.println("PERSEGI");
		System.out.println("=======");
		System.out.print("Input Sisi = ");
		inputan = scan.nextDouble(); scan.nextLine();
		luas = inputan * inputan;
		keliling = 4 * inputan;
		
		System.out.println("Luas Persegi = " + luas);
		System.out.println("Keliling Persegi = "+ keliling);
		
	}
}
