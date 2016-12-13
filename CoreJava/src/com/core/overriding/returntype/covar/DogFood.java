package com.core.overriding.returntype.covar;

public class DogFood extends Food{

	@Override
	public String whatFood() {
		// TODO Auto-generated method stub
		return super.whatFood();
	}
	 public void SetDogFood(){
		 System.out.println("dogFood()");
	 }
}
