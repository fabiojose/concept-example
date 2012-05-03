package com.github.fabiojose.concept.bean.entity.example;

import com.github.fabiojose.concept.Commons;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.entity.Business;
import com.github.fabiojose.concept.bean.entity.BusinessClassification;
import com.github.fabiojose.concept.bean.place.Address;
import com.github.fabiojose.concept.bean.place.City;
import com.github.fabiojose.concept.bean.place.Country;
import com.github.fabiojose.concept.bean.place.State;
import com.github.fabiojose.concept.bean.place.example.AddressExample;
import com.github.fabiojose.concept.bean.place.example.CityExample;
import com.github.fabiojose.concept.bean.place.example.CountryExample;
import com.github.fabiojose.concept.bean.place.example.StateExample;

public class BusinessExample1 implements IExample<Business> {


	final IExample<Address> address = new AddressExample();
	final IExample<Country> country = new CountryExample();
	final IExample<State>   state = new StateExample();
	final IExample<City>    city = new CityExample();
 	
	@Override
	public Business getInstance() {

		final Business _result = new Business();
		Commons.getInstance().copy(address.getInstance(), _result);

		_result.setBrand("BRAND NEW DAY");
		_result.setDocument("DOC 5699565");
		_result.setName("BLUE PLASTICS LTD.");
		_result.setClassification(new BusinessClassification(1, "INDUSTRY"));
		
		
		return _result;
	}

	@Override
	public void example() {
		
		final Business _example = getInstance();
		System.out.println(_example);
		
	}

	public static void main(String...args){
		
		final IExample<Business> _example = new BusinessExample1();
		_example.example();
	}
}
