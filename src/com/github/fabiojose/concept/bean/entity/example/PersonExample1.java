package com.github.fabiojose.concept.bean.entity.example;

import java.util.HashMap;
import java.util.HashSet;

import com.github.fabiojose.concept.Commons;
import com.github.fabiojose.concept.bean.BeanExtension;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Phone;
import com.github.fabiojose.concept.bean.entity.Person;
import com.github.fabiojose.concept.bean.example.PhoneExample;
import com.github.fabiojose.concept.bean.place.Address;
import com.github.fabiojose.concept.bean.place.example.AddressExample;

public final class PersonExample1 implements IExample<Person> {

	private Commons commons = Commons.getInstance();
	private IExample<Address> address = new AddressExample();
	private IExample<Phone> phone = new PhoneExample();
	
	@Override
	public Person getInstance() {

		final Person _result = new Person();
		_result.setAddresses(new HashSet<Address>());
		_result.getAddresses().add(address.getInstance());
		
		_result.setAlias("JJ JOHN");
		_result.setBirthday(commons.newDate(1983, 12, 25));
		_result.setDocument("86669965-888");
		_result.setExtension(new HashMap<String, BeanExtension<? extends Object>>());
		_result.setName("JOSH JASON JOHN");
		_result.setPhones(new HashSet<Phone>());
		_result.getPhones().add(phone.getInstance());
		
		return _result;
	}

	@Override
	public void example() {
		System.out.println(getInstance());
	}

	public static void main(String...args){
		
		final IExample<Person> _example = new PersonExample1();
		_example.example();
		
	}
}
