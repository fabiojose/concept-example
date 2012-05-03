package com.github.fabiojose.concept.bean.register.example;

import java.util.Date;
import java.util.HashSet;

import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.register.Order;
import com.github.fabiojose.concept.bean.register.OrderItem;
import com.github.fabiojose.concept.bean.register.PaperType;

public final class IngoingOrderExample implements IExample<Order>{

	public static void main(String[] args) {
		
		final IExample<Order> _example = new IngoingOrderExample();
		_example.example();
		
	}

	private IExample<OrderItem> artifact = new OrderItemArtifactGoodExample();
	private IExample<OrderItem> service = new OrderItemServiceGoodExample();
	
	@Override
	public Order getInstance() {
		
		final Order _result = new Order();
		_result.setType(PaperType.INGOING);
		_result.setDate(new Date());
		_result.setNumber(56655L);
		_result.setMessage("Ingoing Order");
		_result.setItems(new HashSet<OrderItem>());
		
		_result.getItems().add(artifact.getInstance());
		_result.getItems().add(service.getInstance());
		
		return _result;
	}

	@Override
	public void example() {
		
		final Order _order = getInstance();
		System.out.println(_order.getType());
		
		System.out.println(_order);
		System.out.println("items:");
		for(OrderItem _item : _order.getItems()){
			System.out.println(_item);
		}
	}

}
