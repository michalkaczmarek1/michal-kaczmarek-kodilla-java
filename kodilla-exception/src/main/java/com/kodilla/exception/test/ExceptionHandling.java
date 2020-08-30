package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.propablyIWillThrowException(1.5 , 2.3);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Entered wrong number");
        } finally {
            System.out.println("Remember always to enter properly number");
        }
    }

}
