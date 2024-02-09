package com.floukili.org.design.patterns.Strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class ConcreteStrategyBTest {

    @Test
    public void testExecute() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        strategyB.execute();

        String expectedOutput = "Executing ConcreteStrategyB\nConcreteStrategyB\n";
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);
    }
}
