package de.cofinpro.hackaton.registration.services;

import de.cofinpro.hackaton.registration.db.DepotEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.UUID;

@Transactional
public class DepotDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public String saveNewDepot(DepotEntity depotEntity) {
        depotEntity.setId(UUID.randomUUID().toString());
        entityManager.persist(depotEntity);
        return depotEntity.getId();
    }

    public DepotEntity getDepot(String id) {
        return entityManager.find(DepotEntity.class, id);
    }

}
