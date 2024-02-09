package com.floukili.org.design.patterns.Strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class ContextTest {

    @Test
    public void testExecuteStrategy() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        Context context = new Context(strategyA);

        context.executeStrategy();
        String expectedOutputA = "Executing ConcreteStrategyA\nSorted array: 1 2 5 7 8 \n";
        assertEquals(expectedOutputA, outContent.toString());

        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);

        outContent.reset(); // Reset the content for the next capture
        context.executeStrategy();
        String expectedOutputB = "Executing ConcreteStrategyB\nConcreteStrategyB\n";
        assertEquals(expectedOutputB, outContent.toString());

        System.setOut(System.out);
    }
}
