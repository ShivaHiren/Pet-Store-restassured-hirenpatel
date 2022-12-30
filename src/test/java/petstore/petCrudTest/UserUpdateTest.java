package petstore.petCrudTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import petstore.model.PetPojoNew;
import petstore.model.UserPojo;
import petstore.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UserUpdateTest extends TestBase {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        RestAssured.basePath = "/pet";
    }
    @Test
    public void updateUser(){
        UserPojo userPojo = new UserPojo();
        PetPojoNew petPojoNew = new PetPojoNew();

        petPojoNew.setId("1");
        petPojoNew.setName("Dog");
        petPojoNew.setName("Husky");
        petPojoNew.setPhotoUrls("http://swagger.io");
        petPojoNew.setName("Sky");
        petPojoNew.setStatus(String.valueOf(0));

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .put("https://petstore.swagger.io/v2/pet");
        response.prettyPrint();
        response.then().log().all().statusCode(200);




    }
}
