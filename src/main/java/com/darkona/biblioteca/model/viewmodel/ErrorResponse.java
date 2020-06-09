package com.darkona.biblioteca.model.viewmodel;

import lombok.Data;

import java.util.List;

@Data
public class ErrorResponse {


    private List<ErrorDetails> errors;


    @Data
    public static class ErrorDetails {
        private String fieldName;
        private String message;
    }
}
