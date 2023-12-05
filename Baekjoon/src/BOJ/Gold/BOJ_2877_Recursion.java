package BOJ.Gold;

public class BOJ_2877_Recursion {
	public static void main(String[] args) {
		System.out.println(findKthNumber(1));
		System.out.println(findKthNumber(2));
		System.out.println(findKthNumber(3));
		System.out.println(findKthNumber(4));
		System.out.println(findKthNumber(5));
		System.out.println(findKthNumber(6));

    }
    public static String findKthNumber(int k) {
        StringBuilder result = new StringBuilder();
        while (k > 0) {
            if (k % 2 == 1) {
                result.insert(0, '4');
            } else {
                result.insert(0, '7');
            }
            k = (k - 1) / 2;
        }
        return result.toString();
    }
}
