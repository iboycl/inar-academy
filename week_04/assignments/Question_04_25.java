public class Question_04_25 {
    public static void main(String[] args) {
        char a = (char) ((Math.random() * 10) + 48);
        char b = (char) ((Math.random() * 10) + 48);
        char c = (char) ((Math.random() * 26) + 65);
        char d = (char) ((Math.random() * 26) + 65);
        char e = (char) ((Math.random() * 26) + 65);
        char f = (char) ((Math.random() * 10) + 48);
        char g = (char) ((Math.random() * 10) + 48);
        char h = (char) ((Math.random() * 10) + 48);


        System.out.printf("%s%s %s%s%s %s%s%s", a,b,c,d,e,f,g,h);
    }

}
