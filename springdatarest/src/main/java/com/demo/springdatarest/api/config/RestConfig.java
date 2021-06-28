package com.demo.springdatarest.api.config;

import com.demo.springdatarest.api.validators.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.Validator;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Autowired @Lazy
    private Validator validator;

    private static final String BEFORE_CREATE = "beforeCreate";
    private static final String BEFORE_SAVE = "beforeSave";

    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {

//        validatingListener.addValidator(BEFORE_CREATE, new UnidadeValidator());
//        validatingListener.addValidator(BEFORE_SAVE, new UnidadeValidator());
//
//        validatingListener.addValidator(BEFORE_CREATE, new AlunoValidator());
//        validatingListener.addValidator(BEFORE_SAVE, new AlunoValidator());
//
//        validatingListener.addValidator(BEFORE_CREATE, new ProfessorValidator());
//        validatingListener.addValidator(BEFORE_SAVE, new ProfessorValidator());
//
//        validatingListener.addValidator(BEFORE_CREATE, new CursoValidator());
//        validatingListener.addValidator(BEFORE_SAVE, new CursoValidator());
//
//        validatingListener.addValidator(BEFORE_CREATE, new MatriculaValidator());
//        validatingListener.addValidator(BEFORE_SAVE, new MatriculaValidator());
//
//        validatingListener.addValidator(BEFORE_CREATE, new AvaliacaoValidator());
//        validatingListener.addValidator(BEFORE_SAVE, new AvaliacaoValidator());

    }
}
