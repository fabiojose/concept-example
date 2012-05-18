package com.github.fabiojose.concept.bean.stock.example;

import java.util.Date;
import java.util.Set;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.bean.stock.StockEntry;
import com.github.fabiojose.concept.bean.stock.StockPhysical;

public final class StockEntryExample1 implements IExample<StockEntry> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	private IExample<Area> cell = new AreaCellExample1();
	private IExample<Set<StockPhysical>> physical = new StockPhysicalExample1();
	
	@Override
	public StockEntry getInstance() {

		final StockEntry _result = factory.instanteOf(StockEntry.class);
		_result.setDate(new Date());
		_result.setLocation(cell.getInstance());
		
		final Set<StockPhysical> _physicals = physical.getInstance();
		
		_result.setPhysicals(_physicals);
		
		return _result;
	}

	@Override
	public void example() {
		
		final StockEntry _entry = getInstance();
		System.out.println(_entry);
		
	}

	public static void main(String...args){
		
		final IExample<StockEntry> _example = new StockEntryExample1();
		_example.example();
		
	}
}
