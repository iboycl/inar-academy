public class Question_05_27 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 101; i < 2100; i++) {
            boolean isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
            if (isLeapYear){
                count++;
                if (count %10 == 0){
                    System.out.printf("%-4d\n",i);
                } else {
                    System.out.printf("%-4d ",i);
                }
            }
        }
    }
}
