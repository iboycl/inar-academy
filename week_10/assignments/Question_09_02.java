package week_10.assignments;

public class Question_09_02 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.previousClosingPrice = 34.5;
        stock1.currentPrice = 34.35;

        System.out.println("Stock name : " + stock1.name + "\n" +
                "Stock symbol : " + stock1.symbol + "\n" +
                "Price-change percentage : " + stock1.getChangePercent());
    }
}
