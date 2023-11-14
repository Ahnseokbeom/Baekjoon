package BOJ.Silver;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class BOJ_10867_TreeSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 0;i<n;i++) {
			set.add(sc.nextInt());
		}
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		sc.close();
	}
}
