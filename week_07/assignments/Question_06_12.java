public class Question_06_12 {
    public static void main(String[] args) {
        printChars('1','Z',10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        System.out.printf("Characters from %s to %s, %d per line\n", ch1, ch2, numberPerLine);
        int count = 0;
        for (int i = ch1; i <= ch2; i++) {
            count++;
            System.out.printf(count % numberPerLine == 0 ? "%s\n" : "%s ", (char)(i));
        }
    }
}
