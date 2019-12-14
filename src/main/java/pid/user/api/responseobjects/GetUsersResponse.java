package pid.user.api.responseobjects;

import org.testng.Assert;

import java.util.List;

public class GetUsersResponse extends BaseResponse {
    List<User> users;

    public void assertUsers(){

        Assert.assertTrue(users.size()>0);
    }
}
