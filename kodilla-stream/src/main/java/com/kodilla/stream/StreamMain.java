package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //Task 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String example1 = poemBeautifier.beautify("To jest przyklad", (text) -> text.toUpperCase() );
        String example2 = poemBeautifier.beautify("To jest test", (text) -> text + "ABC" );
        String example3 = poemBeautifier.beautify("To jest dla zadania", (text) -> "ABC" + text );
        String example4 = poemBeautifier.beautify("TO JEST PRZYKLAD", (text) -> text.toLowerCase() );
        String example5 = poemBeautifier.beautify("To jest przypadek testowy", (text) -> text.toUpperCase() + "/CBA/123" );

        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
        System.out.println(example4);
        System.out.println(example5);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
