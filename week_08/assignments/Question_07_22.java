import java.util.Arrays;

public class Question_07_22 {
    public static void main(String[] args) {
        // can't be equal, one more and one less
        int[] board = new int[8];
        Arrays.fill(board, 9);
        int queen = (int)(Math.random() * 8);
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            count = 0;
            board[i] = queen;
            if (i == 7) break; // if the last one assigned no need to check again.

            queen = (queen + ((int)(Math.random() * 6) + 2)) % 8;
            for (int j = 0; j <= i; j++) {
                if (board[j] == queen || queen == board[j] + i + 1 - j || queen == board[j] - i - 1 + j){
                    queen = (queen + 1) % 8;
                    count++;
                    j = -1;
                }
                if (count == 7){
                    i = -1;
                    Arrays.fill(board, 9);
                    queen = (int)(Math.random() * 8);
                    board[0] = queen;
                    break;
                }
            }
        }


        System.out.println(" |A|B|C|D|E|F|G|H|");
        for (int i = 0; i < board.length; i++) {
            System.out.print((char)('A' + i) + "|");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[j] == i ? "Q|" : " |");
            }
            System.out.println();
        }
    }
}
