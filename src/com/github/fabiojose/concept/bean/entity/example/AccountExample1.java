package com.github.fabiojose.concept.bean.entity.example;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.entity.Account;
import com.github.fabiojose.concept.bean.entity.Role;

public final class AccountExample1 implements IExample<Account> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	private IExample<Role> root = new RoleRootExample();
	
	@Override
	public Account getInstance() {

		final Account _result = factory.instanteOf(Account.class);
		_result.setName("Fábio José");
		_result.setUser("fabiojose");
		_result.setPassword(new char[]{'0', '1', '2'});
		_result.getRolePlaying().add(root.getInstance());
		
		return _result;
	}

	@Override
	public void example() {

		final Account _account = getInstance();
		System.out.println(_account);
		
	}

	public static void main(String...args){
		
		final IExample<Account> _example = new AccountExample1();
		_example.example();
		
	}
}
