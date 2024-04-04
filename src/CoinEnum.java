import java.util.Arrays;
import java.util.Random;

public enum CoinEnum {
	P1(1, 0),
	P2(2, 1),
	P5(5, 2),
	P10(10, 3),
	P20(20, 4),
	P50(50, 5),
	POUND(100, 6);


	public final int moneyValue;
	public final int number;
	//private static final List<CoinEnum> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = values().length;
	private static final Random RANDOM = new Random();

	private CoinEnum(int moneyValue, int number) {
		this.moneyValue = moneyValue;
		this.number = number;
	}

	public static CoinEnum getByNumber(int number) {
		return Arrays.stream(values()).filter(coin -> coin.number == number).findFirst().orElse(null);
	}

	public static CoinEnum getRandom() {
		CoinEnum[] values = values();
		return values[RANDOM.nextInt(SIZE)];
	}
}
