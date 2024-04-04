public class Opg33 {

	public static void main(String[] args) {
		for (int tal = 1; tal < 100; tal++) {
			for (int nav = 1; nav < 100; nav++) {
//		int tal = 49;
//		int nav = 98;
				String[] talString = numToString(tal).split("");
				String[] navString = numToString(nav).split("");

				double realDiv = (double) tal / (double) nav;
//				System.out.println(tal + " / " + nav + " = " + realDiv);
				test(0, 0, talString, navString, realDiv);
				test(0, 1, talString, navString, realDiv);
				test(1, 0, talString, navString, realDiv);
				test(1, 1, talString, navString, realDiv);


			}
		}
	}

	private static void test(int i, int j, String[] talString, String[] navString, double realDiv) {
		if (talString[i].equals(navString[j])
				&& !talString[i].equals("0")
				&& realDiv < 1) {
			double fakeDiv = Double.parseDouble(talString[1 - i]) / Double.parseDouble(navString[1 - j]);
			if (realDiv == fakeDiv) {
				System.out.println(talString[0] + talString[1] + " / " + navString[0] + navString[1] + " = " + realDiv);
			}
		}
	} // 64, 95, 65, 98 =
//	64 =

	private static String numToString(int tal) {
		String string = "0" + tal;
		return string.subSequence(string.length() - 2, string.length()).toString();
	}
}
