package petstore.userCrudTest;

import io.restassured.response.Response;
import org.junit.Test;
import petstore.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UserDeleteTest extends TestBase {

    @Test

    public void deleteUser() {

        Response response = given()
                .when()
                .pathParam("username", "Jhon1")
                .delete("{username}");

        response.then().statusCode(200);
        response.prettyPrint();
    }
}