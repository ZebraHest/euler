import java.util.ArrayList;

public class Opg38 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 500000; i++) {
			for (int j = 2; j < 9; j++) {
				StringBuilder string = new StringBuilder("" + i);
				for (int k = 2; k <= j; k++) {
					string.append(k * i);

				}
				if (isPandigital(string.toString())) {
					list.add(string.toString());
					System.out.println(string + " " + i + " " + j);
				}
			}
		}
		list.sort(String.CASE_INSENSITIVE_ORDER);
		for (String element : list) {
			System.out.println(element);
		}
	}


	private static boolean isPandigital(int number) {
		String string = String.valueOf(number);
		return isPandigital(string);
	}

	private static boolean isPandigital(String string) {
		if (string.length() != 9) return false;

		for (int i = 1; i <= 9; i++) {
			if (!string.contains(String.valueOf(i))) return false;
		}

		return true;
	}
}
