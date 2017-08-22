package de.cofinpro.hackaton.registration.services;

import de.cofinpro.hackaton.registration.SimulationValues;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.UUID;

@Transactional
public class SimulationValuesService {

    @PersistenceContext
    private EntityManager entityManager;

    public String saveSimulationValues(SimulationValues simulationValues) {
        simulationValues.setId(UUID.randomUUID().toString());
        entityManager.persist(simulationValues);
        return simulationValues.getId();
    }

    public SimulationValues getSimulationValues(String id) {
        return entityManager.find(SimulationValues.class, id);
    }

}
