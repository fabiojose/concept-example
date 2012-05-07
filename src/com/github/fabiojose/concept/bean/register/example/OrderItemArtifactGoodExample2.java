package com.github.fabiojose.concept.bean.register.example;

import java.util.HashMap;
import java.util.Map;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Pair;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.bean.good.ArtifactGood;
import com.github.fabiojose.concept.bean.good.example.ArtifactGoodExample2;
import com.github.fabiojose.concept.bean.register.OrderItem;

public final class OrderItemArtifactGoodExample2 implements IExample<OrderItem> {

public static void main(String[] args) {
		
		final IExample<OrderItem> _example = new OrderItemArtifactGoodExample2();
		_example.example();
		
	}

	private IExample<ArtifactGood> good = new ArtifactGoodExample2();
	
	@Override
	public OrderItem getInstance() {
		final OrderItem _result = new OrderItem();
		
		_result.setGood(good.getInstance());
		
		final Map<String, IPair<String, String>> _discs = new HashMap<String, IPair<String,String>>();
		_result.setDiscriminators(_discs);
		
		_discs.put("LOT_NUMBER", new Pair<String, String>("US_8966549/6003"));
		
		_result.setPrice(UnitFactory.getInstance().currency("BRL", 365.66));
		_result.setQuantity(UnitFactory.getInstance().mass("kg", 52000));
		
		return _result;
	}

	@Override
	public void example() {
		
		final OrderItem _oitem = getInstance();
		System.out.println("Discriminators: " + _oitem.getDiscriminators());
		System.out.println(_oitem);
		
	}

}
