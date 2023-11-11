package week_11.assignments.question_10_8;

public class Tax {
    public int income;
    public int fillingStatus;
    private final double[] RATES = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

    private final int[][] BRACKETS = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 208850, 372950}, // Married jointly or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
    };

    Tax(){}

    Tax(int income, int status){
        this.income = income;
        this.fillingStatus = status;
    }

    public double getTax(){
        int level = 0;

        for (int i = 0; i < 5; i++) {
            if (income > BRACKETS[fillingStatus][i]){
                level++;
            }
        }

        return switch (level){
            case 0 -> income * RATES[0];
            case 1 -> (income - BRACKETS[fillingStatus][level - 1]) * RATES[1] +  BRACKETS[fillingStatus][0] * RATES[0];
            case 2 -> (income - BRACKETS[fillingStatus][level - 1]) * RATES[2] +
                    (BRACKETS[fillingStatus][1] - BRACKETS[fillingStatus][0]) * RATES[1] +  BRACKETS[fillingStatus][0] * RATES[0];
            case 3 -> (income - BRACKETS[fillingStatus][level - 1]) * RATES[3] +
                    (BRACKETS[fillingStatus][2] - BRACKETS[fillingStatus][1]) * RATES[2] + (BRACKETS[fillingStatus][1] - BRACKETS[fillingStatus][0]) * RATES[1] +
                    BRACKETS[fillingStatus][0] * RATES[0];
            case 4 -> (income - BRACKETS[fillingStatus][level - 1]) * RATES[4] + (BRACKETS[fillingStatus][3] - BRACKETS[fillingStatus][2]) * RATES[3] +
                    (BRACKETS[fillingStatus][2] - BRACKETS[fillingStatus][1]) * RATES[2] +  (BRACKETS[fillingStatus][1] - BRACKETS[fillingStatus][0]) * RATES[1] +
                    BRACKETS[fillingStatus][0] * RATES[0];
            case 5 -> (income - BRACKETS[fillingStatus][level - 1]) * RATES[5] +  (BRACKETS[fillingStatus][4] - BRACKETS[fillingStatus][3]) * RATES[4] +
                    (BRACKETS[fillingStatus][3] - BRACKETS[fillingStatus][2]) * RATES[3] +  (BRACKETS[fillingStatus][2] - BRACKETS[fillingStatus][1]) * RATES[2] +
                    (BRACKETS[fillingStatus][1] - BRACKETS[fillingStatus][0]) * RATES[1] +  BRACKETS[fillingStatus][0] * RATES[0];
            default -> throw new IllegalStateException("Unexpected value: " + level);
        };
    }

}
