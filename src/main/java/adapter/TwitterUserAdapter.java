package adapter;

import lombok.AllArgsConstructor;
import twitter.TwitterUser;
import user.User;

import java.util.Date;

@AllArgsConstructor
public class TwitterUserAdapter implements User {
    private TwitterUser user;

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
