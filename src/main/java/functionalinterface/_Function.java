package functionalinterface;

import java.util.function.Function;

/**
 * @FunctionalInterface
 * public interface Function<T,​R>
 * Represents a function that accepts one argument and produces a result.
 */

public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOne(2);
        System.out.println(increment);

        System.out.println("Functional style way");
        Integer increment2 = incrementeByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyByTen.apply(increment2);
        System.out.println(multiply);

        System.out.println("Better way");
        Function<Integer, Integer> incrementBy1AndThenMutiplyBy10 =
                incrementeByOneFunction.andThen(multiplyByTen);

        System.out.println(incrementBy1AndThenMutiplyBy10.apply(1));


    }

    static Function<Integer, Integer> incrementeByOneFunction = number -> number+1;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;


    static int incrementByOne(int number){
        return number+1;
    }
}
