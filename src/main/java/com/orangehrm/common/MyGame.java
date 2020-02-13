package com.orangehrm.common;

public class MyGame {
//main method
	public static void main(String[] args) {
	
		Cat objCat = new Cat();
		objCat.drink();
		objCat.eat();
		objCat.run();
		objCat.sleep();
		//additional method defined in cat apart from interface.
		objCat.AdditionalCatMethod();
		
		Ianimal objA = new Cat();
		//list is coming from Ianimal, method definition coming from Cat.
		objA.drink();
		
		
		ParentDog objDog = new ParentDog();
		//after . list will come from left side and definition will come from right side.
		//here left and right both are from ParentDog
		objDog.drink();
		objDog.eat();
		objDog.run();
		objDog.sleep();
		
		
		ChildPuppy objpuppy = new ChildPuppy();
		objpuppy.bark();
		objpuppy.bark("Boh Boh");
		
		ParentDog objDog1 = new ParentDog();
		objDog1.bark();
		
//		//drink method is not in child, it is in parent
//		objpuppy.drink();
		
	}
}
