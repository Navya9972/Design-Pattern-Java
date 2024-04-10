package com.designPatterns;

public class AbstractColorFactory extends AbstractFactory {

	@Override
	AbstractColor getColor(String color) {
		if (color == null) {
		return null;
	}
		if(color.equalsIgnoreCase("Red")) {
			return new AbstractRed();
		}
		else if (color.equalsIgnoreCase("Blue")) {
			return new AbstractBlue();
		}
		 return null;
			   
			
	}
	@Override
	AbstractShape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
