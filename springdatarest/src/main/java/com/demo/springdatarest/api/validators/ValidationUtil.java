package com.demo.springdatarest.api.validators;

public interface ValidationUtil {

    String IS_EMPTY = "não deve ser vazio";
    String INVALID = "campo inválido";
    String IS_NULL = "não deve ser null";

    public static boolean isNull(Object value) {
        return value == null;
    }

    private static boolean isBlank(String value) {
        return value.isBlank();
    }

    public static boolean isEmpty(String value){
        if(isNull(value)) {
            return true;
        }
        return isBlank(value);
    }

    public static boolean cpfIsValid(String cpf) {
        try {
            return cpf.matches("[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}");
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static boolean cepIsValid(String cep) {
        try {
            return cep.matches("[0-9]{5}-{0,1}[0-9]{3}");
        } catch(NullPointerException e) {
            return false;
        }
    }

    public static String formatter(String value) {
        return value.replace(".", "").replace("-", "");
    }

}
