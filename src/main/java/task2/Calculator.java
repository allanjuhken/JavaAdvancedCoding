package task2;

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    MathOperation addition = (x, y) -> x+y;
    MathOperation subtraction = (x,y) -> x-y;
    MathOperation multiplication = (x,y) -> x*y;
    MathOperation division = (x,y) -> x/y;

    public MathOperation getAddition() {
        doOperation(num1,num2, addition);
        return addition;
    }

    public MathOperation getSubtraction() {
        doOperation(num1, num2, subtraction);
        return subtraction;
    }

    public MathOperation getMultiplication() {
        doOperation(num1,num2, multiplication);
        return multiplication;
    }

    public MathOperation getDivision() throws MathErrorException {
        if (num2 == 0){
            String message = "cannot divide by zero";
            throw new MathErrorException(message);
        }
        return division;
    }

    private static double doOperation(double num1, double num2, MathOperation operation){
        return operation.operate(num1,num2);
    }


}
