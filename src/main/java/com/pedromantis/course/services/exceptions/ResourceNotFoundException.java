package com.pedromantis.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not founde. Id" + id);
    }
}
