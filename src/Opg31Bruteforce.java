public class Opg31Bruteforce {

	static int total = 0;
	static int[] coinCounter = {0, 0, 0, 0, 0, 0, 0};

	public static void main(String[] args) {
		CoinCollection cc = new CoinCollection();
		loop(CoinEnum.getByNumber(0));
		System.out.println("total " + total);
	}

	private static void loop(CoinEnum coin) {
		while (coinCounter[coin.number] <= 200 / coin.moneyValue) {
			boolean isLarge = calculate();
			if (isLarge) {
				coinCounter[coin.number] = 0;
				break;
			}
			CoinEnum nextCoin = getNextCoin(coin);
			if (nextCoin != null) {
				loop(nextCoin);
			}
			coinCounter[coin.number]++;
		}
	}

	private static CoinEnum getNextCoin(CoinEnum coin) {
		return CoinEnum.getByNumber(coin.number + 1);
	}

	private static boolean calculate() {
		int runningTotal = 0;
		for (CoinEnum coin : CoinEnum.values()) {
			runningTotal += coin.moneyValue * coinCounter[coin.number];
		}
		if (runningTotal == 200) {
			total++;
//			StringBuilder string = new StringBuilder();
//			for (CoinEnum coin : CoinEnum.values()) {
//				string.append(coin.moneyValue).append(": ").append(coinCounter[coin.number]).append(" ");
//			}
//			System.out.println(string);
		}
		return runningTotal >= 200;
	}
}
