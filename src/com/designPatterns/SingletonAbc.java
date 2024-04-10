package com.designPatterns;

public class SingletonAbc {

	   //dont allow to instatntitate another one 
	   static  SingletonAbc obj = new SingletonAbc();
	   private  SingletonAbc() {
		   
	   }
	    public static SingletonAbc getInstance()  //getInstance is static method
	    {
	    	System.out.println("Hi baby");
	    	
	     return obj;
	    }
		
}
