package com.github.fabiojose.concept.bean.register.example;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import com.github.fabiojose.concept.Commons;
import com.github.fabiojose.concept.bean.BeanExtension;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.entity.Business;
import com.github.fabiojose.concept.bean.entity.example.BusinessExample1;
import com.github.fabiojose.concept.bean.entity.example.BusinessExample2;
import com.github.fabiojose.concept.bean.register.PaperType;
import com.github.fabiojose.concept.bean.register.PriorityType;
import com.github.fabiojose.concept.bean.register.Receipt;
import com.github.fabiojose.concept.bean.register.ReceiptItem;

public final class ReceiptIngoingExample implements IExample<Receipt> {

	public static void main(String[] args) {

		final IExample<Receipt> _example = new ReceiptIngoingExample();
		_example.example();
		
	}

	final IExample<ReceiptItem> artifact = new ReceiptItemArtifactGoodExample();
	final IExample<ReceiptItem> service = new ReceiptItemServiceGoodExample();
	final IExample<Business> customer = new BusinessExample1();
	final IExample<Business> origin = new BusinessExample2();
	
	final Commons commons = Commons.getInstance();
	
	@Override
	public Receipt getInstance() {

		final Receipt _result = new Receipt();
		_result.setExtension(new HashMap<String, BeanExtension<? extends Object>>());
		_result.setItems(new HashSet<ReceiptItem>());
		_result.setPriority(PriorityType.MEDIUM);
		_result.setType(PaperType.INGOING);
		
		_result.setCustomer(customer.getInstance());
		_result.setDate(new Date());
		_result.setEmission(commons.newDate(2012, 5, 2));
		_result.getItems().add(artifact.getInstance());
		_result.getItems().add(service.getInstance());
		_result.setMessage("Message for ....");
		_result.setNumber(90005L);
		_result.setOrigin(origin.getInstance());
		//_result.setOwner(owner)
		
		return _result;
	}

	@Override
	public void example() {
		
		final Receipt _receipt = getInstance();
		System.out.println(_receipt + "\n\nItems:");
		for(ReceiptItem _item : _receipt.getItems()){
			System.out.println(_item);
		}
	}

}
