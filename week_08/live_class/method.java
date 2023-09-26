import java.util.Scanner;

public class method {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            //input = "aaabcccccaaa"
            //Compressed string: a2b1c5a3

            String str = input.nextLine();
            System.out.println(compression(str));
    }

    public static String compression (String str){
        int count = 1;
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                newString += str.charAt(i) + "" + count;
                count = 1;
            }
        }
        return newString;
    }

}
