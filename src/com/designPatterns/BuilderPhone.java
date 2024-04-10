package com.designPatterns;
//Builder Pattern


//“Separate the construction of a complex object from its representation so that the same construction process can 
//create different representations.” It is used to construct a complex object step by step and the final step 
//will return the object.
public class BuilderPhone {
	 private String os;
	 private String processor;
	 private int ram;
	 private double screensize;
	 private int battery;
	 
	//only do setters

		public BuilderPhone setOs(String os) {
		this.os = os;
		return this;    //to return the object
	}

	public BuilderPhone setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public BuilderPhone setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public BuilderPhone setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}

	public BuilderPhone setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	 
	
	//Getter method
  public BuilderPhone1 getPhone()
  {
	 return new BuilderPhone1 (os,processor,ram,screensize,battery);   
  }
	 
}
