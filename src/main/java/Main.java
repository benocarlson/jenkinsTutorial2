public class Main {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Must have command line arguments");
        }

        String function = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = 0;
        if (args.length > 2) {
            num2 = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();

        if (function.equals("add")) {
            System.out.println(calculator.add(num1, num2));
        } else if (function.equals("subtract")) {
            System.out.println(calculator.subtract(num1, num2));
        } else if (function.equals("multiply")) {
            System.out.println(calculator.multiply(num1, num2));
        } else if (function.equals("divide")) {
            System.out.println(calculator.divide(num1, num2));
        } else if (function.equals("binary")) {
            System.out.println(calculator.intToBinaryNumber(num1));
        } else if (function.equals("fibonacci")) {
            System.out.println(calculator.fibonacciNumberFinder(num1));
        }
    }
}
