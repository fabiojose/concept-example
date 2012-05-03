package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.factory.UnitFactory;

public final class UnitTimeHourExample implements IExample<Unit> {

	public static void main(String[] args) {
		
		final IExample<Unit> _example = new UnitTimeHourExample();
		_example.example();
	}

	private UnitFactory factory = UnitFactory.getInstance();
	@Override
	public Unit getInstance() {

		return factory.time("h", 5D);
	}

	@Override
	public void example() {
		System.out.println(getInstance());
	}

}
