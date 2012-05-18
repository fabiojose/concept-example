package com.github.fabiojose.concept.bean.entity.example;

import com.github.fabiojose.concept.Constants;
import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.entity.Role;

public final class RoleRootExample implements IExample<Role> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	
	@Override
	public Role getInstance() {

		final Role _result = factory.instanteOf(Role.class);
		_result.setName("ROOT");
		_result.setDescription("The ROOT role");
		_result.setLayer(Constants.ROOT_LAYER);
		
		return _result;
	}

	@Override
	public void example() {
		
		final Role _role = getInstance();
		System.out.println(_role);
		
	}

	public static void main(String...args){
		
		final IExample<Role> _example = new RoleRootExample();
		_example.example();
	}
}
