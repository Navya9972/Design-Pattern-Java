package com.designPatterns;

public abstract class AbstractFactory {
       abstract AbstractColor getColor(String color);
       abstract AbstractShape getShape(String shape);
}
