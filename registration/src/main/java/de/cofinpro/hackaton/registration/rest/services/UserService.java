package de.cofinpro.hackaton.registration.rest.services;

import de.cofinpro.hackaton.registration.User;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
@SessionScoped
public class UserService implements Serializable{

    private User user = null;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
