package training.java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;

class CalculateExample {
    public CalculateExample() {
    }

    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        BiFunction<Integer, Integer, Integer> add_1 =
                (a, b) -> a + b;

        CalculateExample calc = new CalculateExample();
        calc.run(2, 2, addition);
        calc.run(5, 1, subtraction);
        calc.run(3, 4, multiplication);
        calc.run(16, 2, division);

        calc.run(2, 2, add_1);

        Consumer<String> en_name = a -> System.out.println("Hello " + a);
        Consumer<String> pl_name = a -> System.out.println("Cześć " + a);
        calc.greet("Hose", pl_name);
        calc.greet("Hose", en_name);
    }

    private void run(int val1, int val2,
                     MathOperation operation) {
        int result = operation.operation(val1, val2);
        System.out.println("Result: " + result);
    }

    private void run(int val1, int val2,
                     BiFunction<Integer, Integer, Integer>
                             operation) {
        int result = operation.apply(val1, val2);
        System.out.println("Result: " + result);
    }

    private void greet(String name, Consumer<String> lang) {
        lang.accept(name);
    }

}


@FunctionalInterface
interface MathOperation {
    int operation(int i, int k);
}