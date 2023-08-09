package com.testsJunit.TestesUnitariosJunit;

import com.testsJunit.TestesUnitariosJunit.domain.Age;
import com.testsJunit.TestesUnitariosJunit.service.ServicePerson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestesUnitariosJunitApplicationTests {

	@Test
	@DisplayName("A person should be not adult when age is lower than 18")
	void isAdult_when_ageReturnFalse() {
		Age age = new Age(15);
		ServicePerson idade = new ServicePerson();
		Assertions.assertEquals(false, idade.validation(age));
	}

}
