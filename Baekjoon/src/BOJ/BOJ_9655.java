package BOJ;

import java.util.Scanner;

public class BOJ_9655 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(stone(sc.nextInt())) System.out.println("SK");
		else System.out.println("CY");
		sc.close();
	}
	public static boolean stone(int n) {
		if(n%2==0) return false;
		return true;
	}

}
