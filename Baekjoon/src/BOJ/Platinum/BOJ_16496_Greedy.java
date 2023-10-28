package BOJ.Platinum;

import java.util.Arrays;
import java.util.Comparator;

public class BOJ_16496_Greedy {
	 public static void main(String[] args) {
		 System.out.println(solution(5, new String[] {"3","30","34","5","9"}));
		 System.out.println(solution(5, new String[] {"0","0","0","0","1"}));
    }
	 public static String solution(int n, String[] arr) {
		 if(arr[0].equals("0")) return "0";
		 StringBuilder sb = new StringBuilder();
		 Arrays.sort(arr, new Comparator<String>() {
	            @Override
	            public int compare(String num1, String num2) {
	                String s1 = num1 + num2;
	                String s2 = num2 + num1;
	                return s2.compareTo(s1);
	            }
	        });
		 for (String s : arr) sb.append(s);
		 return sb.toString();
	 }
}
