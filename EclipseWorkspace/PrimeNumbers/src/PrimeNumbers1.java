import java.util.HashMap;
import java.util.Map;

public class PrimeNumbers1 {
	public static void main(String[] args) {
		PrimeCounters primeCounters = new PrimeCounters();

		System.out.println(primeCounters.primesLessThanNINT(3000000));
		System.out.println(primeCounters.primesLessThanNLONG(300000000L));
	}

	static class PrimeCounters {
		public int primesLessThanNINT(int n) {
			int counter = 0;

			boolean[] isPrime = new boolean[n + 1];

			for (int populator = 0; populator <= n; populator++) {
				isPrime[populator] = true; // initially treat all values as prime
			}

			for (int factor = 2; factor * factor <= n; factor++) {
				if (isPrime[factor]) { // if factor is prime, mark multiples of factor as not prime, skipping numbers
										// marked already as not prime
					for (int j = factor; factor * j <= n; j++) {
						isPrime[factor * j] = false; // every factor is marked as not prime
					}
				}
			}

			for (int i = 1; i <= n; i++) {
				if (isPrime[i]) {
					counter++;
				}
			}
			return counter - 1;
		}

		public long primesLessThanNLONG(long n) {
			long counter = 0L;
			long initial = 2L;

			Map<Long, Boolean> isPrime = new HashMap<Long, Boolean>();

			isPrime.put(initial, true);

			for (long factor = 2L; factor * factor <= n; factor++) {
				if (isPrime.getOrDefault(factor, true)) {
					//System.out.println(factor);
					for (long j = factor; factor * j <= n; j++) {
						//System.out.println(factor * j + " " + factor);
						isPrime.put(factor * j, false);
					}
				}
			}

			for (long i = 2L; i <= n ; i++) {
				if (isPrime.getOrDefault(i, true)) {
					counter++;
				}
			}

			return counter;
		}
	}

}
