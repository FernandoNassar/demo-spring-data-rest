package com.demo.springdatarest.api.validators;

import com.demo.springdatarest.api.models.Unidade;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import static com.demo.springdatarest.api.validators.ValidationUtil.*;

@Component("unidadeValidator")
public class UnidadeValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {
        return Unidade.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Unidade unidade = (Unidade) target;

        if(isEmpty(unidade.getNome())) {
            errors.rejectValue("nome", "nome.empty", "não deve ser vazio");
        }

        if(isEmpty(unidade.getEndereco())) {
            errors.rejectValue("endereco", "endereco.empty", "não deve ser vazio");
        }

        if(isEmpty(unidade.getBairro())) {
            errors.rejectValue("bairro", "bairro.empty", "não deve ser vazio");
        }

        if(cepIsValid(unidade.getCep())) {
            unidade.setCep(formatter(unidade.getCep()));
        } else {
            errors.rejectValue("cep", "cep.notValid", "inválido");
        }

    }
}
