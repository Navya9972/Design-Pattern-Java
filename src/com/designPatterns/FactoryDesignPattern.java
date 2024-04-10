package com.designPatterns;

public class FactoryDesignPattern {
     public static void main(String args[])
     {
    	 FactoryDesignInstance fd = new FactoryDesignInstance();
    	 OS obj = fd.getInstance("hkhjj");
    	 obj.display();
    	 
     }
}
