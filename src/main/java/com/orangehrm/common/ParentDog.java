package com.orangehrm.common;

public class ParentDog implements Ianimal {
	
	//parent class method apart from interface
	public void bark(){
		System.out.println("Dog is barking.");
	}

	
	//interface methods
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dog is running.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating.");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Dog is drinking.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog is sleeping.");
	}

}
