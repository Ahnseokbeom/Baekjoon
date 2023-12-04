package BOJ.Silver;
import java.util.Scanner;

public class BOJ_2578_Implementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] bingoBoard = new int[5][5];
        boolean[][] marked = new boolean[5][5];

        // 빙고판 초기화
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingoBoard[i][j] = scanner.nextInt();
            }
        }

        // 부른 수 기록
        int[] calledNumbers = new int[25];
        for (int i = 0; i < 25; i++) {
            calledNumbers[i] = scanner.nextInt();
        }

        // 빙고 게임 진행
        int callCount = 0;
        while (true) {
            int calledNumber = calledNumbers[callCount];
            callCount++;

            // 부른 수 찾기
            boolean found = false;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (bingoBoard[i][j] == calledNumber) {
                        marked[i][j] = true;
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            // 빙고 체크
            int bingoCount = checkBingo(marked);
            if (bingoCount >= 3) {
                System.out.println(callCount);
                break;
            }
        }
    }

    private static int checkBingo(boolean[][] marked) {
        int count = 0;

        // 가로 체크
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (!marked[i][j]) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                count++;
            }
        }

        // 세로 체크
        for (int j = 0; j < 5; j++) {
            boolean bingo = true;
            for (int i = 0; i < 5; i++) {
                if (!marked[i][j]) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                count++;
            }
        }

        // 대각선 체크
        boolean diagonalBingo1 = true;
        boolean diagonalBingo2 = true;
        for (int i = 0; i < 5; i++) {
            if (!marked[i][i]) {
                diagonalBingo1 = false;
            }
            if (!marked[i][4 - i]) {
                diagonalBingo2 = false;
            }
        }
        if (diagonalBingo1) {
            count++;
        }
        if (diagonalBingo2) {
            count++;
        }

        return count;
    }
}

