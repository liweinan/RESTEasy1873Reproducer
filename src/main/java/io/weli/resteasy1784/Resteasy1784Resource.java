package io.weli.resteasy1784;

import org.jboss.resteasy.spi.HttpResponse;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/1784")
public class Resteasy1784Resource {
    @Path("ErrorAfterFlushWithoutBody")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public void errorAfterFlushWithoutBody(@Context HttpResponse response) throws IOException {
        response.setSuppressExceptionDuringChunkedTransfer(false);
        response.getOutputStream().flush();
        throw new IOException("a strange io error");
    }

    @Path("IgnoreErrorAfterFlushWithoutBody")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public void ignoreErrorAfterFlushWithoutBody(@Context HttpResponse response) throws IOException {
        // suppressExceptionDuringChunkedTransfer by default is true
        response.getOutputStream().flush();
        throw new IOException("a strange io error");
    }

}
