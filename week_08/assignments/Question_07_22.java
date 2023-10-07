public class Question_07_22 {
    public static void main(String[] args) {
        // can't be equal, one more and one less
        int[] board = new int[8];
        int queen = 0;

        for (int i = 0; i < board.length; i++) {
            board[i] = queen;
            queen = (queen + 2) % 8;
            for (int j = 0; j <= i; j++) {
                if (board[j] == queen){
                    queen = (queen + 1) % 7;
                    j = 0;
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
