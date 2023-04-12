package com.ani.soap.exception;

import com.ani.soap.gen.ServiceStatus;

public class ServiceFaultException extends RuntimeException {
    
    private ServiceStatus status;

    public ServiceFaultException(String message, ServiceStatus status) {
        super(message);
        this.status = status;
    }

    public ServiceFaultException(String message,Throwable e, ServiceStatus status) {
        super(message, e);
        this.status = status;
    }


    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(ServiceStatus status) {
        this.status = status;
    }
}