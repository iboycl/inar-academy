import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        // string eğer rakam varsa stringden sonraki karakteri o rakam kadar yazacak
        // a2pp3le
        // yeni string pplll

        // apple a2ple true
        // appple a3ple true
        // apple a3ple false
        // apple banana false


        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){

                int number = Integer.parseInt(str.charAt(i) + "");

                for (int j = 0; j < number; j++) {
                    newStr += str.charAt(i + 1);
                }
            }

        }
        System.out.println(newStr);
    }
}
