package assignments.question_12_08;

public class HexFormatException extends Exception{

    private String hexNumber;

    public HexFormatException(String hexNumber){
        super("It's not a hex string.!");
        this.hexNumber = hexNumber;
    }

    public String getHexNumber() {
        return hexNumber;
    }
}
