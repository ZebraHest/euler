import java.util.Arrays;

public class Opg853 {

	static int numFib = 120*2;


	public static void main(String[] args) {
		long[] fib = genFib(19);
		System.out.println(Arrays.toString(fib));
	}


	private static long[] genFib(int n) {
		long[] fib = new long[numFib];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < numFib; i++) {
			fib[i] = (fib[i - 1] + fib[i - 2]) % n;
		}
		return fib;
	}

	private static boolean isNPeriod(long[] fib, int n) {
		fib
	}
}
