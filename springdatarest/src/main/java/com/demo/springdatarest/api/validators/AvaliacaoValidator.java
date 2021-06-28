package com.demo.springdatarest.api.validators;

import com.demo.springdatarest.api.models.Avaliacao;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import static com.demo.springdatarest.api.validators.ValidationUtil.*;

@Component("avaliacaoValidator")
public class AvaliacaoValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Avaliacao.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        Avaliacao avaliacao = (Avaliacao) target;

        if(isNull(avaliacao.getMatricula())) {
            errors.rejectValue("matricula", "matricula.null", IS_NULL);
        }

        if(isNull(avaliacao.getTipoDeAvaliacao())) {
            errors.rejectValue("tipoDeAvaliacao", "avaliacao.null", IS_NULL);
        }

    }
}
