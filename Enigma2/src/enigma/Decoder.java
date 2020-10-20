package enigma;

public class Decoder {
	private String uzkodotaZinute;
	private String zodziai;

	public void atkoduok() {
		String atkoduotas = "";
		for (int i = uzkodotaZinute.length()-3; i > 5; i--) {
			atkoduotas += uzkodotaZinute.charAt(i);
			i=i-4;
		}
		zodziai = atkoduotas;
	}

	public Decoder(String uzkodotaZinute) {
		this.uzkodotaZinute = uzkodotaZinute;
	}

	public String getzodziai() {
		return zodziai;
	}

	
}
