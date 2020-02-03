package io.weli.test.resteasy1873;


import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.net.ssl.SSLContext;
import javax.ws.rs.core.Response;

import java.util.concurrent.ExecutorService;

import static org.apache.http.conn.ssl.SSLConnectionSocketFactory.TLS;

public class RESTEasy1873Test {

    @Test
    public void testMultipleSNI() throws Exception {
        ResteasyClientBuilder builder = (ResteasyClientBuilder) ResteasyClientBuilder.newBuilder();
        final SSLContext tlsContext = SSLContext.getInstance(TLS);
        tlsContext.init(null, null, null);

        ResteasyClient c = builder.sniHostNames("serverone", "servertwo").sslContext(tlsContext).build();

        Assertions.assertThrows(Exception.class, () -> {
            c.target("https://localhost").request().buildGet().invoke();
        });

    }

    @Test
    public void testSingleSni() throws Exception {

        ResteasyClientBuilder builder = (ResteasyClientBuilder) ResteasyClientBuilder.newBuilder();
        final SSLContext tlsContext = SSLContext.getInstance(TLS);
        tlsContext.init(null, null, null);
        ResteasyClient c = builder.sniHostNames("www.nfl.com").sslContext(tlsContext).build();
        c.target("https://www.nfl.com").request().buildGet().invoke();
    }
}
