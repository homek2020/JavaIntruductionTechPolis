package ru.vgerasimov.task1;

import java.util.Scanner;

public class FizzBuzzImplement implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
        }
    }

}
