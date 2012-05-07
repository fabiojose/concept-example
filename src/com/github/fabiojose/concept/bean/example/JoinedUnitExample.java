package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.control.Division;
import com.github.fabiojose.concept.control.Multiplication;

public final class JoinedUnitExample implements IExample<Unit> {

	private UnitFactory unit = UnitFactory.getInstance();
	
	@Override
	public Unit getInstance() {

		final Unit _result = unit.mass("kg", 100);
		_result.calculator(new Multiplication(unit.common("sc", 240))).calculator(new Division(unit.common("dz", 12)));
		
		return _result;
	}

	@Override
	public void example() {
		
		final Unit _unit = getInstance();
		System.out.println(_unit);
		System.out.println(_unit.calculate());
	}

	public static void main(String...args){
		
		final IExample<Unit> _example = new JoinedUnitExample();
		_example.example();
	}
}
