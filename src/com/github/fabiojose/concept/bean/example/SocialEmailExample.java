package com.github.fabiojose.concept.bean.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Social;
import com.github.fabiojose.concept.bean.SocialType;

public final class SocialEmailExample implements IExample<Social> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	
	@Override
	public Social getInstance() {

		final Social _email = factory.instanteOf(Social.class);
		_email.setType(SocialType.EMAIL);
		_email.setValue("fabiojose@gmail.com");
		_email.setName(SocialType.EMAIL.getContent());
		
		return _email;
	}

	@Override
	public void example() {
		
		final Social _social = getInstance();
		System.out.println(_social);
	}

	public static void main(String...args){
		
		final IExample<Social> _example = new SocialEmailExample();
		_example.example();
		
	}
}
