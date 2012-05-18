package com.github.fabiojose.concept.bean.stock.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.bean.stock.AreaClassification;

public final class AreaLevelExample1 implements IExample<Area> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	private IExample<Area> gangway = new AreaGangwayExample1();
	
	@Override
	public Area getInstance() {

		final Area _level1 = factory.instanteOf(Area.class);
		final Area _gangway = gangway.getInstance();
		
		_level1.setRelativeCode("01");
		_level1.addClassification(AreaClassification.LEVEL);
		_level1.setCode(_gangway.getCode() + _level1.getRelativeCode());
		_level1.setName("LEVEL");
		_gangway.getChildren().add(_level1);
		
		return _level1;
	}

	@Override
	public void example() {
		
		final Area _level = getInstance();
		System.out.println(_level);
		
	}

	public static void main(String...args){
		
		final IExample<Area> _example = new AreaLevelExample1();
		_example.example();
		
	}
}
