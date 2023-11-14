package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2480_Math {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		System.out.println(dice(x,y,z));
	}
    public static int dice(int dice1, int dice2, int dice3) {
        if (dice1 == dice2 && dice2 == dice3) {
            return 10000 + (dice1 * 1000);
        } else if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
            int maxDice = Math.max(Math.max(dice1, dice2), dice3);
            return maxDice * 100;
        } else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
            int pair = (dice1 == dice2) ? dice1 : (dice2 == dice3) ? dice2 : dice1;
            return 1000 + (pair * 100);
        }
        return 0;
    }
}
