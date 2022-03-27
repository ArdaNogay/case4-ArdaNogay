package com.softtech.softtechspringboot.app.gen.exceptions;

import com.softtech.softtechspringboot.app.gen.enums.BaseErrorMessage;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
@Data
public class GenBusinessException extends RuntimeException{

    private BaseErrorMessage baseErrorMessage;

    public GenBusinessException(BaseErrorMessage baseErrorMessage) {
        this.baseErrorMessage = baseErrorMessage;
    }

    public GenBusinessException(BaseErrorMessage baseErrorMessage, String className) {
        super(className);
        this.baseErrorMessage = baseErrorMessage;
    }

}
