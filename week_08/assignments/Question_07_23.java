public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int i = 1; i <= 100; i++) {
            for (int j = i -1 ; j < 100; j+= i) {
                if (lockers[j]) {
                    lockers[j] =  false;
                }
                else lockers[j] = true;
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]){
                System.out.print("L" + (i + 1) + " ");
            }
        }

    }

}
