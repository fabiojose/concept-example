package com.github.fabiojose.concept.bean.register.example;

import java.util.HashMap;
import java.util.Map;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Pair;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.bean.good.ArtifactGood;
import com.github.fabiojose.concept.bean.good.example.ArtifactGoodExample1;
import com.github.fabiojose.concept.bean.register.OrderItem;

public final class OrderItemArtifactGoodExample1 implements IExample<OrderItem>{

	public static void main(String[] args) {
		
		final IExample<OrderItem> _example = new OrderItemArtifactGoodExample1();
		_example.example();
		
	}

	private IExample<ArtifactGood> good = new ArtifactGoodExample1();
	
	@Override
	public OrderItem getInstance() {
		final OrderItem _result = new OrderItem();
		
		_result.setGood(good.getInstance());
		
		final Map<String, IPair<String, String>> _discs = new HashMap<String, IPair<String,String>>();
		_result.setDiscriminators(_discs);
		
		_discs.put("SERIAL_NUMBER", new Pair<String, String>("SN12345648979"));
		_discs.put("REVISION_NUMBER", new Pair<String, String>("2.66"));
		_discs.put("MODEL", new Pair<String, String>("DSE 85669#7.21"));
		_discs.put("LOT_NUMBER", new Pair<String, String>("BR_20120430-102100"));
		
		_result.setPrice(UnitFactory.getInstance().currency("BRL", 365.66));
		_result.setQuantity(UnitFactory.getInstance().common("pc", 2));
		
		return _result;
	}

	@Override
	public void example() {
		
		final OrderItem _oitem = getInstance();
		System.out.println("Discriminators: " + _oitem.getDiscriminators());
		System.out.println(_oitem);
		
	}

}
