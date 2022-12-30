package petstore.petCrudTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import petstore.model.BreedPojo;
import petstore.model.PetPojo;
import petstore.model.PetPojoNew;
import petstore.model.UserPojo;
import petstore.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class AddPetTest {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        RestAssured.basePath = "/pet";
    }

    @Test
    public void createUser() {
        PetPojoNew petPojoNew = new PetPojoNew();
        PetPojo petPojo = new PetPojo();
        //BreedPojo breedPojo = new BreedPojo();
        PetPojo.Tags tags = new PetPojo.Tags();
        PetPojo.Breed breed = new PetPojo.Breed();


        petPojoNew.setId("1");
        petPojoNew.setName("Dog");
        petPojoNew.setName("Husky");
        petPojoNew.setPhotoUrls("http://swagger.io");
        petPojoNew.setName("Raja");
        petPojoNew.setStatus(String.valueOf(0));


        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
                .body(petPojo)
                .post();
        response.prettyPrint();
        response.then().log().all().statusCode(200);

    }

}
