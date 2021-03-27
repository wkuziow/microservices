package pl.kuziow.restfulwebservicesmicroservices.exception;

import java.util.Date;


public class ExceptionResponse {
    private Date dateStamp;
    private String message;
    private String details;

    public Date getDateStamp() {
        return dateStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public ExceptionResponse(Date dateStamp, String message, String details) {
        this.dateStamp = dateStamp;
        this.message = message;
        this.details = details;
    }
}
