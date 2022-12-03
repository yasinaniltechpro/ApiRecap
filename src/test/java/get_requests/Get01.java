package get_requests;


import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Get01 {
       /*
      Given
          https://petstore.swagger.io/v2/pet/12
      When
          User sends a GET Request to the url
      Then
          HTTP Status Code should be 200
      And
          Content Type should be JSON
      And
          Status Line should be HTTP/1.1 200 OK
   */

    public static void main(String[] args) {
        //Set the url
        String url = "https://petstore.swagger.io/v2/pet/12";

        //Set the expected data

        //Send the request and get the response
        Response response = given().when().get(url);
        response.prettyPrint();





    }
}
