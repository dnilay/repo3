package com.example.photoappapiuser.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorResponse {
    private String errorMessage;
    private int statusCode;
    private Long timeHappened;
}
