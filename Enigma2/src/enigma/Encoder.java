package enigma;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Encoder {
	private String zinute;
	private String sifras;

	public void koduok() {
		String naujasZodis = "";
		for (int j = 0; j < 3; j++) {
			naujasZodis += "" + generuokChar() + generuokRandom();
		}

		for (int i = zinute.length() - 1; i >= 0; i--) {
			int h = (int) (zinute.charAt(i) * generuokRandom());
			if (h < 99)
				h += 100;

			naujasZodis += h;
			naujasZodis += zinute.charAt(i);

			naujasZodis += generuokChar();
		}
		naujasZodis += generuokRandom();
		sifras = naujasZodis;

	}

	private int generuokRandom() {
		Random rnd = new Random();
		int c = rnd.nextInt(7);
		return c;
	}

	private char generuokChar() {
		Random rnd = new Random();
		char c = (char) ('a' + rnd.nextInt(126));
		return c;
	}

	public Encoder(String zinute) {
		this.zinute = zinute;
	}

	public String getSifras() {
		return sifras;
	}

}
