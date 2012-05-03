package com.github.fabiojose.concept.bean.place.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.factory.StateFactory;
import com.github.fabiojose.concept.bean.place.State;

public final class StateExample implements IExample<State> {

	public static void main(String[] args) {
	
		final IExample<State> _example = new StateExample();
		_example.example();
		
	}

	private CountryExample countrye = new CountryExample();
	
	@Override
	public State getInstance() {
 
		return StateFactory.getInstance().newInstance(countrye.getInstance(), "SP");
	}

	@Override
	public void example() {
		
		final State _state = getInstance();
		System.out.println(_state);
	}

}
