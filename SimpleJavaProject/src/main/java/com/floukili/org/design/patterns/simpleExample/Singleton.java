package com.floukili.org.design.patterns.simple.example;

 public class Singleton{
	 
	 private static Singleton instance;
	 private Singleton() {
		 
	 }
	
	 public static Singleton getInstance() {
	        instance = new Singleton(); 
	        return instance;
	    }
}