package com.designPatterns;

public class AbstractShapeFactory extends AbstractFactory{

	@Override
	AbstractColor getColor(String color) {
		return null;
	}

	@Override
	AbstractShape getShape(String shape) 
	{
		 if(shape ==null) {
			 return null;
		 }
		 if(shape.equalsIgnoreCase("Circle")){
			   return new AbstractCircle();
			   
		 }
		 else if (shape.equalsIgnoreCase("Rectangle")) {
			 return new Rectangle();
		 }
		  return null;
		
	}

}
