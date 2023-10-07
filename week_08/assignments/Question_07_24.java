public class Question_07_24 {
    public static void main(String[] args) {
        String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String[] shapes = {"Clubs", "Diamonds", "Hearts", "Spades"};

        int[] picks = new int[4];
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int pick = (int)(Math.random() * 52);
            boolean different = true;
            for (int j = 0; j < i; j++) {
                if (pick/13 == picks[j]/13){
                    i--;
                    different = false;
                    break;
                }
            }
            count++;
            if (different) picks[i] = pick;
        }


        for (int i = 0; i < 4; i++) {
            System.out.println(cards[picks[i] % 13] + " of " + shapes[picks[i] / 13]);
        }
        System.out.println("Number of picks: " + count);
    }
}
