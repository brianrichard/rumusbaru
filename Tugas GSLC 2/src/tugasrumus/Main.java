//Brian Richard - 2001580321
package tugasrumus;

public class Main {
	
	public static void main(String[]args) {
		
		Rumus mainrumus = new Rumus();
		mainrumus.start();
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
