package de.cofinpro.hackaton.registration.services;

import de.cofinpro.hackaton.registration.User;

import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
@SessionScoped
@Transactional
public class UserService implements Serializable{

    @PersistenceContext
    private EntityManager entityManager;

    private Long userId = null;

    public void setUser(User user) {
        User myuser = entityManager.merge(user);
        this.userId = myuser.getId();
    }

    public User getUser() {
        return entityManager.find(User.class, userId);
    }

    public User getUser(Long id) {
        this.userId = id;
        return entityManager.find(User.class, userId);
    }


}
