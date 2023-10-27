package com.scaler.ECommerceProductService.controller;

import com.scaler.ECommerceProductService.dto.ErrorRepsonseDTO;
import com.scaler.ECommerceProductService.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<ErrorRepsonseDTO> handleProductNotFoundException(Exception e){
        ErrorRepsonseDTO errorRepsonseDTO = new ErrorRepsonseDTO();
        errorRepsonseDTO.setMessage(e.getMessage());
        errorRepsonseDTO.setMessageCode(404);

        return new ResponseEntity<>(errorRepsonseDTO, HttpStatus.NOT_FOUND);
    }
}
