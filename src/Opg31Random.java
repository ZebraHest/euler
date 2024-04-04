import java.util.HashSet;


public class Opg31Random {


	public static void main(String[] args) {
		HashSet<String> usedSet = new HashSet<>();


		for (int i = 0; i < 10000000; i++) {
			CoinCollection cc = new CoinCollection();
			while (cc.getValue() < 200) {
				CoinEnum newCoin = getRandomCoin();
				cc.addCoin(newCoin);
			}
			if (cc.getValue() == 200
					&& !usedSet.contains(cc.toString())) {
				usedSet.add(cc.toString());
				System.out.println(cc);
			}
		}
		System.out.println("end " + usedSet.size());
	}

	static protected CoinEnum getRandomCoin() {
		return CoinEnum.getRandom();
	}

}