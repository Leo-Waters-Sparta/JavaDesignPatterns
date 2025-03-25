package com.ljw.dp.behaviour.strategy;

public class Client {
    public static void main(String[] args) {
        lowercaseStrategy lower = new lowercaseStrategy();
        UppercaseStrategy upper = new UppercaseStrategy();
        RandomCaseStrategy random = new RandomCaseStrategy();

        String input = "BOB is A Magic POTATO";

        Executor executor = new Executor(lower);

        executor.printString(input);

        executor.setStrategy(upper);
        executor.printString(input);

        executor.setStrategy(random);
        executor.printString(input);
    }
}
