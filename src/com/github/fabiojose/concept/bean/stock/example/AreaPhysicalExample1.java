package com.github.fabiojose.concept.bean.stock.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.bean.stock.AreaClassification;

public final class AreaPhysicalExample1 implements IExample<Area> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	private IExample<Area> build = new AreaBuildExample1();
	
	@Override
	public Area getInstance() {

		final Area _build = build.getInstance();
		final Area _eletronics = factory.instanteOf(Area.class);
		_build.getChildren().add(_eletronics);
		_eletronics.setRelativeCode("01");
		_eletronics.addClassification(AreaClassification.PHYSICAL_AREA);
		_eletronics.setCode(_build.getCode() + _eletronics.getRelativeCode());
		_eletronics.setName("ELETRONICS");
		
		return _eletronics;
	}

	@Override
	public void example() {
		
		final Area _area = getInstance();
		System.out.println(_area);
	}
	
	public static void main(String...args){
		
		final IExample<Area> _example = new AreaPhysicalExample1();
		_example.example();
		
	}

}
