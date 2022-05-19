package classes;

public class BinOps {

	public String sum(String a, String b) {
		return convertFromInt(convertFromBin(a) + convertFromBin(b));
	}

	public String mult(String a, String b) {
		return convertFromInt(convertFromBin(a) * convertFromBin(b));
	}


	private Integer convertFromBin(String arg) {
		return Integer.parseInt(arg, 2);
	}

	private String convertFromInt(Integer arg) {
		return Integer.toBinaryString(arg);
	}
}

