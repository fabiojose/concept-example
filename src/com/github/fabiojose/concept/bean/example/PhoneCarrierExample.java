package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Identifiable;
import com.github.fabiojose.concept.bean.PhoneCarrier;

public final class PhoneCarrierExample implements IExample<PhoneCarrier> {

	private IExample<Identifiable> owner = new IdentifiableCountryExample();
	
	@Override
	public PhoneCarrier getInstance() {
		
		final PhoneCarrier _result = new PhoneCarrier("TELCOM", "TELCOM TELECOM CO.");
		_result.setOwner(owner.getInstance());
		
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}

	public static void main(String...args){
		
		final IExample<PhoneCarrier> _example = new PhoneCarrierExample();
		_example.example();
	}
}
