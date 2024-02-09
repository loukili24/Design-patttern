package com.floukili.org.design.patterns.simple.example;

import com.floukili.org.design.patterns.simple.example.Singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 

public class SingletonTest{
	
	public void testSingletonInstance() {
		
		 Singleton instance1 = Singleton.getInstance();
	     Singleton instance2 = Singleton.getInstance();
	     
	     assertSame(instance1, instance2);
	}
}