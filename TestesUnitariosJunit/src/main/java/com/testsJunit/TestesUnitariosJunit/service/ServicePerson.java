package com.testsJunit.TestesUnitariosJunit.service;

import com.testsJunit.TestesUnitariosJunit.domain.Age;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.IllformedLocaleException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ServicePerson {

    //metodo de validação da idade
    public boolean validation(Age age){

        //verifica se for nulo lança exceção
        if(age == null){
            throw new IllformedLocaleException("Age cant be null");
        }
        return age.getIdade() >= 18;

    }
    //remove todos que não são adultos
    public List<Age> removeNotAdult(List<Age> age){
       return age.stream().filter(this::validation).collect(Collectors.toList());

    }
}
