package org.acme.qute;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.jboss.resteasy.reactive.RestQuery;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import java.time.LocalDateTime;
import java.util.List;

@Path("/hello")
public class HelloResource {

    @Inject
    Template hello;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Blocking
    @Transactional
    public TemplateInstance get(@RestQuery String name) {
       Users users = new Users();
       users.firstName = "vishal";
       users.lastName = "vishnu";
       users.createdDate = LocalDateTime.now();
       users.persist();
        System.out.println(users.id);
        return hello.data("name", name);
    }

}
