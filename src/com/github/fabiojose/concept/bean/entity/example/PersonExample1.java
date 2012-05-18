package com.github.fabiojose.concept.bean.entity.example;

import com.github.fabiojose.concept.Commons;
import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.Phone;
import com.github.fabiojose.concept.bean.Social;
import com.github.fabiojose.concept.bean.entity.Person;
import com.github.fabiojose.concept.bean.example.PhoneExample;
import com.github.fabiojose.concept.bean.example.SocialEmailExample;
import com.github.fabiojose.concept.bean.example.SocialFacebookExample;
import com.github.fabiojose.concept.bean.place.Address;
import com.github.fabiojose.concept.bean.place.example.AddressExample;

public final class PersonExample1 implements IExample<Person> {

	private ObjectFactory factory = ObjectFactory.getInstance();
	
	private Commons commons = Commons.getInstance();
	private IExample<Address> address = new AddressExample();
	private IExample<Phone> phone = new PhoneExample();
	private IExample<Social> email = new SocialEmailExample();
	private IExample<Social> facebook = new SocialFacebookExample();
	
	@Override
	public Person getInstance() {

		final Person _result = factory.instanteOf(Person.class);
		_result.getAddresses().add(address.getInstance());
		
		_result.setAlias("JJ JOHN");
		_result.setBirthday(commons.newDate(1983, 12, 25));
		_result.setDocument("86669965-888");
		
		_result.setName("JOSH JASON JOHN");
		_result.getPhones().add(phone.getInstance());
		
		_result.getSocials().add(email.getInstance());
		_result.getSocials().add(facebook.getInstance());
		
		return _result;
	}

	@Override
	public void example() {
		
		final Person _person = getInstance();
		System.out.println(_person + "\nSOCIALS: ");
		
		for(Social _social : _person.getSocials()){
			System.out.println(_social);
		}
	}

	public static void main(String...args){
		
		final IExample<Person> _example = new PersonExample1();
		_example.example();
		
	}
}
