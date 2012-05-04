package com.github.fabiojose.concept.bean.register.example;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.github.fabiojose.concept.Commons;
import com.github.fabiojose.concept.bean.BeanExtension;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.register.OrderItem;
import com.github.fabiojose.concept.bean.register.Physical;

public final class PhysicalExample implements IExample<Set<Physical>> {

	private Commons commons = Commons.getInstance();
	private IExample<OrderItem> paper = new OrderItemArtifactGoodExample();
	
	@Override
	public Set<Physical> getInstance() {

		final Set<Physical> _result = new HashSet<Physical>();
		
		final Physical _p1 = new Physical();
		_p1.setDate(new Date());
		_p1.setDiscriminators(new HashMap<String, IPair<String,String>>());
		_p1.setExpire(commons.newDate(2014, 10, 22));
		_p1.setExtension(new HashMap<String, BeanExtension<? extends Object>>());
		_p1.setName("IDENTIFIED NAME");
		//_p1.setOwner(owner)
		_p1.setPaper(paper.getInstance());
		_p1.setQuantity(_p1.getPaper().getQuantity());
		_result.add(_p1);
		
		return _result;
	}

	@Override
	public void example() {
		
		final Set<Physical> _physical = getInstance();
		for(Physical _p : _physical){
			System.out.println(_p);
		}
	}

	public static void main(String...args){
		
		final IExample<Set<Physical>> _example = new PhysicalExample();
		_example.example();
	}
}
