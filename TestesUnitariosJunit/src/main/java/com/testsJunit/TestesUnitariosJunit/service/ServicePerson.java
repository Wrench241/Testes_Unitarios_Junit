package com.testsJunit.TestesUnitariosJunit.service;

import com.testsJunit.TestesUnitariosJunit.domain.Age;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;

public class ServicePerson {
    public boolean validation(Age age){
        Objects.requireNonNull(age, "Object cant be null.");
        return age.getIdade() >= 18;

    }
}
