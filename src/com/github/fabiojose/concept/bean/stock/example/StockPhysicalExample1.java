package com.github.fabiojose.concept.bean.stock.example;

import java.util.HashSet;
import java.util.Set;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.register.Physical;
import com.github.fabiojose.concept.bean.register.example.PhysicalExample1;
import com.github.fabiojose.concept.bean.stock.StockPhysical;
import com.github.fabiojose.concept.visitor.stock.PhysicalFragmentor;

public final class StockPhysicalExample1 implements IExample<Set<StockPhysical>> {

	private IExample<Set<Physical>> physical = new PhysicalExample1();
	
	@Override
	public Set<StockPhysical> getInstance() {

		final Set<StockPhysical> _result = new HashSet<StockPhysical>();
		final PhysicalFragmentor _fragmentor = new PhysicalFragmentor();
		_fragmentor.setFactor(19D);
		
		for(Physical _physical : physical.getInstance()){
			
			_result.addAll( _fragmentor.visit(_physical) );
			
		}
		
		return _result;
	}

	@Override
	public void example() {
		
		final Set<StockPhysical> _stockp = getInstance();
		for(StockPhysical _stock : _stockp){
			System.out.println(_stock);
		}
	}

	public static void main(String...args){
		final IExample<Set<StockPhysical>> _example = new StockPhysicalExample1();
		_example.example();
	}
}
