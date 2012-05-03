package com.github.fabiojose.concept.bean.good.example;

import java.util.HashMap;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.bean.good.ArtifactGood;

public final class ArtifactGoodExample implements IExample<ArtifactGood> {

	public static void main(String[] args) {
		
		final IExample<ArtifactGood> _example = new ArtifactGoodExample();
		_example.example();
		
	}

	private UnitFactory unit = UnitFactory.getInstance();
	
	@Override
	public ArtifactGood getInstance() {

		final ArtifactGood _result = new ArtifactGood();
		_result.setMetrics(new HashMap<String, Unit>());
		
		_result.setCode("350/1000");
		_result.setName("MAGNETIC ROTOR - 10'");
		
		_result.getMetrics().put("x", unit.length("m", 0.2D));
		_result.getMetrics().put("y", unit.length("m", 0.3D));
		_result.getMetrics().put("z", unit.length("m", 0.1D));
		_result.getMetrics().put("weight", unit.mass("kg", 25D));
		_result.getMetrics().put("parts", unit.common("pc", 32D));
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}

}
