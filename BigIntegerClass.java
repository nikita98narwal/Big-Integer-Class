package Mathematics;

import java.util.*;
import java.math.BigInteger;

public class BigIntegerClass {
	 static BigInteger factorial(int N){
		 BigInteger f = new BigInteger("1");
		 for(int i = 2; i <= N; i++) {
			 f = f.multiply(BigInteger.valueOf(i));
		 }
		return f;
	}
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 System.out.println(factorial(N));
		 sc.close();
	 }

}
