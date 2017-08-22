package de.cofinpro.hackaton.registration.rest;

import javax.annotation.sql.DataSourceDefinition;
import javax.ws.rs.ApplicationPath;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
@ApplicationPath("/")
@DataSourceDefinition(name = "java:app/registration", url = "jdbc:h2:mem:registration", className = "org.h2.jdbcx.JdbcDataSource")
public class Application extends javax.ws.rs.core.Application {
}
