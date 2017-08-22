package de.cofinpro.hackaton.registration.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
public class Messages {

    private final List<String> errors;

    public Messages() {
        this(Collections.emptyList());
    }

    public Messages(List<String> errors) {
        this.errors = new ArrayList<>(errors);
    }

    public void addError(String error) {
        errors.add(error);
    }
}
