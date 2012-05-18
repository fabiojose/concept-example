package com.github.fabiojose.concept.bean.stock.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.bean.stock.AreaClassification;

public final class AreaBuildExample1 implements IExample<Area> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	
	@Override
	public Area getInstance() {

		final Area _result = factory.instanteOf(Area.class);
		_result.setCode("50");
		_result.setRelativeCode("50");
		_result.addClassification(AreaClassification.BUILD);
		
		_result.setName("MANUFACTURES");
		//_result.setOwner(owner)
		
		return _result;
	}

	@Override
	public void example() {
		
		final Area _area = getInstance();
		System.out.println(_area);
	}

	public static void main(String...args){
		
		final IExample<Area> _example = new AreaBuildExample1();
		_example.example();
		
	}
}
