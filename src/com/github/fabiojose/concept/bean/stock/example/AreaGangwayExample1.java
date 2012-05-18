package com.github.fabiojose.concept.bean.stock.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.bean.stock.AreaClassification;

public final class AreaGangwayExample1 implements IExample<Area> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	private IExample<Area> physical = new AreaPhysicalExample1();
	
	@Override
	public Area getInstance() {

		final Area _gangwayA = factory.instanteOf(Area.class);
		final Area _physical = physical.getInstance();
		
		_gangwayA.setRelativeCode("A");
		_gangwayA.addClassification(AreaClassification.GANGWAY);
		_gangwayA.setCode(_physical.getCode() + _gangwayA.getRelativeCode());
		_gangwayA.setName("GANGWAY");
		_physical.getChildren().add(_gangwayA);
		
		return _gangwayA;
	}

	@Override
	public void example() {
		
		final Area _gangway = getInstance();
		System.out.println(_gangway);
		
	}

	public static void main(String...args){
		
		final IExample<Area> _example = new AreaGangwayExample1();
		_example.example();
	}
}
