import java.util.ArrayList;
import java.util.Comparator;

public class CoinCollection {
	private ArrayList<CoinEnum> array = new ArrayList<CoinEnum>();
	private int total = 0;

	public static final Comparator<CoinEnum> DESCENDING_COMPARATOR = new Comparator<CoinEnum>() {
		// Overriding the compare method to sort the age
		public int compare(CoinEnum d, CoinEnum d1) {
			return d.moneyValue - d1.moneyValue;
		}
	};

	public void addCoin(CoinEnum newCoin) {
		array.add(newCoin);
		array.sort(DESCENDING_COMPARATOR);
		total += newCoin.moneyValue;
	}

	public int getValue() {
		return total;
	}

	public void reset() {
		array.clear();
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder("[");
		for (CoinEnum coin : array) {
			string.append(" ").append(coin.moneyValue);
		}

		return string + " ]";
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}
}



