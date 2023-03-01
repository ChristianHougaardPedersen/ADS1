package via.ads1.model;

public class Operand implements Token {

    private final int value;

    public Operand(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
