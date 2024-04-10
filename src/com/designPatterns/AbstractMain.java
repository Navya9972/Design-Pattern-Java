package com.designPatterns;


//define an interface or abstract class for creating families of related (or dependent) objects 
//but without specifying their concrete sub-classes.
public class AbstractMain {
   public static void main(String args[])
   {
	    AbstractFactory af = AbstractFactoryProducer .getFactory("Shape"); 
	    // get shape factory
	    AbstractShape shape1 = AbstractShapeFactory.getShape("Circle");
	    shape1.draw();
	    AbstractShape shape2 = AbstractShapeFactory.getShape("Rectangle");
	    shape2.draw();
	    
	    //get   color factory
	    AbstractFactory cf = AbstractFactoryProducer .getFactory("Color"); 
	    AbstractColor color1 = AbstractColorFactory.getColor("Red");
	    color1.fill();
	    AbstractColor color2 = AbstractColorFactory.getColor("Blue");
	    color2.fill();
	    
}
}