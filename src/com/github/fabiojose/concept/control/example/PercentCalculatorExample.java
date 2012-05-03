package com.github.fabiojose.concept.control.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.control.PercentCalculator;

public final class PercentCalculatorExample implements IExample<PercentCalculator> {

	public static void main(String[] args) {
		
		final IExample<PercentCalculator> _example = new PercentCalculatorExample();
		_example.example();
		
	}

	@Override
	public PercentCalculator getInstance() {
		
		return new PercentCalculator();
	}

	@Override
	public void example() {
		
		System.out.println("10% of 100  = " + getInstance().calculate(10, 100));
		System.out.println("1.6% of 100 = " + getInstance().calculate(1.6, 100));
	}

}
