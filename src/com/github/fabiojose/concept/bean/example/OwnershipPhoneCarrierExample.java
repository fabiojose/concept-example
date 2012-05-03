package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Identifiable;
import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.PhoneCarrier;

public final class OwnershipPhoneCarrierExample implements IExample<Ownership> {

	public static void main(String[] args) {
		
		final IExample<Ownership> _example = new OwnershipPhoneCarrierExample();
		_example.example();
	}

	private IExample<Identifiable> country = new IdentifiableCountryExample();
	
	@Override
	public Ownership getInstance() {

		final Ownership _phone = new PhoneCarrier("VIVO", "VIVO TELECON");
		_phone.setOwner(country.getInstance());
		
		return _phone;
	}

	@Override
	public void example() {
		
		final Ownership _oship = getInstance();
		System.out.println(_oship);
		
	}

}
