package com.testsJunit.TestesUnitariosJunit.test;

import com.testsJunit.TestesUnitariosJunit.domain.Age;
import com.testsJunit.TestesUnitariosJunit.service.ServicePerson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestPerson {

    public static void main(String[] args){
        Age age = new Age();
        ServicePerson servicePerson = new ServicePerson();
        log.info("is adult? '{}'",servicePerson.validation(age));

    }

}
