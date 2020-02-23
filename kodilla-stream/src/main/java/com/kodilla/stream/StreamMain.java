package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.objects.NativeString;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {

// MODULE 7.1

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

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("exercise number 7.1", text -> "WHOA! " + text);
//        poemBeautifier.beautify("exercise number 7.1", NativeString::toUpperCase);
//        poemBeautifier.beautify("exercise number 7.1", StreamMain::myMethod);
//        poemBeautifier.beautify("exercise number 7.1", text -> {
//            String s = text.concat(" is done!");
//            s = s + " Ok";
//            return s;
//        });

// MODULE 7.2

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//    }

// additional to MODULE 7.1

//    public static String myMethod(String text) {
//        String s = text.replace("e","3");
//        s = s.replace("r","R");
//        return s;

// MODULE 7.3

//        People.getList().stream()
//                .map(s -> s.toUpperCase())          // .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);      // .forEach(s -> System.out.println(s));

//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);

// MODULE 7.3 - exercise

        Forum theListOfUsers = new Forum();
        Map<Integer, ForumUser> theResult = theListOfUsers.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getBirthDate(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getPostsNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        theResult.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}