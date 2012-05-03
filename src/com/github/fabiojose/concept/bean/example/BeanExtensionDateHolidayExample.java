package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.Commons;
import com.github.fabiojose.concept.bean.BeanExtensionDate;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Pair;

public class BeanExtensionDateHolidayExample implements IExample<BeanExtensionDate> {

	@Override
	public BeanExtensionDate getInstance() {

		final BeanExtensionDate _result = new BeanExtensionDate();
		_result.setValue(Commons.getInstance().newDate(2012, 9, 7));
		_result.setName(new Pair<String, String>("07/09", "DIA DA INDEPENDÊNCIA"));
		
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}
	
	public static void main(String...args){
		
		final IExample<BeanExtensionDate> _example = new BeanExtensionDateHolidayExample();
		_example.example();
		
	}

}
