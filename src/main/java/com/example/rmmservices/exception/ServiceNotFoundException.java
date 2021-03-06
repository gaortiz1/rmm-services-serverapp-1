package com.example.rmmservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Service not found")
public class ServiceNotFoundException extends RuntimeException {
}
