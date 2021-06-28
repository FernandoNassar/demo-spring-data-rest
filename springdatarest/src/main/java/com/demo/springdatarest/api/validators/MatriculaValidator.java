package com.demo.springdatarest.api.validators;

import com.demo.springdatarest.api.models.Matricula;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import static com.demo.springdatarest.api.validators.ValidationUtil.*;

@Component("matriculaValidator")
public class MatriculaValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Matricula.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Matricula matricula = (Matricula) target;

        if(isNull(matricula.getAluno())) {
            errors.rejectValue("aluno", "aluno.null", IS_NULL);
        }

        if(isNull(matricula.getCurso())) {
            errors.rejectValue("curso", "curso.null", IS_NULL);
        }

    }
}
