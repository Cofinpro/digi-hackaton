package de.cofinpro.hackaton.registration.rest;

import javax.servlet.http.HttpServletRequest;
import de.cofinpro.hackaton.registration.api.DepotRequest;
import de.cofinpro.hackaton.registration.controller.RegistrationController;
import de.cofinpro.hackaton.registration.db.DepotEntity;
import de.cofinpro.hackaton.registration.services.DepotDAO;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
@Path("/api/depot")
@Produces("application/json")
@Consumes("application/json")
public class DepotService {

    @Inject
    private DepotDAO depotDAO;

    @Context
    private HttpServletRequest request;

    /**
     * @return The UUID with which to get
     */
    @POST
    public Response storeSimulation( DepotRequest depot) {
        DepotEntity entity = new DepotEntity();
        entity.setAmount(depot.getAmount());
        entity.setRisk(depot.getRisk());
        String uuid = depotDAO.saveNewDepot(entity);
        URI uri = UriBuilder.fromUri(request.getContextPath())
                .path("/registration")
                .queryParam("uuid", uuid).build();
        return Response.created(uri).build();
    }

    @GET
    @Path("/{id}")
    public DepotEntity getSimulation(@PathParam("id") @NotNull String id) {
        return depotDAO.getDepot(id);
    }

}
