import java.util.Scanner;

public class findTheLeastExpensive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance and price of  GYM1:");

        int gym1Dis = input.nextInt();
        int gym1Price = input.nextInt();

        System.out.println("Enter the distance and price of  GYM2:");
        int gym2Dis = input.nextInt();
        int gym2Price = input.nextInt();

        System.out.println("Enter the distance and price of  GYM3:");
        int gym3Dis = input.nextInt();
        int gym3Price = input.nextInt();

        double gym1 = Math.abs(gym1Dis) * 0.50 + gym1Price;
        double gym2 = Math.abs(gym2Dis) * 0.50 + gym2Price;
        double gym3 = Math.abs(gym3Dis) * 0.50 + gym3Price;

        double theBest = Math.min(Math.min(gym1, gym2), gym3);

        String theBestGym;

        if(gym1 == theBest){
            theBestGym = "GYM1";
        } else if (gym2 == theBest) {
            theBestGym = "GYM2";
        } else {
            theBestGym = "GYM3";
        }

        int closest = Math.min(Math.min(Math.abs(gym1Dis),Math.abs(gym2Dis)), Math.abs(gym3Dis));

        String closestGym;

        if(Math.abs(gym1Dis) == closest){
            closestGym = "GYM1";
        } else if (Math.abs(gym2Dis) == closest) {
            closestGym = "GYM2";
        } else {
            closestGym = "GYM3";
        }
        System.out.println("The closest gym is " + closestGym + " but the most cost effective one is " + theBestGym);
    }
}
