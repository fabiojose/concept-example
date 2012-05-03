package com.github.fabiojose.concept.bean.place.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.factory.CountryFactory;
import com.github.fabiojose.concept.bean.place.Country;

public class CountryExample implements IExample<Country> {

	@Override
	public Country getInstance() {
		
		final Country _result = CountryFactory.getInstance().newInstance("BR");

		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
		
	}
	
	public static void main(String...args){
		
		final IExample<Country> _example = new CountryExample();
		_example.example();
		
	}

}
