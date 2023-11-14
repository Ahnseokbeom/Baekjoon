package BOJ.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2490_Math {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++) {
			int[] arr = new int[4];
			for(int j = 0;j<4;j++) arr[j] = sc.nextInt();
			int sum = (int) Arrays.stream(arr).filter(num -> num==0).count();
			System.out.println(solution(sum));
		}
		sc.close();
	}
	public static String solution(int sum) {
		return sum==0?"E":sum==1?"A":sum==2?"B":sum==3?"C":"D";
	}
}
