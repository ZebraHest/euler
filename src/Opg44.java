import java.util.ArrayList;

public class Opg44 {

	public static void main(String[] args) {
		ArrayList<Integer> list = createNumbers();

		for (int i = 0; i < list.size() / 2; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int iTal = list.get(i);
				int jTal = list.get(j);
				int sum = iTal + jTal;
				int dif = jTal - iTal;

				if (list.contains(sum)) {
					System.out.println(iTal + " " + jTal + " " + sum + " " + dif);

					if (list.contains(dif)) {
						System.out.println("Se her: " + iTal + " " + jTal + " " + sum + " " + dif);
					}
				}
			}

		}
	}

	private static ArrayList<Integer> createNumbers() {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10000; i++) {
			int value = i * (i * 3 - 1) / 2;
			list.add(value);
		}
		return list;
	}
}
