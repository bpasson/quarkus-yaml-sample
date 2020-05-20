package org.acme.sample;

import io.quarkus.test.junit.QuarkusTest;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class TestResourceTest {

    @Test
    public void testFooEndpoint() throws IOException {
        given()
          .when()
                .contentType("application/yaml")
                .body(IOUtils.resourceToByteArray("/test.yaml"))
                .post("/foo")
          .then()
             .statusCode(200);
    }

}