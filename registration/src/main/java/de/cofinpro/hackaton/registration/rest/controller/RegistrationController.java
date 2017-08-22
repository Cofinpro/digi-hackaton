package de.cofinpro.hackaton.registration.rest.controller;

import de.cofinpro.hackaton.registration.User;
import de.cofinpro.hackaton.registration.rest.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
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
    private UserService userService;

    @GET
    public String doGet() {
        return "/WEB-INF/registration.jsp";
    }

    @POST
    public String doSubmit(@BeanParam @NotNull @Valid User user) {
        if () {
            return doGet();bindingResult.isFailed()
        }
        log.info("User: {}", user);
        userService.setUser(user);
        return "redirect:/confirmation";
    }
}