public class Main {
    public static void main(String[] args) {
        // Create an object of NumberPrinter class
        NumberPrinter printer = new NumberPrinter();

        // Call first function (addNumbers)
        System.out.println("Calling function addNumbers with arguments 4 and 5. Expected output: 9.");
        printer.addNumbers(4, 5);  // 4 + 5 = 9

        // Call second function (multiplyNumbers)
        System.out.println("Calling function multiplyNumbers with arguments 4 and 5. Expected output: 20.");
        printer.multiplyNumbers(4, 5);  // 4 * 5 = 20

        // Call third function (divideNumbers)
        System.out.println("Calling function divideNumbers with arguments 10 and 2. Expected output: 5.");
        printer.divideNumbers(10, 2);  // 10 / 2 = 5

        // Call fourth function (divideNumbers with divide by zero)
        System.out.println("Calling function divideNumbers with arguments 10 and 0. Expected output: Error: Division by zero.");
        printer.divideNumbers(10, 0);  // 10 / 0 = Error (division by zero)

        // Call fifth function (subtractNumbers)
        System.out.println("Calling function subtractNumbers with arguments 10 and 4. Expected output: 6.");
        printer.subtractNumbers(10, 4);  // 10 - 4 = 6
    }
}

class NumberPrinter {

    // Method to add two numbers
    public void addNumbers(int a, int b) {
        int result = a + b;
        System.out.println("Result: " + result);
    }

    // Method to multiply two numbers
    public void multiplyNumbers(int a, int b) {
        int result = a * b;
        System.out.println("Result: " + result);
    }

    // Method to divide two numbers
    public void divideNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
    }

    // Method to subtract two numbers
    public void subtractNumbers(int a, int b) {
        int result = a - b;
        System.out.println("Result: " + result);
    }
}
