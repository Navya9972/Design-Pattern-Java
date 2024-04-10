package com.designPatterns;

public class AbstractFactoryProducer {
  public static  AbstractFactory getFactory(String choice)
  {
	     if(choice.equalsIgnoreCase("Shape")) {
	    	 return new AbstractShapeFactory();
	     }
	     else if(choice.equalsIgnoreCase("color"))
	     {
	    	    return new AbstractColorFactory();
	     }
	     return null;
  }
}