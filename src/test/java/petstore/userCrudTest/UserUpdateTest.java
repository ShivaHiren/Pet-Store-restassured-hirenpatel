package petstore.userCrudTest;

import io.restassured.response.Response;
import org.junit.Test;
import petstore.model.UserPojo;
import petstore.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UserUpdateTest extends TestBase {

    @Test
    public void updateUser(){
        UserPojo userPojo = new UserPojo();
        userPojo.setId(2);
        userPojo.setUsername("Jhon123");
        userPojo.setFirstName("Jhon jr");
        userPojo.setLastName("Wick");
        userPojo.setEmail("jhon@gmail.com");
        userPojo.setPassword("jhon123");
        userPojo.setPhone("0123456789");
        userPojo.setUserStatus(1);

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .put("https://petstore.swagger.io/v2/user/Jhon1");
        response.prettyPrint();
        response.then().log().all().statusCode(200);




    }
}
