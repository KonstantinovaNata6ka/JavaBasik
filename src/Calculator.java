//

public class Calculator {

    double numA = 0;
    double numB = 0;

    static void calc(double a, double b) {

        double result = a + b;

        System.out.println(result);

    }

    static double anotherCalc(double a, double b) {

        System.out.println(a + b);

        return a + b;

    }

    static double globalResult = anotherCalc(21, 4);


    static void calcIfElse(double numA, double numB, char operation) {
        double result = 0;
        if (operation == '+') {
            result = numA + numB;
        } else if (operation == '-') {
            result = numA - numB;
        } else if (operation == '*') {
            result = numA * numB;
        } else if (operation == '/') {
            result = numA / numB;
        } else {
            System.out.println("Try again");
            return;
        }
        System.out.println("result:" + result);
    }

    static void calcSwitch(double numA, double numB, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            default:
                System.out.println("Try again");
                return;
        }
        System.out.println("result:" + result);
    }

    public static void main(String[] args) {

        calcSwitch(15, 20, '+');
        calcSwitch(15, 20, '-');
        calcSwitch(15, 20, '*');
        calcSwitch(15, 20, '/');
        calcSwitch(15, 20, '$');

        calcIfElse(17, 20, '+');
        calcIfElse(17, 20, '-');
        calcIfElse(17, 20, '*');
        calcIfElse(17, 20, '/');
        calcIfElse(17, 20, '$');
    }
}