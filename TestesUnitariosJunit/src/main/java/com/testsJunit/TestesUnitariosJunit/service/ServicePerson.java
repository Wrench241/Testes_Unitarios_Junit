package com.testsJunit.TestesUnitariosJunit.service;

import com.testsJunit.TestesUnitariosJunit.domain.Age;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;

public class ServicePerson {
    public boolean validation(Age age){
        Age idade = new Age();
        Objects.requireNonNull(age, "Object cant be null.");
        return idade.getIdade() >= 18;

    }
}
