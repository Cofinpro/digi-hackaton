package de.cofinpro.hackaton.registration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MainExceptionMapper implements ExceptionMapper<Throwable> {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainExceptionMapper.class);

    @Override
    public Response toResponse(Throwable exception) {
        LOGGER.error("JERSEY ERROR: {}", exception.getMessage(), exception);
        return Response.serverError().entity(exception).build();
    }

}
