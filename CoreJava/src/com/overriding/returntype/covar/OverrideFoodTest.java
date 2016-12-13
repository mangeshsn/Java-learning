package com.overriding.returntype.covar;

/**
 * covarient return type As i changed Food in OverrideFoodBase to DogFood
 *
 */
public class OverrideFoodTest extends OverrideFoodBase {

	@Override
	protected DogFood getFood() {
		// TODO Auto-generated method stub
		return new DogFood();
	}

}
