package petstore.petCrudTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import petstore.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PetDeleteTest extends TestBase {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        RestAssured.basePath = "/pet";
    }
    @Test

    public void deleteUser() {

        Response response = given()
                .when()
                .pathParam("id", "1")
                .get("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}