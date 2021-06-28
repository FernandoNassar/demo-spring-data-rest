package com.demo.springdatarest.api.validators;

import com.demo.springdatarest.api.models.Professor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import static com.demo.springdatarest.api.validators.ValidationUtil.*;

@Component("professorValidator")
public class ProfessorValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Professor.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        Professor professor = (Professor) target;

        if(isEmpty(professor.getNome())) {
            errors.rejectValue("nome", "nome.empty", IS_EMPTY);
        }

        if(cpfIsValid(professor.getCpf())) {
            professor.setCpf(formatter(professor.getCpf()));
        } else {
            errors.rejectValue("cpf", "cpf.invalid", INVALID);
        }

        if(isEmpty(professor.getEmail())) {
            errors.rejectValue("email", "email.empty", IS_EMPTY);
        }

    }
}
