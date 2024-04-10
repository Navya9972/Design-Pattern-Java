package com.designPatterns;


//define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate
//Factory Method

//only changes can be done in this class if the client wants wat type of object they want
public class FactoryDesignInstance {
	   public OS getInstance(String str)
	   {
		   if(str.equals("Open"))
			     return new Android();
		   else if (str.equals("Close"))
	     return new Mac();
		   else
			    return new Iphpone();
		                 
	   }
     
}
