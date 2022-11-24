package info.bekwam.contact;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
public class ContactResourceTest {

    @Test
    public void testContactEndpoint() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/contact")
                .then()
                .statusCode(200)
                .body("name", equalTo("Bekwam, Inc"));
    }
}