package calculator;
import java.lang.*;
public class Calculate  implements Calculation{

    public int addition(String number1, String number2) {
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        return num1 + num2;
    }
    public int subtraction(String number1, String number2) {
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        return num1 - num2;
    }
    public int multiplication(String number1, String number2) {
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        return num1 * num2;
    }
    public int division(String number1, String number2) {
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        return num1 / num2;
    }
}
