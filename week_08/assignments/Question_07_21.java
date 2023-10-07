import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        //Kullanıcıdan girdileri main method içinde al
        //Main method içinde diğer metodları çağır
        // Olasılıkları hesaplamak ve ekrana yazdırmak için metod yaz
        //Slotları doğru  mantıkla oluşturmak için metod yaz
        // Slotları çizmek için bir metod yaz
        // Array --> array[SLOT_SAYISI]
        // Get number of balls as input from the user
        // Drop the balls in a loop to calculate
        // Calculate if the dropped ball is "Left or   Right"
        // Store the calculated way in a String and store the string in an array
        // Calculate the indexes of the dropped balls by counting the LRLRLRLR
        // Draw the bean machine
        // {1 , 0 , 4 , 3, 2 , 1 , 0}
        // for  max dönecek (int i = max  ----- i --
        // array kadar dönecek

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of balls: ");
        int numberOfBalls = input.nextInt();
        System.out.println("Please enter the number of slots: ");
        int numberOfSlots = input.nextInt();

        String[] droppings = new String[numberOfBalls];

        for (int i = 0; i < numberOfBalls; i++) {
            droppings[i] = dropTheBall(numberOfSlots);
            System.out.println(droppings[i]);
        }

        int[] slotArray = fillTheSlots(droppings, numberOfSlots);

        drawTheMachine(numberOfBalls, slotArray);

    }

    private static int[] fillTheSlots(String[] droppings, int numberOfSlots) {
        int[] slotArray = new int[numberOfSlots];
        for (int i = 0; i < droppings.length; i++) {
            int index = 0;
            for (int j = 0; j < droppings[i].length(); j++) {
                if (droppings[i].charAt(j) == 'R') {
                    index++;
                }
            }
            slotArray[index]++;
        }
        return slotArray;
    }

    private static String dropTheBall(int numberOfSlots) {
        String dropping = "";
        for (int i = 0; i < numberOfSlots - 1; i++) {
            int random = (int) (Math.random() * 2);
            if (random == 0) {
                dropping += "R";
            } else {
                dropping += "L";
            }
        }
        return dropping;
    }
    // {1 , 0 , 4 , 3, 2 , 1 , 0}
    public static void drawTheMachine(int numberOfBalls , int[] slotArray){
        for (int i = numberOfBalls; i > 0; i--) {
            for (int j = 0; j < slotArray.length; j++) {
                if (slotArray[j] >= i) {
                    System.out.print("O");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }
}
