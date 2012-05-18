package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Social;
import com.github.fabiojose.concept.bean.SocialType;

public final class SocialFacebookExample implements IExample<Social> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	
	@Override
	public Social getInstance() {

		final Social _result = factory.instanteOf(Social.class);
		_result.setType(SocialType.FACEBOOK);
		_result.setValue("http://facebook.com/fabiojose");
		_result.setName(SocialType.FACEBOOK.getContent());
		
		return _result;
	}

	@Override
	public void example() {
		
		final Social _social = getInstance();
		System.out.println(_social);
		
	}

	public static void main(String...args){
		
		final IExample<Social> _example = new SocialFacebookExample();
		_example.example();
		
	}
}
