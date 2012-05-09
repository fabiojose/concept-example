package com.github.fabiojose.concept.bean.stock.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.stock.Area;

public final class AreaExample implements IExample<Area> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	
	@Override
	public Area getInstance() {
		
		final Area _result = factory.instanteOf(Area.class);
		_result.setCode("50");
		_result.setName("MANUFACTURES");
		//_result.setOwner(owner)
		
		final Area _eletronics = factory.instanteOf(Area.class);
		_result.getChildren().add(_eletronics);
		
		_eletronics.setCode(_result.getCode() + "01");
		_eletronics.setName("ELETRONICS");
		
		final Area _gangwayA = factory.instanteOf(Area.class);
		_gangwayA.setCode(_eletronics.getCode() + "A");
		_gangwayA.setName("GANGWAY");
		_eletronics.getChildren().add(_gangwayA);
		
		final Area _column1 = factory.instanteOf(Area.class);
		_column1.setCode(_gangwayA.getCode() + "1");
		_column1.setName("COLUMN");
		_gangwayA.getChildren().add(_column1);
		
		return _result;
	}

	@Override
	public void example() {
		
		final Area _area = getInstance();
		System.out.println("PARENT..: " + _area);
		System.out.println("CHILDREN: " + _area.getChildren());
		for(Area _child : _area.getChildren()){
			System.out.println("\t\t" + _child);
			for(Area _gangway : _child.getChildren()){
				System.out.println("\t\t\t\t" + _gangway);
				for(Area _column : _gangway.getChildren()){
					System.out.println("\t\t\t\t\t\t" + _column);
				}
			}
		}
	}

	public static void main(String...args){
		
		final IExample<Area> _example = new AreaExample();
		_example.example();
		
	}
}
