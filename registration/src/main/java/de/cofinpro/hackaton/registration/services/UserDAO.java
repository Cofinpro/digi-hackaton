package de.cofinpro.hackaton.registration.services;

import de.cofinpro.hackaton.registration.db.UserEntity;

import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
@Transactional
public class UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveUser(UserEntity userEntity) {
        entityManager.merge(userEntity);
    }

    public UserEntity getUser(String clientId) {
        return entityManager.find(UserEntity.class, clientId);
    }

}
