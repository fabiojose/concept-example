package com.github.fabiojose.concept.bean.good.example;

import java.util.HashMap;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.example.UnitTimeHourExample;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.bean.good.ServiceGood;

public final class ServiceGoodExample implements IExample<ServiceGood> {

	public static void main(String[] args) {
		
		final IExample<ServiceGood> _example = new ServiceGoodExample();
		_example.example();
		
	}

	private IExample<Unit> hour = new UnitTimeHourExample();
	private UnitFactory unit = UnitFactory.getInstance();
	@Override
	public ServiceGood getInstance() {
		
		final ServiceGood _result = new ServiceGood();
		_result.setCode("JTGH85666/100");
		_result.setName("CHANGE BROKEN ROTOR - 10'");
		
		_result.setEstimations(new HashMap<String, Unit>());
		_result.getEstimations().put("time.todo", hour.getInstance());
		_result.getEstimations().put("parts", unit.common("pc", 1D));
		return _result;
	}

	@Override
	public void example() {
		System.out.println(getInstance());
	}

}
