package com.github.fabiojose.concept.bean.place.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.place.Address;
import com.github.fabiojose.concept.bean.place.AddressType;
import com.github.fabiojose.concept.bean.place.City;
import com.github.fabiojose.concept.bean.place.Country;
import com.github.fabiojose.concept.bean.place.State;

public final class AddressExample implements IExample<Address> {

	public static void main(String[] args) {
		
		final IExample<Address> _example = new AddressExample();
		_example.example();
		
	}

	private IExample<Country> country = new CountryExample();
	private IExample<State>   state = new StateExample();
	private IExample<City>   city = new CityExample();
	
	@Override
	public Address getInstance() {

		final Address _result = new Address();
		_result.setCountry(country.getInstance());
		_result.setState(state.getInstance());
		_result.setCity(city.getInstance());
		_result.setType(new AddressType(1, "HOME"));
		_result.setLine1("Rua 13 de Maio, 250");
		_result.setLine2("Centro, AP 605 G");
		_result.setZipcode("13930-000");
		
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}

}
