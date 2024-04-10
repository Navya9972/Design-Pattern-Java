package com.designPatterns;


//Singleton Pattern " define a class that has only one instance and provides a global point of access to it".

public class SingleTon {
	  public static void main(String args[])
	  {
		  SingletonAbc obj1 =SingletonAbc.getInstance();
		  SingletonAbc obj2 =SingletonAbc.getInstance();
		  System.out.println(obj1);
		  System.out.println(obj2);
		  
	  }

}
