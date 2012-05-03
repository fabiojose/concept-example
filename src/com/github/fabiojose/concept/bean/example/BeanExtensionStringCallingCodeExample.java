package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.bean.BeanExtensionString;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Pair;

public final class BeanExtensionStringCallingCodeExample implements IExample<BeanExtensionString> {

	@Override
	public BeanExtensionString getInstance() {

		final BeanExtensionString _result = new BeanExtensionString();
		_result.setValue("+55");
		_result.setName(new Pair<String, String>("ccode", "CALLING CODE"));
		
		return _result;
	}

	@Override
	public void example() {
		
		System.out.println(getInstance());
	}
	
	public static void main(String...args){
		
		final IExample<BeanExtensionString> _example = new BeanExtensionStringCallingCodeExample();
		_example.example();
		
	}

}
