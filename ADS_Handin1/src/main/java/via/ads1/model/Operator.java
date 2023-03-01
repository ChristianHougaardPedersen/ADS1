package via.ads1.model;

public class Operator implements Token{

    private  char value;

    public Operator(char value) {
        setValue(value);
    }

    @Override
    public Character getValue() {
        return value;
    }

    private void setValue(char value) {
        if (value == '+' || value == '-' || value == '*' || value == '/') this.value = value;
        else throw new ArithmeticException("Invalid operator.");
    }
}
