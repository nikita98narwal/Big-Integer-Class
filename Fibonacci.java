package Mathematics;

import java.util.*;
import java.math.*;

public class Fibonacci {
	static BigInteger fib(int n) {
		BigInteger a = BigInteger.valueOf(0); 
        BigInteger b = BigInteger.valueOf(1); 
        BigInteger c = BigInteger.valueOf(1); 
		for(int j =2; j <= n; j++) {
			c = a.add(b);
			a = b;
			b = c;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		System.out.println(fib(q));
		sc.close();
	}
}


//class fibonacci 
//{ 
//    static int fib(int n) 
//    { 
//    if (n <= 1) 
//       return n; 
//    return fib(n-1) + fib(n-2); 
//    } 
//       
//    public static void main (String args[]) 
//    { 
//    int n = 9; 
//    System.out.println(fib(n)); 
//    } 
//} 

