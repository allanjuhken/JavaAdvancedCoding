package task2;

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Calculator(){}

    public double getAddition(double num1, double num2) {
        MathOperation addition = (x, y) -> x+y;
        return addition.operate(num1,num2);
    }

    public double getSubtraction(double num1, double num2) {
        MathOperation subtraction= (x,y) -> x-y;
        return subtraction.operate(num1,num2);
    }

    public double getMultiplication(double num1, double num2) {
        MathOperation multiplication = (x,y) -> x*y;
        return multiplication.operate(num1,num2);
    }

    public float getDivision(double num1,double num2) throws MathErrorException {
        if (num2 == 0){
            String message = "cannot divide by zero";
            throw new MathErrorException(message);
        }
        MathOperation division = (x,y) -> x/y;
        return (float) division.operate(num1,num2);
    }
}
