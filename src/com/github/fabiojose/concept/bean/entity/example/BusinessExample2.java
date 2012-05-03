package com.github.fabiojose.concept.bean.entity.example;

import com.github.fabiojose.concept.Commons;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.entity.Business;
import com.github.fabiojose.concept.bean.entity.BusinessClassification;
import com.github.fabiojose.concept.bean.place.Address;
import com.github.fabiojose.concept.bean.place.example.AddressExample;

public final class BusinessExample2 implements IExample<Business> {

	public static void main(String[] args) {
		final IExample<Business> _example = new BusinessExample2();
		_example.example();
	}

	private IExample<Address> address = new AddressExample();
	private Commons commons = Commons.getInstance();
	
	@Override
	public Business getInstance() {
		
		final Business _result = new Business();
		commons.copy(address.getInstance(), _result);
		
		_result.setBrand("MENTOL INDÚSTRIA E COMÉRCIO DE DOCES");
		_result.setDocument("96966-888995/lll");
		_result.setName("MENTOL METOS");
		_result.setFoundation(commons.newDate(1960, 1, 1));
		_result.setClassification(new BusinessClassification(1, "INDUSTRY"));
		
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
		
	}

}
