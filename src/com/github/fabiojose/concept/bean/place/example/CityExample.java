package com.github.fabiojose.concept.bean.place.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.factory.CityFactory;
import com.github.fabiojose.concept.bean.place.City;
import com.github.fabiojose.concept.bean.place.State;

public final class CityExample implements IExample<City> {

	public static void main(String[] args) {
		
		final IExample<City> _example = new CityExample();
		_example.example();
	}

	final IExample<State> state = new StateExample();
	@Override
	public City getInstance() {
		
		return CityFactory.getInstance().newInstance(state.getInstance(), "10001");
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}

}
