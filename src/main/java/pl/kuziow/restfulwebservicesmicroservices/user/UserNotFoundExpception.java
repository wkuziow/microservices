package pl.kuziow.restfulwebservicesmicroservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExpception extends RuntimeException {
    public UserNotFoundExpception(String message) {
        super(message);
    }
}
