package enigma;

import java.util.Scanner;

public class InputOutputMng {
int ats;
	public void paklaust() {
		Scanner scan = new Scanner(System.in);
		paklausk ();
		System.out.println("Iveskite koda:");
		
		String kodas = scan.nextLine();
		
		switch (ats) {
		case 1:
			Decoder d = new Decoder(kodas);
			d.atkoduok();
			System.out.println(d.getzodziai());
			break;
		case 2:
			Encoder e = new Encoder(kodas);
			 e.koduok();
			 System.out.println(e.getSifras());
			break;
		default:
			System.out.println("Tokio pasirinkimo nera.");

		}
	}
		private void paklausk () {
			Scanner scan = new Scanner(System.in);
			System.out.println(
					"Sveiki," + "\n" + "Spauskite 1 jei norite atkoduoti" + "\n" + "Spauskite 2 jei norite uzkoduoti");

			this.ats  = scan.nextInt();
			
			
		}
	
}
