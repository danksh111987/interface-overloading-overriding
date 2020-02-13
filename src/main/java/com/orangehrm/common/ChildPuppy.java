package com.orangehrm.common;

public class ChildPuppy extends ParentDog {

	//same methods from parent class
	//overriding (parent child relation ship must
	public void bark(){
		System.out.println("ChildPuppy is barking.");
	}
	
	//overloaded method of class
	//everything is same but parameters varies
	public void bark(String txt){
		System.out.println("ChildPuppy is barking." + txt );
	}
	
	
	
	
}
