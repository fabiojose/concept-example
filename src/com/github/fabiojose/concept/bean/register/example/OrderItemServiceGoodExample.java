package com.github.fabiojose.concept.bean.register.example;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.bean.good.ServiceGood;
import com.github.fabiojose.concept.bean.good.example.ServiceGoodExample;
import com.github.fabiojose.concept.bean.register.OrderItem;

public final class OrderItemServiceGoodExample implements IExample<OrderItem> {

	public static void main(String[] args) {

		final IExample<OrderItem> _example = new OrderItemServiceGoodExample();
		_example.example();
		
	}

	private IExample<ServiceGood> good = new ServiceGoodExample();
	private UnitFactory unit = UnitFactory.getInstance();
	
	@Override
	public OrderItem getInstance() {

		final OrderItem _result = new OrderItem();
		_result.setGood(good.getInstance());
		
		_result.setPrice(unit.currency("BRL", 1365.66));
		_result.setQuantity(unit.common("ex", 1));
		
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}

	
}
