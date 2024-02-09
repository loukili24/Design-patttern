package com.floukili.org.design.patterns.simple.example;

import com.floukili.org.design.patterns.simple.example.SimpleClass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleClassTest {

	@Test
	public void testAddtion() {

    	SimpleClass simpleClass= new SimpleClass();
        
		int additionResult = simpleClass.add(2,5);
		
	    assertEquals(14, additionResult);
		
		
	}


	
}


 
	