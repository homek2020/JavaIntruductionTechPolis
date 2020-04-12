package ru.vgerasimov.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter From:");
        int from = input.nextInt();
        System.out.println("Enter To:");
        int to = input.nextInt();
        FizzBuzz flow1 = new FizzBuzzImplement();
        flow1.print(from, to);
        System.out.println("   ");
        FizzBuzz flow2 = new FizzBuzzJavaStyle();
        flow2.print(from, to);
    }
}
