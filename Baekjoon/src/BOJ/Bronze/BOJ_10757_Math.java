package BOJ.Bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_10757_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());

		A = A.add(B);
		sc.close();
		System.out.println(A);
	}
}
