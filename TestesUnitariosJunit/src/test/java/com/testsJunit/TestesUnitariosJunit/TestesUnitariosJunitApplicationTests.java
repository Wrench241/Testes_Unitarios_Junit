package com.testsJunit.TestesUnitariosJunit;

import com.testsJunit.TestesUnitariosJunit.domain.Age;
import com.testsJunit.TestesUnitariosJunit.service.ServicePerson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class TestesUnitariosJunitApplicationTests {

	private Age adult;
	private Age notAdult;

	@BeforeEach
	public void setUp(){
		adult = new Age(18);
		notAdult = new Age(10);
	}

	@Test
	@DisplayName("A person should be not adult when age is lower than 18")
	void isAdult_when_ageReturnFalse() {
		ServicePerson idade = new ServicePerson();
		Assertions.assertEquals(false, idade.validation(notAdult));
	}

	@Test
	@DisplayName("if age is lower than 18 its false")
	void isnotadult() {
		ServicePerson servicePerson = new ServicePerson();
		Assertions.assertTrue(servicePerson.validation(adult));

	}

	@Test
	@DisplayName("this test to be error if result is empty")
	void resultVoid(){
		ServicePerson servicePerson = new ServicePerson();
		Assertions.assertThrows(NullPointerException.class,
				() -> servicePerson.validation(null));
	}

	@Test
	@DisplayName("Test for validation if is greate that 18")
	void verification(){
		ServicePerson servicePerson = new ServicePerson();
		List<Age> list = new ArrayList<>();
		Age pedro = new Age(21);
		Age jorge = new Age(41);
		Age maria = new Age(11);
		list.addAll(Arrays.asList(pedro,jorge,maria));
		Assertions.assertEquals(2, servicePerson.removeNotAdult(list).size());
	}

}
