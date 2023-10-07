public class Question_06_30 {
    public static void main(String[] args) {
        gameCraps();
    }

    public static void gameCraps(){
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int sum = dice1 + dice2;

        System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, sum);

        if (sum == 2 || sum == 3 || sum == 12){
            System.out.println("You lose!");
        } else if (sum == 7 || sum == 11){
            System.out.println("You win!");
        } else {
            System.out.println("Point is " + sum);

            int sum2 = 0;
            do {
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;
                sum2 = dice1 + dice2;
            } while (sum2 != sum && sum2 != 7);

            System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, sum2);
            if (sum == sum2){
                System.out.println("You win!");
            } else
                System.out.println("You lose!");
        }



    }
}
