
public class Main {
    public static void main(String[] args) {
        Calc Calculator = new Calc(5);
        Calculator.inputExpression("5 6 + 4 * 54 +");
        Calculator.printAnswer();
        Calculator = new Calc(5);
        Calculator.inputExpression("221 37 * 4 54 * +");
        Calculator.printAnswer();
        Calculator = new Calc(5);
        Calculator.inputExpression("12 3 34 5 26 * + - /");
        Calculator.printAnswer();
    }
}