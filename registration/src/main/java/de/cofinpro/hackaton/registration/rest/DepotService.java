package de.cofinpro.hackaton.registration.rest;

import de.cofinpro.hackaton.registration.SimulationValues;
import de.cofinpro.hackaton.registration.services.SimulationValuesService;

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
    private SimulationValuesService simulationValuesService;

    /**
     * @return The UUID with which to get
     */
    @POST
    public String storeSimulation(SimulationValues simulation) {
        return simulationValuesService.saveSimulationValues(simulation);
    }

    @GET
    @Path("/{id}")
    public SimulationValues getSimulation(@PathParam("id") @NotNull String id) {
        return simulationValuesService.getSimulationValues(id);
    }

}
