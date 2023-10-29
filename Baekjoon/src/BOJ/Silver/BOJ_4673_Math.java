package BOJ.Silver;

public class BOJ_4673_Math {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		for(int i = 1;i<10001;i++) {
			int n = selfNumber(i);
			if(n < 10001) check[n] = true;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<10001;i++) {
			if(!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);

	}
	public static int selfNumber(int n) {
		int sum = n;
		while(n!=0) {
			sum = sum + (n%10);
			n = n/10;
		}
		return sum;
	}
}
