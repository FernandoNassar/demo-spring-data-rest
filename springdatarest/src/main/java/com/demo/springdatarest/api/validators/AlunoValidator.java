package com.demo.springdatarest.api.validators;

import com.demo.springdatarest.api.models.Aluno;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import static com.demo.springdatarest.api.validators.ValidationUtil.*;

@Component("alunoValidator")
public class AlunoValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Aluno.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Aluno aluno = (Aluno) target;

        if(isEmpty(aluno.getNome())) {
            errors.rejectValue("nome", "nome.empty", IS_EMPTY);
        }

        if(cpfIsValid(aluno.getCpf())) {
            aluno.setCpf(formatter(aluno.getCpf()));
        } else {
            errors.rejectValue("cpf", "cpf.invalid", INVALID);
        }

        if(isEmpty(aluno.getEmail())) {
            errors.rejectValue("email", "email.empty", IS_EMPTY);
        }
    }
}
