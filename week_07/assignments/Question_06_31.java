import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as an integer: ");
        long number = input.nextLong();
        String num = Long.toString(number);
        System.out.println(number + " is " + (isValid(num) ? "" : "not ") + "valid");
    }
    
    
    public static boolean isValid(String num){
        int pre = getPrefix(num);
        boolean prefix = pre == 4 || pre == 5 || pre == 6 || pre == 37;
        boolean size = getSize(num) >= 13 || getSize(num) <= 16;
        boolean sum = (sumOfDoubleEvenPlace(num) + sumOfOddPlace(num)) % 10 == 0;
        return prefix && size && sum;
    }

    public static int sumOfDoubleEvenPlace(String num){
        int even = 0;
        for (int i = num.length() - 2; i >= 0; i-=2) {
            even += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }

        return even;
    }

    public static int sumOfOddPlace(String num){
        int odd = 0;
        for (int i = num.length() - 1; i >= 0; i-=2) {
            odd += Integer.parseInt(num.charAt(i) + "");
        }

        return odd;
    }


    public static int getDigit(int number){
        int num = number;
        if (num > 9){
            num = num % 10 + num / 10;
        }
        return num;
    }


    public static int getSize(String num){
        return num.length();
    }

    public static int getPrefix(String num){
        int prefix = 0;
        if (num.charAt(0) == '4'){
            prefix = 4;
        } else if (num.charAt(0) == '5') {
            prefix = 5;
        } else if (num.charAt(0) == '6') {
            prefix = 6;
        } else if (num.charAt(0) == '3' && num.charAt(1) == '7') {
            prefix = 37;
        }
        return prefix;
    }

}
