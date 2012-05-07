package com.github.fabiojose.concept.bean.register.example;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.github.fabiojose.concept.Commons;
import com.github.fabiojose.concept.bean.BeanExtension;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Pair;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.bean.register.OrderItem;
import com.github.fabiojose.concept.bean.register.Physical;
import com.github.fabiojose.concept.control.Multiplication;

public final class PhysicalExample1 implements IExample<Set<Physical>> {

	private UnitFactory unit = UnitFactory.getInstance();
	private Commons commons = Commons.getInstance();
	private IExample<OrderItem> paper = new OrderItemArtifactGoodExample2();
	
	@Override
	public Set<Physical> getInstance() {

		final Set<Physical> _result = new HashSet<Physical>();
		
		final Physical _p1 = new Physical();
		_p1.setDate(new Date());
		_p1.setDiscriminators(new HashMap<String, IPair<String,String>>());
		_p1.getDiscriminators().put("LOT_NUMBER", new Pair<String, String>("889/900"));
		_p1.setExpire(commons.newDate(2014, 10, 22));
		_p1.setExtension(new HashMap<String, BeanExtension<? extends Object>>());
		_p1.setName("IDENTIFIED NAME");
		//_p1.setOwner(owner)
		_p1.setPaper(paper.getInstance());
		
		final Unit _quantity1 = unit.common("sc", 1000);
		_quantity1.calculator(new Multiplication(unit.mass("kg", 52)));
		_p1.setQuantity(_quantity1);
		_result.add(_p1);
		
		final Physical _p2 = new Physical();
		_p2.setDate(new Date());
		_p2.setDiscriminators(new HashMap<String, IPair<String,String>>());
		_p2.getDiscriminators().put("LOT_NUMBER", new Pair<String, String>("889/900"));
		_p2.setExpire(commons.newDate(2014, 10, 22));
		_p2.setExtension(new HashMap<String, BeanExtension<? extends Object>>());
		_p2.setName("IDENTIFIED NAME");
		//_p2.setOwner(owner)
		_p2.setPaper(paper.getInstance());
		
		final Unit _quantity2 = unit.common("sc", 1000);
		_quantity2.calculator(new Multiplication(unit.mass("kg", 52)));
		_p2.setQuantity(_quantity2);
		_result.add(_p2);
		
		return _result;
	}

	@Override
	public void example() {
		
		final Set<Physical> _physical = getInstance();
		for(Physical _p : _physical){
			System.out.println(_p);
			
			System.out.println("Paper quantity.....: " + _p.getPaper().getQuantity());
			System.out.println("Physical quantity..: " + _p.getQuantity());
			System.out.println("Physical calculated: " + _p.getQuantity().calculate());
			System.out.println();
		}
	}

	public static void main(String...args){
		
		final IExample<Set<Physical>> _example = new PhysicalExample1();
		_example.example();
	}
}
