package com.designPatterns;
//Builder Pattern
//(In case wer u wan to set only few values in the constructors not all then use this )


public class BuilderPhone1 {

	private String os;
	 private String processor;
	 private int ram;
	 private double screensize;
	 private int battery;
	 
	public BuilderPhone1(String os, String processor, int ram, double screensize, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.screensize = screensize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "BuilderPhone1 [os=" + os + ", processor=" + processor + ", ram=" + ram + ", screensize=" + screensize
				+ ", battery=" + battery + "]";
	}
	
}
