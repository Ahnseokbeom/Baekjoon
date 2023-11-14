package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1924_Math {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int sum = 0;

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i=1; i<=12; i++) {
            if(i==x) break;
            sum += months[i];
        }
        sum += y;
        int day = sum%7;
       System.out.println(solution(day));
	}
	public static String solution(int day) {
		return day==0?"SUN":day==1?"MON":day==2?"TUE":day==3?"WED":day==4?"THU":day==5?"FRI":"SAT";
	}
}
