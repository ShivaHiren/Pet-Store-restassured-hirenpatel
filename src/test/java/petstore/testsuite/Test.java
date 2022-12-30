package petstore.testsuite;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.given;

public class Test {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://petstore.swagger.io/";
        response = given()
                .when()
                .get("/users")
                .then().statusCode(200);
    }
}
