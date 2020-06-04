package com.nearsoft.implementations;

import com.nearsoft.interfaces.Currency;

public class Yen implements Currency {

	@Override
	public double convert(float amount) {
		return amount * 4.41;
		
	}

}
