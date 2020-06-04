package com.nearsoft.implementations;

import com.nearsoft.interfaces.Currency;

public class Dollar implements Currency {

	@Override
	public double convert(float amount) {
		return amount * .041;
		
	}

}
