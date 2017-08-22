package de.cofinpro.hackaton.registration.rest.controller;

import de.cofinpro.hackaton.registration.User;
import de.cofinpro.hackaton.registration.rest.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;

@Controller
@Path("/registration")
@View("/WEB-INF/registration.jsp")
public class RegistrationController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    private BindingResult bindingResult;

    @Inject
    private Models models;

    @Inject
    private Messages messages;

    @GET
    public String doGet() {
        return "/WEB-INF/registration.jsp";
    }

    @POST
    public String doSubmit(@BeanParam @NotNull @Valid  User user) {
        if (bindingResult.isFailed()) {
            models.put("messages", new Messages(bindingResult.getAllMessages()));
            return doGet();
        }
        log.info("User: {}", user);
        models.put("user", user);
        return "redirect:/confirmation";
    }
}