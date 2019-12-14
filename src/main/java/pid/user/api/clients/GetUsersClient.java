package pid.user.api.clients;

import io.restassured.response.Response;
import pid.user.api.properties.IntegrationProperties;
import pid.user.api.responseobjects.GetUsersResponse;

import static io.restassured.RestAssured.given;

public class GetUsersClient {

    public GetUsersResponse getUsers() {
        String url = IntegrationProperties.getUserUrl;
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get(url);
        GetUsersResponse usersResponse = response.as(GetUsersResponse.class);
        usersResponse.setHttpStatus(response.statusCode());
        return usersResponse;
    }
}
