package pid.user.api.responseobjects;

public class BaseResponse {
    private int httpStatus;
    public void setHttpStatus(int status){
        httpStatus = status;
    }

    public int getHttpStatus(){
        return httpStatus;
    }
}
