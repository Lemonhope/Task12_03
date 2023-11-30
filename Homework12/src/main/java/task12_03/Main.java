package task12_03;
@FunctionalInterface
interface MathOperation {
    double operation(double number1, double number2);
}

public class Main {

    public static double add(double number1, double number2){
        MathOperation add= (num1, num2) -> num1 + num2;
        return add.operation(number1, number2);
    }
    public static double subtract(double number1, double number2){
        MathOperation sub= (num1, num2) -> num1 - num2;
        return sub.operation(number1, number2);
    }
    public static double multiply(double number1, double number2){
        MathOperation mul= (num1, num2) -> num1 * num2;
        return mul.operation(number1, number2);
    }
    public static double divide(double number1, double number2){
        MathOperation div= (num1, num2) -> num1 / num2;
        return div.operation(number1, number2);
    }
    public static double pow(double number1, double number2){
        MathOperation pow= (num1, num2) -> Math.pow(num1,  num2);
        return pow.operation(number1, number2);
    }
    public static double sqrt(double number1){
        MathOperation sqrt= (num, num2) -> Math.sqrt(num);
        return sqrt.operation(number1, 0);
    }

    public static void main(String[] args) {
        double a=66, b=6;
        System.out.println("a+b = "+add(a, b));
        System.out.println("a-b = "+subtract(a, b));
        System.out.println("a*b = "+multiply(a, b));
        System.out.println("a/b = "+divide(a, b));
        System.out.println("a^b = "+pow(a, b));
        System.out.println("sqrt(a) = "+sqrt(a));
    }
}
