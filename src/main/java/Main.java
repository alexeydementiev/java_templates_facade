import classes.BinOps;

public class Main {

	public static void main(String[] args) {
		BinOps bins = new BinOps();
		System.out.println(bins.sum("10101011", "100010100000"));
		System.out.println(bins.mult("10101011001", "10001010"));
	}
}
