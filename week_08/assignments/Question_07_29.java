public class Question_07_29 {
    public static void main(String[] args) {

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int[] picks = new int[4];
        int sum = 0;

        while (sum != 24){
            sum = 0;
            for (int i = 0; i < 4; i++) {
                int pick = (int) (Math.random() * 52);
                sum += pick % 13;
                picks[i] = pick % 13;
            }

        }
        /*for (int i = 0; i < picks.length; i++) {
            int pick = (int) (Math.random() * 52);
            sum += pick % 13;

            boolean check = true;

            if (sum > 24){
                int max = 0;
                int maxIndex = 0;
                for (int j = 0; j < picks.length; j++) {
                    if(picks[j] > max) {
                        max = picks[j];
                        maxIndex = j;
                        sum -= max;
                    }
                }
                pick = (int) (Math.random() * 52);
                picks[maxIndex] = pick / 13 + pick % 13;
                check = false;
            }

            if (check)  picks[i] = pick / 13 + pick % 13;
        }*/

        System.out.print("Picks that yields the sum of 24: ");

        for (int e:picks) {
            System.out.print(e + " ");
        }
    }
}
