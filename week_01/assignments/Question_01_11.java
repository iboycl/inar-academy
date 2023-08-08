package week_01.assignments;

public class Question_01_11 {
    public static void main(String[] args){
        double curpop = 312032486;
        int yearsec = 365 * 24 * 60 * 60;
        double yearinc = yearsec / 7.0 - yearsec / 13.0 + yearsec / 45.0;
        System.out.println(
                "Population projection" + "\n" +
                "Current population: " + 312032486 + "\n" +
                "One birth every 7 seconds" + "\n" +
                "One death every 13 seconds" + "\n" +
                "One new immigrant every 45 seconds" + "\n" +
                "Yearly Population projection formula:" + "\n" +
                "Current population + ((births per year)" + "\n" +
                "                   - (deaths per year)" + "\n" +
                "                   + (new immigrants per year))"

        );
        for (int i = 1; i <= 5; i++){
            System.out.println("Year " + i + " projection:");
            System.out.println(curpop += yearinc);
        }

    }
}
