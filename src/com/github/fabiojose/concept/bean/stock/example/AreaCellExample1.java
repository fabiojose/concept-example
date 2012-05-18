package com.github.fabiojose.concept.bean.stock.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.bean.stock.AreaClassification;

public final class AreaCellExample1 implements IExample<Area> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	private IExample<Area> level = new AreaLevelExample1();
	
	@Override
	public Area getInstance() {
	
		final Area _cell1 = factory.instanteOf(Area.class);
		final Area _level = level.getInstance();
		
		_cell1.setRelativeCode("A1");
		_cell1.addClassification(AreaClassification.CELL);
		_cell1.setCode(_level.getCode() + _cell1.getRelativeCode());
		_cell1.setName("CELL");
		_level.getChildren().add(_cell1);
		
		return _cell1;
	}

	@Override
	public void example() {
		
		final Area _cell = getInstance();
		System.out.println(_cell);
		
	}
	
	public static void main(String...args){
		
		final IExample<Area> _example = new AreaCellExample1();
		_example.example();
		
	}

}
