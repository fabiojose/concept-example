package com.github.fabiojose.concept.bean.place.example;

import com.github.fabiojose.concept.bean.BeanExtensionDate;
import com.github.fabiojose.concept.bean.BeanExtensionLong;
import com.github.fabiojose.concept.bean.BeanExtensionString;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.example.BeanExtensionDateHolidayExample;
import com.github.fabiojose.concept.bean.example.BeanExtensionLongPopulationExample;
import com.github.fabiojose.concept.bean.example.BeanExtensionStringCallingCodeExample;
import com.github.fabiojose.concept.bean.place.Country;

public final class CountryBeanExtensionExample implements IExample<Country> {

	public static void main(String[] args) {
		
		final IExample<Country> _example = new CountryBeanExtensionExample();
		_example.example();
		
	}

	private IExample<Country> country = new CountryExample();
	private IExample<BeanExtensionDate> holiday = new BeanExtensionDateHolidayExample();
	private IExample<BeanExtensionLong> population = new BeanExtensionLongPopulationExample();
	private IExample<BeanExtensionString> calling = new BeanExtensionStringCallingCodeExample();
	
	@Override
	public Country getInstance() {

		final Country _result = country.getInstance();
		_result.getExtension().put("independece.day", holiday.getInstance());
		_result.getExtension().put("population.2011", population.getInstance());
		_result.getExtension().put("calling.code", calling.getInstance());
		
		return _result;
	}

	@Override
	public void example() {
		
		final Country _country = getInstance();
		System.out.println(_country.getExtension());
		
	}

}
