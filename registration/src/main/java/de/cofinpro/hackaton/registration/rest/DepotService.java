package de.cofinpro.hackaton.registration.rest;

import de.cofinpro.hackaton.registration.api.DepotRequest;
import de.cofinpro.hackaton.registration.api.DepotResponse;
import de.cofinpro.hackaton.registration.db.DepotEntity;
import de.cofinpro.hackaton.registration.services.DepotDAO;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
@Path("/api/depot")
@Produces("application/json")
@Consumes("application/json")
public class DepotService {

    @Inject
    private DepotDAO depotDAO;

    /**
     * @return The UUID with which to get
     */
    @POST
    public DepotResponse storeSimulation(DepotRequest request) {
        DepotEntity entity = new DepotEntity();
        entity.setAmount(request.getAmount());
        entity.setRisk(request.getRisk());
        String uuid = depotDAO.saveNewDepot(entity);
        return new DepotResponse(uuid);
    }

    @GET
    @Path("/{id}")
    public DepotEntity getSimulation(@PathParam("id") @NotNull String id) {
        return depotDAO.getDepot(id);
    }

}
