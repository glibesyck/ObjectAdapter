package adapter;

import facebook.FacebookUser;
import lombok.AllArgsConstructor;
import user.User;

import java.util.Date;

@AllArgsConstructor
public class FacebookUserAdapter implements User{
    private FacebookUser user;

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getLastActiveTime();
    }

    @Override
    public String getUserEmail() {
        return user.getUserEmail();
    }

    @Override
    public void setMessage(String message) {
        user.message = message;
    }
    @Override
    public String getMessage() {
        return user.getMessage();
    }
}
