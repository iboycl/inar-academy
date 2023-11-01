package week_10.assignments;

//UML Class Diagram
/**************************************************
 *               Stock                         *
 * ------------------------------------------------*
 * symbol: String                                  *
 * name: String                                    *
 * previousClosingPrice : double                   *
 * currentPrice : double                           *
 * Stock(newSymbol: String, newName: String)       *
 * getChangePercent(): double                      *
 ***************************************************/

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;
    }

    double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 0.01;
    }
}
