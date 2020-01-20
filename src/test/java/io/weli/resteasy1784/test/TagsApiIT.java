package io.weli.resteasy1784.test;

//import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.Test;

public class TagsApiIT {

   public static final String HTTP_LOCALHOST_8080 = "http://localhost:8080";

   @Test
//    @Disabled
   void testGet() {
//      TagsApi tagsApi = RestClientBuilder.newBuilder().baseUri(URI.create(HTTP_LOCALHOST_8080)).build(TagsApi.class);
//        Tag tag = tagsApi.get("some-thing", "some-id");

//        assertNull(tag);
   }

   @Test
   void testFoo() {

      // reproducer:
//      FooApi api = RestClientBuilder.newBuilder().baseUri(URI.create(HTTP_LOCALHOST_8080)).build(FooApi.class);
   }


}
