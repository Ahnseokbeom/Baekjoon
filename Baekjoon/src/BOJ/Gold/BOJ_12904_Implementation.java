package BOJ.Gold;

import java.util.Scanner;

public class BOJ_12904_Implementation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        while (t.length() > s.length()) {
            char lastChar = t.charAt(t.length() - 1);
            if (lastChar == 'A') {
                t = t.substring(0, t.length() - 1);
            } else if (lastChar == 'B') {
                t = new StringBuilder(t.substring(0, t.length() - 1)).reverse().toString();
            }
        }
        sc.close();
        System.out.println(t.equals(s) ? 1 : 0);
    }
}
