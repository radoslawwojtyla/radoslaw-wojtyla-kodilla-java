package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {

        // MODULE 7.1 - bootcamp
//        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text.");
//        processor.execute(codeToExecute);

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
////
////        System.out.println("Calculating expressions with lambdas");
////        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
////        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
////        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
////        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
////
////        System.out.println("Calculating expressions with method references");
////        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
////        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
////        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
////        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        // MODULE 7.1 - exercise
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("exercise number 7.1", text -> "WHOA! " + text);
        poemBeautifier.beautify("exercise number 7.1", text -> toUpperCase(text));
        poemBeautifier.beautify("exercise number 7.1", text -> text.replace("e","3"));
        poemBeautifier.beautify("exercise number 7.1", text -> text.concat(" is done!"));;
    }
}