package Mathematics;
import java.util.*;
import java.math.*;

public class Prime {
	static boolean prime(int n) {
		BigInteger b = new BigInteger(String.valueOf(n));
		return b.isProbablePrime(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int q = sc.nextInt();
		int q = 100;
		for(int i = 0; i < q; i++) {
		int t = sc.nextInt();
		System.out.println(prime(t));
		sc.close();
		}
	}

}
