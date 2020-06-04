package com.nearsoft.implementations;

import com.nearsoft.interfaces.Currency;

public class Euro implements Currency {

	@Override
	public double convert(float amount) {
		return amount * .038;
		
	}

}
