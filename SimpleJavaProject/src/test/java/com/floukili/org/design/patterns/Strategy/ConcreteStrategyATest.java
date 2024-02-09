package com.floukili.org.design.patterns.Strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class ConcreteStrategyATest {

    @Test
    public void testExecute() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        strategyA.execute();
        
        String expectedOutput = "Executing ConcreteStrategyA\nSorted array: 1 2 5 7 8 \n";
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);
    }
}
