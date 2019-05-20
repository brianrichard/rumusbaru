package tugasrumus;

import java.util.Scanner;

public class Rumus extends Thread {
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void run() {
		Lingkaran lingkaran1 = new Lingkaran();
		Persegi persegi1 = new Persegi();
		Segitiga segitiga1 = new Segitiga();
		PersegiPanjang persegipanjang1 = new PersegiPanjang();	
		Balok balok1 = new Balok();
		Kubus kubus1 = new Kubus();
		Bola bola1 = new Bola();
	
	int choice;
	do {
		do {
			System.out.println("PERHITUNGAN RUMUS");
			System.out.println("=================");
			System.out.println("1. Lingkaran");
			System.out.println("2. Persegi");
			System.out.println("3. Persegi Panjang");
			System.out.println("4. Segitiga");
			System.out.println("5. Balok");
			System.out.println("6. Kubus");
			System.out.println("7. Bola");
			System.out.println("8. Exit");
			System.out.print("Choose = ");
			choice = scan.nextInt(); scan.nextLine();
		} while (choice < 1 || choice > 8);
		if(choice == 1) {
			lingkaran1.lingkaran();
		}else if(choice == 2) {
			persegi1.persegi();
		}else if(choice == 3) {
			persegipanjang1.persegipanjang();	
		}else if(choice == 4) {
			segitiga1.segitiga();
		}else if(choice == 5) {
			balok1.balok();
		}else if(choice == 6) {
			kubus1.kubus();
		}else if(choice == 7) {
			bola1.bola();
		}
	}while(choice != 8);
}
}