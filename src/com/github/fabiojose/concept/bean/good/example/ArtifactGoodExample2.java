package com.github.fabiojose.concept.bean.good.example;

import java.util.HashMap;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.bean.good.ArtifactGood;

public final class ArtifactGoodExample2 implements IExample<ArtifactGood> {

public static void main(String[] args) {
		
		final IExample<ArtifactGood> _example = new ArtifactGoodExample2();
		_example.example();
		
	}

	private UnitFactory unit = UnitFactory.getInstance();
	
	@Override
	public ArtifactGood getInstance() {

		final ArtifactGood _result = new ArtifactGood();
		_result.setMetrics(new HashMap<String, Unit>());
		
		_result.setCode("960/500");
		_result.setName("DOG FOOD - 26");
		
		_result.getMetrics().put("weight", unit.mass("kg", 26D));
		_result.getMetrics().put("parts", unit.common("pc", 1D));
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}

}
