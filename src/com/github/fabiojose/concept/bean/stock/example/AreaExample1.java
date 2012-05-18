package com.github.fabiojose.concept.bean.stock.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.bean.stock.AreaClassification;

public final class AreaExample1 implements IExample<Area> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	
	@Override
	public Area getInstance() {
		
		final Area _result = factory.instanteOf(Area.class);
		_result.setCode("50");
		_result.setRelativeCode("50");
		_result.addClassification(AreaClassification.BUILD);
		
		_result.setName("MANUFACTURES");
		//_result.setOwner(owner)
		
		final Area _eletronics = factory.instanteOf(Area.class);
		_result.getChildren().add(_eletronics);
		_eletronics.setRelativeCode("01");
		_eletronics.addClassification(AreaClassification.PHYSICAL_AREA);
		_eletronics.setCode(_result.getCode() + _eletronics.getRelativeCode());
		_eletronics.setName("ELETRONICS");
		
		final Area _gangwayA = factory.instanteOf(Area.class);
		_gangwayA.setRelativeCode("A");
		_gangwayA.addClassification(AreaClassification.GANGWAY);
		_gangwayA.setCode(_eletronics.getCode() + _gangwayA.getRelativeCode());
		_gangwayA.setName("GANGWAY");
		_eletronics.getChildren().add(_gangwayA);
		
		final Area _level1 = factory.instanteOf(Area.class);
		_level1.setRelativeCode("01");
		_level1.addClassification(AreaClassification.LEVEL);
		_level1.setCode(_gangwayA.getCode() + _level1.getRelativeCode());
		_level1.setName("LEVEL");
		_gangwayA.getChildren().add(_level1);
		
		final Area _cell1 = factory.instanteOf(Area.class);
		_cell1.setRelativeCode("A1");
		_cell1.addClassification(AreaClassification.CELL);
		_cell1.setCode(_level1.getCode() + _cell1.getRelativeCode());
		_cell1.setName("CELL");
		_level1.getChildren().add(_cell1);
		
		final Area _cell2 = factory.instanteOf(Area.class);
		_cell2.setRelativeCode("A2");
		_cell2.addClassification(AreaClassification.CELL);
		_cell2.setCode(_level1.getCode() + _cell2.getRelativeCode());
		_cell2.setName("CELL");
		_level1.getChildren().add(_cell2);
		
		final Area _cell3 = factory.instanteOf(Area.class);
		_cell3.setRelativeCode("A3");
		_cell3.addClassification(AreaClassification.CELL);
		_cell3.setCode(_level1.getCode() + _cell3.getRelativeCode());
		_cell3.setName("CELL");
		_level1.getChildren().add(_cell3);
		
		return _result;
	}

	@Override
	public void example() {
		
		final Area _area = getInstance();
		System.out.println("ROOT: " + _area);
		for(Area _child : _area.getChildren()){
			System.out.println("\t\t" + _child);
			for(Area _gangway : _child.getChildren()){
				System.out.println("\t\t\t\t" + _gangway);
				for(Area _level : _gangway.getChildren()){
					System.out.println("\t\t\t\t\t\t" + _level);
					
					for(Area _cell : _level.getChildren()){
						System.out.println("\t\t\t\t\t\t\t\t" + _cell);
					}
				}
			}
		}
	}

	public static void main(String...args){
		
		final IExample<Area> _example = new AreaExample1();
		_example.example();
		
	}
}
