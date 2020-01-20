package io.weli.resteasy1873;

import org.jboss.resteasy.spi.HttpResponse;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/1873")
public class Resteasy1873Resource {
   @GET
    public String get() {
       return "/1873";
   }

}
