package com.designPatterns;
//Builder Pattern

public class BuilderShop {

	public static void main(String args[])
	{
		BuilderPhone1 p = new BuilderPhone().setOs("Android").setRam(45).setProcessor("Qualcom").getPhone();
		System.out.println(p);
	}
}
