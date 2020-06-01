package Mathematics;
import java.util.*;
import java.math.BigInteger;

public class Factorial {
	static BigInteger fact(int N) {
		BigInteger f = new BigInteger("1");
		for(int i = 2; i <= N; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			System.out.println(fact(n));
		}
		sc.close();
	}

}
