package de.cofinpro.hackaton.registration.rest;

import javax.mvc.annotation.Controller;
import javax.ws.rs.Path;
import javax.ws.rs.GET;


@Controller
@Path("/hello")
public class HelloWorldEndpoint {

    @GET
    public String doGet() {
        return "/WEB-INF/hello.jsp";
    }
}