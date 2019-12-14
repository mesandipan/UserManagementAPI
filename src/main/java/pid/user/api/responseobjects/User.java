package pid.user.api.responseobjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    @JsonProperty
    private String uuid;
    @JsonProperty
    private String email;
    @JsonProperty
    private String groupId;
    @JsonProperty
    private String company;
    @JsonProperty
    private String location;
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private String country;
}
