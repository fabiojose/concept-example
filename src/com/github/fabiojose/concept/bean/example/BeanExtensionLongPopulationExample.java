package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.bean.BeanExtensionLong;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Pair;

public final class BeanExtensionLongPopulationExample implements IExample<BeanExtensionLong> {

	public static void main(String[] args) {
		final IExample<BeanExtensionLong> _example = new BeanExtensionLongPopulationExample();
		_example.example();
	}

	@Override
	public BeanExtensionLong getInstance() {
		final BeanExtensionLong _result = new BeanExtensionLong();
		_result.setValue(192376496L);
		_result.setName(new Pair<String, String>("2011", "POPULATION"));
		
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}

}
