package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Phone;
import com.github.fabiojose.concept.bean.PhoneCarrier;
import com.github.fabiojose.concept.bean.PhoneType;

public final class PhoneExample implements IExample<Phone> {

	private IExample<PhoneCarrier> carrier = new PhoneCarrierExample();
	
	@Override
	public Phone getInstance() {

		final Phone _result = new Phone();
		_result.setCarrier(carrier.getInstance());
		_result.setNumber("9 6666-7777");
		_result.setType(new PhoneType("H", "HOME"));
		
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}

	public static void main(String...args){
		
		final IExample<Phone> _example = new PhoneExample();
		_example.example();
		
	}
}
