package BOJ.Bronze;

import java.util.Scanner;

public class BOJ_10809_Implementation {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);

		String s = sc.next();

		for(char c = 'a';c<='z';c++) {
			System.out.print(s.indexOf(c)+" ");
		}
		sc.close();
	}
}
