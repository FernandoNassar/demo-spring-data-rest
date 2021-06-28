package com.demo.springdatarest.api.validators;

import com.demo.springdatarest.api.models.Curso;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import static com.demo.springdatarest.api.validators.ValidationUtil.*;

@Component("cursoValidator")
public class CursoValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Curso.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        Curso curso = (Curso) target;

        if(isEmpty(curso.getNome())) {
            errors.rejectValue("nome", "nome.empty", IS_EMPTY);
        }
    }
}
