package matt.damon.service.rest.provider;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import matt.damon.core.vo.ErrorMessage;
import matt.damon.exception.RestException;

@Provider
public class RestExceptionMapper implements ExceptionMapper<RestException> {

    @Override
    public Response toResponse(RestException exception) {

        ErrorMessage message = new ErrorMessage();
        message.setCode(exception.getCode());
        message.setMessage(exception.getMessage());

        ResponseBuilder responseBuilder = Response.serverError();
        responseBuilder.type(MediaType.APPLICATION_JSON + ";charset=utf-8");
        responseBuilder.entity(message);
        return responseBuilder.build();
    }

}
