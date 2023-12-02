package assignments.question_12_09;

public class BinaryFormatException extends Exception{
    private String binNumber;

    public BinaryFormatException(String binNumber){
        super("It's not a binary string.!");
        this.binNumber = binNumber;
    }

    public String getHexNumber() {
        return binNumber;
    }
}
