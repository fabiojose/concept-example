package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Identifiable;
import com.github.fabiojose.concept.bean.place.Country;
import com.github.fabiojose.concept.bean.place.example.CountryExample;

public class IdentifiableCountryExample implements IExample<Identifiable>{

	private IExample<Country> country = new CountryExample();
	@Override
	public Identifiable getInstance() {

		final Identifiable _result = country.getInstance();
		_result.setId(44L);
		_result.setName("BRASIL");
		
		return _result;
	}

	@Override
	public void example() {
		
		final Identifiable _id = getInstance();
		System.out.println("ID..: " + _id.getId());
		System.out.println("NAME: " + _id.getName());
	}

	public static void main(String...args){
		
		final IExample<Identifiable> _example = new IdentifiableCountryExample();
		_example.example();
		
	}
}
