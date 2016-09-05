package baseTest;

public class Split {
	public static void main(String[] args) {
		String aa = "sdffas.jpg";
		String[] split = aa.split("\\.");
		for (String string : split) {
			System.out.println(string);
		}
	}

}
