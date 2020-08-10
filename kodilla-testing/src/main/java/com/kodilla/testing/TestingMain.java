package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int a = 31;
        int b = 59;

        int resultAdd = a + b;
        int resultAddCalc = calculator.add(a, b);

        int resultSubtract = a - b;
        int resultSubCalc = calculator.subtract(a, b);

        if(resultAdd == resultAddCalc){
            System.out.println("Test add method OK! Result:" + resultAddCalc);
        } else {
            System.out.println("Test add method error!");
        }

        if(resultSubtract == resultSubCalc){
            System.out.println("Test subtract method OK! Result:" + resultSubCalc);
        } else {
            System.out.println("Test subtract method error!");
        }

    }
}