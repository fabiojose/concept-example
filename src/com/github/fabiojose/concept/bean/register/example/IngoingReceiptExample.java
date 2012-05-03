package com.github.fabiojose.concept.bean.register.example;

import java.util.Date;

import com.github.fabiojose.concept.Commons;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.entity.Business;
import com.github.fabiojose.concept.bean.entity.example.BusinessExample2;
import com.github.fabiojose.concept.bean.register.PaperType;
import com.github.fabiojose.concept.bean.register.PriorityType;
import com.github.fabiojose.concept.bean.register.Receipt;

public final class IngoingReceiptExample implements IExample<Receipt> {

	public static void main(String[] args) {
		
		final IExample<Receipt> _example = new IngoingReceiptExample();
		_example.example();
	}

	private IExample<Business> origin = new BusinessExample2();
	
	@Override
	public Receipt getInstance() {
		final Receipt _result = new Receipt();
		_result.setEmission(Commons.getInstance().newDate(2012, 3, 20));
		_result.setDate(new Date());
		_result.setMessage("Receipt");
		_result.setNumber(256655L);
		_result.setType(PaperType.INGOING);
		_result.setPriority(PriorityType.MEDIUM);
		
		_result.setOrigin(origin.getInstance());
		
		return _result;
	}

	@Override
	public void example() {
		final Receipt _receipt = getInstance();
		
		System.out.println(_receipt);
	}

}
