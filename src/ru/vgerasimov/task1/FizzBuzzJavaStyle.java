package ru.vgerasimov.task1;

import java.util.stream.IntStream;

public class FizzBuzzJavaStyle implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        IntStream.rangeClosed(from, to).mapToObj(i -> i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" :
                (i % 3 == 0 ? "Fizz" : (i % 5 == 0 ? "Buzz" : i) ) ).forEach(System.out::print);
    }
}
