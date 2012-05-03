package com.github.fabiojose.concept.bean.register.example;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import com.github.fabiojose.concept.bean.BeanExtension;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.entity.Business;
import com.github.fabiojose.concept.bean.entity.Person;
import com.github.fabiojose.concept.bean.entity.example.BusinessExample1;
import com.github.fabiojose.concept.bean.entity.example.PersonExample1;
import com.github.fabiojose.concept.bean.register.PaperType;
import com.github.fabiojose.concept.bean.register.PriorityType;
import com.github.fabiojose.concept.bean.register.Receipt;
import com.github.fabiojose.concept.bean.register.ReceiptItem;

/**
 * @author fabiojose (fabiojose@gmail.com)
 *
 */
public final class ReceiptOutgoingExample implements IExample<Receipt> {

	private IExample<Person> customer = new PersonExample1();
	private IExample<Business> origin = new BusinessExample1();
	
	private IExample<ReceiptItem> artifact = new ReceiptItemArtifactGoodExample();
	private IExample<ReceiptItem> service = new ReceiptItemServiceGoodExample();
	
	@Override
	public Receipt getInstance() {

		final Receipt _result = new Receipt();
		_result.setCustomer(customer.getInstance());
		_result.setDate(new Date());
		_result.setEmission(new Date());
		_result.setExtension(new HashMap<String, BeanExtension<? extends Object>>());
		_result.setItems(new HashSet<ReceiptItem>());
		_result.getItems().add(service.getInstance());
		_result.getItems().add(artifact.getInstance());
		
		_result.setMessage("DO NOT STOP THE MUSIC!");
		_result.setNumber(7777555L);
		_result.setOrigin(origin.getInstance());
		//_result.setOwner(owner)
		_result.setPriority(PriorityType.MEDIUM);
		_result.setType(PaperType.OUTGOING);
		
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

	public static void main(String...args){
		
		final IExample<Receipt> _example = new ReceiptOutgoingExample();
		_example.example();
		
	}
}
